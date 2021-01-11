<?php
    $servername = "127.0.0.1";
    $username = "root";
    $password = "oracle123@";
    $dbname = "fieldService";

    $connection = new mysqli($servername, $username, $password, $dbname);

    if ($connection->connect_error){
        die("Connection Failed: ". $connection->connect_error);
    }

    $query = "INSERT INTO ACTIVITY_TYPE (ACTIVITY_TYPE_CODE, ACTIVITY_TYPE_NAME, DURATION, COLOR, IS_ENABLED, AVAILABLE_TIME_SLOT) 
    VALUES (102, 'Upgrade', 3, '#3498db', true, '11-16')";
    
    if($connection->query($query)==TRUE){
        echo "Success";
    }
    else {
        echo "Error: ". $query . "result" . $connection->error;
    }

    $connection->close();
?>
