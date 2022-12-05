package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboardpage {

	public WebDriver driver;
	@FindBy(xpath="//b[text()='Java By Kiran']")
	 WebElement header;
	
	@FindBy(xpath="//span[text()='Users']")
	 WebElement userBtn;
	
	
	public Dashboardpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public Userpage clickuser() {
		userBtn.click();
		return new Userpage(driver);
	}
	public String getheader() {
		return header.getText();
	}
}
