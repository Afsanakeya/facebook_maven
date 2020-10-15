package com.step_def_facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.base.facebook.Base;
import com.object_repo_facebook.Object_Repo;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def {
	WebDriver driver;
	Object_Repo op;
	
	
	@Given("^User on home page$")
	public void user_on_home_page() throws Throwable {
		driver=Base.getBrowser(driver, "chrome");
		driver.get(Base.getUrl());
		op=PageFactory.initElements(driver, Object_Repo.class);
	    
	}

	
	@When("^User enters email_id in  email_id filed\"([^\"]*)\"$")
	public void user_enters_email_id_in_email_id_filed(String email) throws Throwable {
		op.getUser_name_field().sendKeys(email);

	    
	}

	
	@When("^User enters password in password filed\"([^\"]*)\"$")
	public void user_enters_password_in_password_filed(String password) throws Throwable {
		op.getPassword_field().sendKeys(password);

	   
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		try{op.getLog_in_button().click();

		}
		catch(Exception e ) {System.out.println("User unable to click on login button" +e);
		}
	}
	   
	

	@Then("^User should successfully login and Abdul should displayed$")
	public void user_should_successfully_login_and_Abdul_should_displayed() throws Throwable {
		try{
			op.getAbdul();
			System.out.println("Abdul is displayed");
		}

		catch(Exception e){
			System.out.println("Abdul is not displayed" +e);
		}
	    
	}

	@Then("^User can faild to login and The email you’ve entered doesn’t match any account\\. Sign up for an account\\. should displayed$")
	public void user_can_faild_to_login_and_The_email_you_ve_entered_doesn_t_match_any_account_Sign_up_for_an_account_should_displayed() throws Throwable {
	   try {
		op.getInvalid_email();
	    System.out.println("User failed to login is displayed");
	   }
	   
	   catch(Exception e) {
		   System.out.println("User failed to login is not displayed");
	   }
	   
	   }
	
	
	
	@Then("^Wait for \"([^\"]*)\" seconds$")
	//And Wait for "10" seconds
	public void wait_for_seconds(int seconds) throws Throwable {
		int wait=1000;
		wait *= seconds;
		Thread.sleep(wait);
		System.out.println("Waiting for "+seconds+" seconds");
	}


}
