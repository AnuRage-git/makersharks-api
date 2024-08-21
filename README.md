Steps to run the demo API :
1. Launch the project in an editor(Preferably IntelliJ IDEA) and install the dependencies mentioned in the pom.xml file.
2. Launch Postman for API testing and create a new request with the POST method.
3. Select the Body tab and then choose x-www-form-urlencoded for the input method.
4. Add the key value pairs : 'location', 'natureOfBusiness', 'manufacturingProcess'
   (For reference demo hardcoded data see /makersharks-api/src/main/java/com.makersharks/service/SupplierService.java:15)
5. Once entered the data send the request and the JSON response should appear.

6. For OpenAPI documentation, while running the application in the background open a browser of choice and visit http://localhost:8080/v3/api-docs .
