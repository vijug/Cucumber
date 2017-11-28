package com.BDD.cucumber.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login 
{
	public WebDriver driver;
	
	static{
		String chrome_Key="webdriver.chrome.driver";
	    String chrome_Value="/home/tyss/Desktop/chromedriver";
	    System.setProperty(chrome_Key, chrome_Value);

		
	}

@Given("^Launch the browser$")
public void launch_the_browser() throws Throwable {
     driver = new ChromeDriver();
    throw new PendingException();
}

@Given("^navigate to the application$")
public void navigate_to_the_application() throws Throwable {
    driver.get("http://www.gmail.com");
    throw new PendingException();
}

@When("^In loginPage, enter \"([^\"]*)\"$")
public void in_loginPage_enter(String arg1) throws Throwable {
   
    throw new PendingException();
}

@When("^enter \"([^\"]*)\"$")
public void enter(String arg1) throws Throwable {
    
    throw new PendingException();
}

@When("^yet another action$")
public void yet_another_action() throws Throwable {
    
    throw new PendingException();
}

@Then("^Login should be successfull$")
public void login_should_be_successfull() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^Login should be unsuccessfull$")
public void login_should_be_unsuccessfull() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

}
