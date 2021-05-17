**TokenManagement**

Developed with Spring Boot and JPA
- Generate UUID Token
- Validate Token Duration


**Get Token Request**

Url: localhost:8081/token-management/get-token

Json:

`{
  "appName" : "portal_personas",
  "durationInHours" : "2"
}`

**Validate Token Request**

Url: localhost:8081/token-management/validate-token

Json:

`{
  "token" : "f9f2fabc-7c6b-4d62-359ccf05d19e",
  "appName" : "portal_personas"
}`


