# order-dispatcher

end point: http://localhost:8081/order/{itemName}

spring:
  application:
    name: matrix-inventory-dispatcher-local

server:
  port: 8081
  
inventory:
  url: http://localhost:8080
