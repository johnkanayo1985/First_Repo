package AutoTest.OurFirstProject;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends driver {
       
	@Given("^am on the landing page$")
	public void am_on_the_landing_page() throws Throwable {
	driver.manage().window().maximize();
	driver.get("http://automatetillinfinity.co.uk/"); 
	
	}

	@Given("^I enter my username and password$")
	public void i_enter_my_username_and_password() throws Throwable {
	driver.findElement(By.id("usernamelogin")).sendKeys("wegit");
	driver.findElement(By.name("passwd")).sendKeys("12345678");   
		
	}

	@Given("^I click the login button$")
	public void i_click_the_login_button() throws Throwable {
	driver.findElement(By.id("LoginBtn")).click(); 
	
	}

	@When("^I should see the Home page$")
	public void i_should_see_the_Home_page() throws Throwable {
	String Main_title = driver.getTitle();
	String Expected_Title = "Home";
	Assert.assertEquals(Main_title,Expected_Title);
	}

	@When("^I click logout$")
	public void i_click_logout() throws Throwable {
	driver.findElement(By.linkText("Logout")).click();

	}

	@Then("^I should be on the landing page$")
	public void i_should_be_on_the_landing_page() throws Throwable {
	String Main_title = driver.getTitle();
	String Expected_Title = "Login";
	Assert.assertEquals(Main_title,Expected_Title);
	
	}


}
