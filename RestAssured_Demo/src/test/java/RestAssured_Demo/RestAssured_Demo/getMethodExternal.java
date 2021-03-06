package RestAssured_Demo.RestAssured_Demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getMethodExternal {

	public static void main(String[] args) {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/users";
		Response res = RestAssured.get();
		System.out.println(res.statusCode());
		System.out.println(res.asString());
		/*List<String> liUsername = res.jsonPath().getList("username");
		for(String uname:liUsername) {
			System.out.println(uname);
		}
		System.out.println(res.jsonPath().getString("username"));*/
		System.out.println(res.jsonPath().getString("company.name[4]"));
		//List<Map<String, String>> mapCompany = (List<Map<String, String>>) new HashMap<String, String>();
		List<Map<String, String>> mapCompany =res.jsonPath().getList("company");
		System.out.println(mapCompany);
		for(int i=0;i<mapCompany.size();i++) {
			System.out.println(mapCompany.get(i).get("name")+"\t || "+mapCompany.get(i).get("catchPhrase")+"\t || "+
					mapCompany.get(i).get("bs"));
		}
		
		//Core Java, Selenium, GIT, Maven, Extent Reports, Agile, Manual Testing, Web Services(SOAP,REST)PostMAn, RestAssured, Ready API, Groovy script
		
		//PROTRACTOR, Java Script  --> Vinodh
		//TestNg, Mobile Automation, Jenkins, cucumber, JIRA, Framework, Unix commands, SQL, JMeter(time constraint)
		
}

}
