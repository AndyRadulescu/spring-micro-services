# spring-micro-services

This is a 3 node micro services application. Using docker-compose 3 Java(spring) applications will be downloaded from the Docker Hub.
This is a dummy application, meaning that every node here(3 nodes) represent a number (saved as a docker env variable).
The env variable will be gotten and then compared with the previous number sent through a post request.
The entry node will trigger the calculation of the maximum number.

Tha app as a scheme looks like this:

EntryNode -> Node2 -> Node3. Each node will return the max number to the previus node (ex: Node3-> Node2 -> EntryNode). The result will 
be shown.

To start the calculation: access http://localhost:8081/number/{your first number} (GET).
To change the numbers that fallow to be calculated change {yout first number}, and the ENV variables **NUMBER** in the docker-compose.yml
