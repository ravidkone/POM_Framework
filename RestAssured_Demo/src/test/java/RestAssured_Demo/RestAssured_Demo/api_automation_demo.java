package RestAssured_Demo.RestAssured_Demo;

import java.util.HashMap;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class api_automation_demo {

	public static void main(String[] args) {
		
		String sHostName="https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";
		String URI="/login";
		String URL = sHostName+URI;
		
		RestAssured.baseURI=URL;
		Response res = RestAssured.given().body("{\"username\":\"mithun@ta.com\",\"password\":\"mithun\"}").
				contentType("application/json").post();
		
		System.out.println(res.asString());//whole response im printing
		System.out.println(res.statusCode());
		
		//Parsing the json response of the API
		String sToken = res.jsonPath().getString("token").toString();
		System.out.println(sToken);
		sToken=sToken.replaceAll("\\[", "").replaceAll("\\]", "");
		 String sUserID=res.jsonPath().getString("userid").toString();
		 sUserID=sUserID.replaceAll("\\[", "").replaceAll("\\]", "");
		 //Get Data
		 System.out.println("*****************************************************");
		 System.out.println("*******************    Add DATA	*******************");
		 System.out.println("*****************************************************");
		/*URI="/getdata";
		URL = sHostName+URI;
		System.out.println();
		HashMap<String, String> mapToken = new HashMap<String, String>();
		mapToken.put("token",sToken);
		RestAssured.baseURI=URL;
		Response res1=RestAssured.given().contentType("application/json").headers(mapToken).get();
		System.out.println(res1.asString());
		System.out.println(res1.statusCode());
		System.out.println(res1.jsonPath().getString("data"));
		System.out.println(res1.jsonPath().getList("data[0].salary"));
		List<String> liSalary = res1.jsonPath().getList("data[0].salary");
		System.out.println(liSalary.size());
		System.out.println(liSalary.get(1));
		*/
		//log4j -->
		//10minutes
		/*
		Given --> <credentials> --> prerequisite
		When  --> i say login  --> What need to be done
		Then --> login should happen --> what needs to be validated after the action
		*/
		 URI="/addData";
		 URL = sHostName+URI;
		 System.out.println();
			HashMap<String, String> mapToken = new HashMap<String, String>();
			mapToken.put("token",sToken);
			RestAssured.baseURI=URL;
			String sAccountNumber="10998886";
			
			Response res2 = RestAssured.given().body("{\"accountno\":\""+sAccountNumber+"\",\"departmentno\":\"1\",\"salary\":\"998877\",\"pincode\":\"998877\"}").when().
					contentType("application/json").headers(mapToken).post();
			System.out.println(res2.asString());
			System.out.println(res2.statusCode());
			
			URI="/getdata";
			URL = sHostName+URI;
			RestAssured.baseURI=URL;
			Response res1=RestAssured.given().contentType("application/json").headers(mapToken).get();
			System.out.println(res1.asString());
			System.out.println(res1.jsonPath().getList("data[0].accountno"));
			int setIndex = 0;
			List<Integer> liAccount = res1.jsonPath().getList("data[0].accountno");
			for(int i=0;i<liAccount.size();i++) {
				System.out.println(liAccount.get(i));
				if(String.valueOf(liAccount.get(i)).equals(sAccountNumber)) {
					setIndex=i;
					break;
				}
				
			}
			
			String id = res1.jsonPath().getString("data[0].id["+setIndex+"]");
			System.out.println(id);
			//login -->
			URI = "/updateData";
			URL = sHostName+URI;
			sAccountNumber=String.valueOf((Integer.parseInt(sAccountNumber)+1));
			RestAssured.baseURI=URL;
			Response resUpdateData = RestAssured.given().
		body("{\"accountno\":\""+sAccountNumber+"\",\"departmentno\":1,\"salary\":99677,\"pincode\":996677,\"userid\":\""+sUserID+"\",\"id\":\""+id+"\"}").when()
		.contentType("application/json").headers(mapToken).put();
			System.out.println(resUpdateData.asString());
			
			URI="/getdata";
			URL = sHostName+URI;
			RestAssured.baseURI=URL;
			res1=RestAssured.given().contentType("application/json").headers(mapToken).get();
			System.out.println(res1.asString());
			
	}

}
