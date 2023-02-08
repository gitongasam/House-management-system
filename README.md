# House-management-system microservice using springboot
Microservice on house-management-system
using springboot  
learn and understand the flow of springboot microservice

# USER MICROSERVICE RUNNING IN PORT 8080  
http:localhost:8080/api/auth/signup,
http:localhost:8080/api/auth/signin,
get by Id  http:localhost:8080/api/auth/{id}
http:localhost:8080/api/auth/find-all
# House microservice running on port 8081
http:localhost:8081/house/save-house
Get by id- http:localhost:8081/house/{id}
http:localhost:8081/house/find-all

# Booking microservice running on port 8082
I have connected the user microservice and house microservice
to communicate with each other using Rest template
for booking http:localhost:8082/booking/
geting the order http:localhost:8082/booking/{id}




