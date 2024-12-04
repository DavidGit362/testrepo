package Stefimam.Project;

import org.testng.annotations.Test;

public class Facebook extends baseClass{

	//public static void main(String[] args) {
	@Test
	public void tc01() {
		browserLaunch("chrome");
	}
	
	@Test
	public void  tc02() {
		urlLaunch("https://www.facebook.com/?_rdr");
	}
	
	@Test
	public void tc03() {
		
		POM pom=new POM();
		sendValues(pom.getUsername(), "david test");

	}

}
