package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Loginpage extends BaseClass{

	@FindBy(id="email")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;
	
    @FindBy(xpath="//button")
    public WebElement loginBtn;
   
    public Loginpage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    public void loginapplication(String usnm,String pass) {
        username.sendKeys(usnm);
        password.sendKeys(pass);
        loginBtn.click();
    }
    public Dashboardpage validLoginpage() {
    	username.sendKeys("kiran@gmail.com");
    	password.sendKeys("123456");
    	loginBtn.click();
    	return new Dashboardpage(driver);
    }
}
