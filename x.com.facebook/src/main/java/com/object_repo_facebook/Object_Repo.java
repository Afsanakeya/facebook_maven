package com.object_repo_facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Repo {
	WebDriver driver;
	public Object_Repo(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//*[@id='email']")
	private WebElement email_id_field;

	public WebElement getUser_name_field() {
		return email_id_field;
	}
	
	@FindBy(xpath="//*[@id='pass']")
	private WebElement password_field;
	
	public WebElement getPassword_field() {
		return password_field;
	}
	
	@FindBy (id="u_0_b")
	private WebElement log_in_button;

	public WebElement getLog_in_button() {
		return log_in_button;
	}
	@FindBy(tagName="Abdul")
	private WebElement Abdul;
	public WebElement getAbdul() {
		return Abdul;
	}
	@FindBy(xpath="//*[@id=\"email_container\"]/div[2]/text()")
	private WebElement invalid_email;
	public WebElement getInvalid_email() {
		return invalid_email;
	}
	public void setInvalid_email(WebElement invalid_email) {
		this.invalid_email = invalid_email;
	}
	
	
}
