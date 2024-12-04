package Stefimam.Project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM extends baseClass{
	
//Constructor
	
	public POM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	
	
}
