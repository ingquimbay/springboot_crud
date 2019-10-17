# springboot_crud
A RESTful services app created with spring boot and MySQL.

**GET all employees**
*http://localhost:8080/api/employees/*

**GET employee by id**
*http://localhost:8080/api/employees/{id}*

**POST Create an employee**
*http://localhost:8080/api/employees/*

body example: 
```
{
	"first_name" : "Nadia",
	"last_name" : "Hook",
	"job_title" : "Server Admin",
	"email" : "hook.nadia@email.com",
	"salary" : "34000"
}
```

**PUT update an employees**
*http://localhost:8080/api/employees/*

body example: 
```
{
	"id" : "37270",
	"email" : magran.yovo@email.com",
}
```

**DELETE employee by id**
*http://localhost:8080/api/employees/{id}*
