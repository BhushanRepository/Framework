package com.sr.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(id="course")
	private WebElement coursetab;
	
	public WebElement getCoursetab() {
		return coursetab;
	}
	@FindBy(xpath="a[text()='selenium Training']" )
	private WebElement seleniumtraining;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void seleniumtrainigbtn() {
		seleniumtraining.click();
	}
}
