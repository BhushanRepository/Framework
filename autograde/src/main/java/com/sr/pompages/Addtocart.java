package com.sr.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart 
{
	@FindBy(id="add")
	private WebElement addbtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocart;
	
	@FindBy(xpath="//i[@class='fa fa-shopping-cart']")
	private WebElement cart;
	
    @FindBy(xpath="//a[text()='Go to Cart']")
    private WebElement gotocart;
    
    public Addtocart(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    public void addtocartbutton()
    {
    	addtocart.click();
    }
    public void productcart()
    {
    	cart.click();
    }
    public void gotocartbtn()
    {
    	gotocart.click();
    }
    public  WebElement getAddbtn()
    {
    	return addbtn;
    }
    
}
