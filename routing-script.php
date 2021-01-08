<?php
    $servername = "localhost";
    $username = "username";
    $password = "password";
    $dbname = "myDB";

    $connection = new mysqli($servername, $username, $password, $dbname);

    if ($connection->connect_error){
        die("Connection Failed: ". $connection->connect_error);
    }

    $query = "MERGE INTO ACTIVITY_TYPE (ACTIVITY_TYPE_CODE, ACTIVITY_TYPE_NAME, DURATION, COLOR, IS_ENABLED, AVAILABLE_TIME_SLOT) 
    VALUES (101, 'Installation', 3, '#1abc9c', true, '1-16')";
    
    if($connection->query($query)==TRUE){
        echo "Success";
    }
    else {
        echo "Error: ". $query . "result" . $connection->error;
    }

    $connection->close();
?>