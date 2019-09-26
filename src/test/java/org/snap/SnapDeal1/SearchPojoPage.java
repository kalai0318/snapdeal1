package org.snap.SnapDeal1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPojoPage extends BaseClass {
	
	public SearchPojoPage() {
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(id="category2Data")
	private WebElement scategory;
	
	@FindBy(xpath="//span[text()='Bluetooth Devices'][1]")
	private WebElement bluet;
	

	public WebElement getBluet() {
		return bluet;
	}


	public WebElement getScategory() {
		return scategory;
	}*/
	

	
   @FindBy(id="inputValEnter")
   private WebElement input;
   
   @FindBy(xpath="//button[@class='searchformButton col-xs-4 rippleGrey']")
   private WebElement search;
   
   @FindBy(xpath="//img[@title='Micromax E4816 ( 64GB , 4 GB ) Champagne']")
   private WebElement micro;
   
   @FindBy(xpath="//div[@id='buy-button-id']")
   private WebElement buynow;
   
   @FindBy(id="username")
   private WebElement uname;
   
   @FindBy(id="login-continue")
   private WebElement contin;
   @FindBy(id="make-payment")
   private WebElement pay;

public WebElement getPay() {
	return pay;
}

public WebElement getContin() {
	return contin;
}

public WebElement getUname() {
	return uname;
}

public WebElement getBuynow() {
	return buynow;
}

public WebElement getMicro() {
	return micro;
}

public WebElement getInput() {
	return input;
}

public WebElement getSearch() {
	return search;
}
}
