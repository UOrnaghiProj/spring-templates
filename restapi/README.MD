# Simple Rest Api
this repository contains a simple Rest Api with the most common HTTP methods for retrieving from and sending data to a server.  
GET, POST, PUT, PATCH, and DELETE  
  
### Utility
Data is loaded at start with the help of this utility class  
`restapi\src\main\java\com\springboot\template\restapi\utility\DataLoader.java`
### Configuration
Sample configuration property from inside your project bind to this class:  
`restapi\src\main\java\com\springboot\template\restapi\model\ConfInternal.java`

Sample configuration property extenal like your project  
`restapi\src\main\java\com\springboot\template\restapi\model\ConfExternal.java`

### Database
H2 is used ad a support DB for this template so no need to extra configuration
### Logger
To log all the info i use the Actuator
