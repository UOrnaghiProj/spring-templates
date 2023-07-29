# Simple MVC server-side app with Mongo DB
this repository contains a simple Cotroller Api that expose two html pages:  
- `mvc-mongodb\src\main\resources\templates\showusers.html`  
- `mvc-mongodb\src\main\resources\templates\showusers.html`  
the spring MVC is used with thymeleaf for elaborate data into the HTML pages   

## Before run the application
Suggest to use Docker to run the MongoDB    
https://hub.docker.com/_/mongo  
- Create a DB called `mydatabase`  
- Create a collection `users`
Use the same settings you find in the file `application.properties`

## Other components
Webflux is used for create a client connection to a server  
`mvc-mongodb\src\main\java\com\springboot\template\mvcmongodb\utility\DataLoader.java`