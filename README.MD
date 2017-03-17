You can choose profile environment on runtime such as local, dev, staging, prod 
  -Dspring.profiles.active=dev 

You can start up defining port number on runtime 
  -Dport=8101

Usage: 
java -Dspring.profiles.active=dev -Dport=8101 -jar customer-service-xxx.jar 
