package RestAssured_Demo.RestAssured_Demo;

public class context {

	public static void main(String[] args) {
/*
 Few companies are still with SoapAPi ---> 0.1
 Few companies are still with SoapAPi and REST API --> 
 Many companies are RESTAPI -->
 
 
 Step 1:
 We launched login url in browser
 
 Step 2:
 Entered Username and Password. Clicked on submit/login button
 
 Who is validating it? database 
 
 
 Browser is talking to database --> Database should be exposed to everyone - this is security problem
 
 Middleware --> Rest Server/ Soap Server
 made login call using some API --> With some details/data -->using REST API - to where? --> Rest Server -->
 Rest Server --> Analyse the data. It will check in DB and says login credentaials are valid or not
 Respond back --> To whomever haas called
 
 Step 3:
 It logedin successfully
  
  
  REST API:
  Whenever we are talking to middlewear. We talk on the API calls. restricted format(Design pattern of the respective compamy)
  
  Request URL: https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/login 
	/login --> API name --> URI(End point)
	https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net --> Host Name --> Where rest server is hosted 
	 /signin, /usersign, /amazonEOlogin
	 /logout
	  
	   URL = hostname+URI
	   homescreen
	   URL = hostname+URI(homescreen)
	  
  will only takes the data. data will be sent to server. 
  
  Positive response --> Return code and Message --> We willl read the required data inside message, If it is failure we will read only failure messages --> 200,201,202,203, 200series are all belongs to success success
  Negative response --> Return code and Message --> REST API -->  
  
  Network Tab in chrome dev tools:
  1. It will tell you about what calls are making from the URL of the tab to where it is going
  
  URL --> hostname + URI
  
  Request Method --> Done
  
  Status Code: --> Done
  
  Request Header -->
  
  
  Request Method--> Identity and type -->8 identities for an API.
  GET: -->getting data --> When i want to get mey details  -->  200 response code
  POST: --> Writing data or validating , Modifiing --> 201
  PUT:  --> Modifing, you cannot write an new data  --> 204
  DELETE: --> Delete data --> 202/203
  
  Payload --> Data to be passed to middlewear or REST server
  
  Response --> Done
  
  content-type: --> Format which the API is using it --> application/json

  
  POSTMAN needs to be installed on your Machine: 
  Developer and QA -->
  
	What is token and session?
	login API --> when i was working just dial(2000-3000), Slingmedia(1500-2000),(4000-5000) --> 
	
	
	1 --> username and password --> validated --> success or failre --> allowed to move further
	---> unique number -->
	SessionID  --> This should be stored in DB till he alive --> This needs to be mapped to the user(Mithun/Srinidhi)
	Whenever any aPI is called with session ID before giving a result he has to validate the session id existing or not
	There should be new space is consuming to store the sessionID, also every time you are validating it, One extra job you have invented to server
	Milisecond 
	
	Token --> username, id, consumerId, phonenumber, logintimestamp+ 10:00 postman --> portal 10:01 
	Depending on your data (Confidential) by using encryption mechanism it is sending the token to it
	Srinidhi --> s019456 -->decrypt directly --> not depend on server to process it. space is required
	
	JWT token -->
  	Base64 format -->
  	
  	API --> User --> FrontEnd (our developer) -->hit login (FE calling login API) --> login API success-->	Front end show the main screen
  	  
  	Automation?
  	
  	
  	
  	Now you guys are aware of how to get the response of API using postman --> POST and GET, DELETE, PUT
  	login API --> token  --> 60% 
  	Getdata API -->
  	You will get an API for adduser --> 
  	Edit API --> 
  	Delete API -->  
  	logout API -->
  	--------------------------------------------------------------------------
  	//This is my application behaviour --> At a time you can work on any one of the application(postman or on web per user)
 
  	login -> Token
  	GetData--> token
  	addUser API --> Create one user  ---> whenever you are trying to see the data in the browser --> 
  	
 	100% both --> 
  	
  	Postman created one token ---> A
  	Postman
  	
  	
  	
  	Real world:
  	CEO/ Board Members / Sales /Marketing team (product base company) // Client -->
  	Functionality of calculator in any one of the tab of my application --> CTO/ Architect /Product Team
  	Product Team sit and analyse how this needs to be built along with the input of stake holders
  	Where this should come/ what all should be there/competators what they have built it/ --> Product team create requirement
  	Hand it over to Developers and Testers(Senior folks) --> time/split this into activity
  	Imaginary --> UI/UX team will sit and desighn how this should look like
  	
  	Front developer will analyse the time for the above given UI/UX desighn
  	
  	Backend developer --> He will tell how many API's are required for this
  	/calc {"a":10,"b":20,"actiontype":"multiplication"} --> 201 --> 401 --> "error message"
  	Time required for this implementation
  	
  	TestArchitect: 
  	Existing calculator --> 
  	
  	Parallel task 
  	1--> Developers will start work on this
  	Front end team start working on the given UI/UX desighn
  	Backend team will start working on API's --> QA --> Give certificationon all the API's 
  	--> validation will be in response (postman) or in database(dev or testing DB) 
  	
  	2.--> Product team will reach out to stake holder and update any corner scenarios which was missed out ii the early stage
  	and time lines 
  	
  	Testcases for application under test: 
  	Automation:
  	
  	APi automation:
  	REST Assured tool --> in some of the front end cases you cannot achieve more number of test cases in terms automation
  	API automation --> maximum you can automate  --> 99% we have automated --> Market, Some body who is good at API testing expecially automation can be easily placeble
  	
  	Front end --> It is not my bug --> empty and then the data shown 
  	Backend person --> this is also not my bug --> I have sent the data
  	
  	Who has bug --> 
  	
  	Improvement front end --> 
  	improvement --> page loading should have been displayed instead of empty table
  	
  	Backend API -->
  	-- Bug form the backend side when you look in the performance aspect
  	-- improvement response is not fast
  	-- get data response slow - huge/lot of data
  	-- pagination --> 10 datas and also he can say how any still are left
  	100 datas --> 10 datas he could have been sent and he also says in the same response, how many page 9 page, total number 93 100 97
  
  	You guy are going on right direction
  
  	
  	can my single server ready to bare all 5000 request? 
  	5100 --> on your test server definatly it will going to break
  	250 -300 request per second. 
  	//company will build there own servers(buy the servers) for their own. Robust(2000 request along with your software suport(server))
  	server will crash or die
  	
  	similar copy of servers you will be placing it
  	21 servers you will be using it --> 5250 request per second
  	Load balancer --> US market think that you have cleared the interview --> 5 -6 years 
  	
  	Micro Services:
  	Server --> Calculator functionality(addition, multiplication, division, subtraction)
  	Box1
  	Box2
  	checkbox
  	submit
  	Result
  	
  	Server1:
  	Hit will hit add API --> V1 and v2 --> Response success,result
  	Hit will hit subtraction API --> V1 and v2 --> Response success,result
  	Hit will hit Multiplication API --> V1 and v2 --> Response success,result
  	All the functionalities can be implemnted in a single code base(in single project, Single jar file), Server will consits of all the 4 functionalites
  	
  	Micro service Concept:
  	Add Server:
  	Sub Server:
  	Multiplication: 
  	Division Server: 
  	
  	
  	Third party servers
  	
  	Wiremock --> read the articles --> you have one week of time --> 
  	
 * */

	}

}
	