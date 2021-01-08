package com.oracle.fieldService.security;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import io.helidon.config.Config;
import io.helidon.security.Security;
import io.helidon.security.SubjectType;
import io.helidon.security.integration.webserver.WebSecurity;
import io.helidon.security.providers.httpauth.HttpBasicAuthProvider;
import io.helidon.security.providers.httpauth.SecureUserStore;
import io.helidon.webserver.Routing;
import io.helidon.webserver.WebServer;

public class ApplicationSecurity {

	public static void main(String[] args) {
		Config config = Config.create();
		//ServerConfiguration serverConfiguration = ServerConfiguration.create(config.get("server"));
		
		Map<String, MockUser> users = new HashMap<>();
        users.put("user", new MockUser("user", "user".toCharArray(), Arrays.asList("user")));
        users.put("admin", new MockUser("admin", "admin".toCharArray(), Arrays.asList("user", "admin")));
        SecureUserStore store = user -> Optional.ofNullable(users.get(user));
		
		HttpBasicAuthProvider httpBasicAuthProvider = HttpBasicAuthProvider.builder()
				.realm("fieldService")
				.subjectType(SubjectType.USER)
				.userStore(store)
				.build();
		
		Security security = Security.builder()
				.config(config.get("security"))
				.addAuthenticationProvider(httpBasicAuthProvider)
				.build();
		
		//WebSecurity webSecurity = WebSecurity.create(config);
		WebSecurity webSecurity = WebSecurity.create(security);
		
		Routing routing = Routing.builder()
				.register(webSecurity.securityDefaults(WebSecurity.authenticate()))
				.get("/activities", WebSecurity.allowAnonymous())
				.build();
		
		WebServer webServer = WebServer.create(routing, config.get("server"));
		webServer.start().thenAccept(ws ->
        System.out.println("Server started at: http://localhost:" + ws.port()));
	}
}
