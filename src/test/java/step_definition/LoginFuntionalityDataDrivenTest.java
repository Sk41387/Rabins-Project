package step_definition;

import org.openqa.selenium.By;

import base.Main;
import io.cucumber.java.en.When;

public class LoginFuntionalityDataDrivenTest extends Main{

//	@When("user enter valid {string} and valid {string}")
//	public void user_enter_valid_and_valid(String credential1, String credential2) {
//		driver.findElement(By.name("userName")).sendKeys(credential1);
//		driver.findElement(By.name("password")).sendKeys(credential2);
//	}
	
	@When("^user enter invalid \"([^\"]*)\" and invalid \"([^\"]*)\"$")
	    public void user_enter_invalid_something_and_invalid_something
	    (String invalidusername, String invalidpassword) {
		driver.findElement(By.name("userName")).sendKeys(invalidusername);
		driver.findElement(By.name("password")).sendKeys(invalidpassword);
	    }
}
