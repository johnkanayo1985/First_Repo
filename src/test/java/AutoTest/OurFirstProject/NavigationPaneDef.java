package AutoTest.OurFirstProject;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NavigationPaneDef extends driver {
	
	@When("^I click the trade your Jet tab$")
	public void i_click_the_trade_your_Jet_tab() throws Throwable {
	driver.findElement(By.cssSelector("#TradeYourJetTab>a")).click();  
	
	}

	@Then("^I should be on trade your Jet page$")
	public void i_should_be_on_trade_your_Jet_page() throws Throwable {
	String Actual= driver.findElement(By.cssSelector(".content-header")).getText();  
	String Expected ="Trade your jet";
	Assert.assertEquals(Actual,Expected);  
	}

	@When("^I click on book your jet tab$")
	public void i_click_on_book_your_jet_tab() throws Throwable {
	driver.findElement(By.cssSelector("#bookyourjettab>a")).click();   
	}

	@Then("^I should be on book your jet page$")
	public void i_should_be_on_book_your_jet_page() throws Throwable {
	String Actual= driver.findElement(By.cssSelector(".content-header")).getText();  
	String Expected ="book your jet";
	Assert.assertEquals(Actual,Expected);
	
	}

	@When("^I click on just trade tab$")
	public void i_click_on_just_trade_tab() throws Throwable {
	driver.findElement(By.cssSelector("#justtradetab>a")).click(); 
	}

	@Then("^I should be on just trade page$")
	public void i_should_be_on_just_trade_page() throws Throwable {
	String Actual= driver.findElement(By.cssSelector(".content-header")).getText();  
	String Expected ="just trade";
	Assert.assertEquals(Actual,Expected);
	
	}

	@When("^I click on about us tab$")
	public void i_click_on_about_us_tab() throws Throwable {
	driver.findElement(By.cssSelector("#aboutustab>a")).click();	  
	}

	@Then("^I should be on about us page$")
	public void i_should_be_on_about_us_page() throws Throwable {
	String Actual= driver.findElement(By.cssSelector(".content-header")).getText();  
	String Expected ="about us";
	Assert.assertEquals(Actual,Expected); 
	
	}

	@When("^I click on contact us tab$")
	public void i_click_on_contact_us_tab() throws Throwable {
	driver.findElement(By.cssSelector("#contactsupporttab>a")).click();	 
	}

	@Then("^I should be on contact us page$")
	public void i_should_be_on_contact_us_page() throws Throwable {
	String Actual= driver.findElement(By.cssSelector(".content-header")).getText();  
	String Expected ="contact us";
	Assert.assertEquals(Actual,Expected);    
	}
     
    
}
