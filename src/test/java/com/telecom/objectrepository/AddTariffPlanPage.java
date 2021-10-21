package com.telecom.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resources.CommmonActions;

public class AddTariffPlanPage extends CommmonActions {
	
	public AddTariffPlanPage() {
		//this will refresh dom structure.
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//a[contains(text(),'Add Tariff Plan')])[2]")
	private WebElement addtariffplanbutton;
	
	@FindBy(id = "rental1")
	private WebElement rental;
	
	@FindBy(id = "local_minutes")
	private WebElement localmin;
	
	@FindBy(id = "inter_minutes")
	private WebElement intermin;
	
	@FindBy(id = "sms_pack")
	private WebElement smspack;
	
	@FindBy(id = "minutes_charges")
	private WebElement mincharge;
	
	@FindBy(id = "inter_charges")
	private WebElement intercharge;
	
	@FindBy(id = "sms_charges")
	private WebElement smscharge;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
	
	//and operation
	@FindBys({
	@FindBy(id = "rental1"),
	@FindBy(id = "local_minutes")
	})
	 
	private WebElement localmin1;
	      
	//or operator
	@FindAll({
		@FindBy(id = "name"),
		@FindBy(id = "local_minutes")
		})
	private WebElement localmin2;

	public WebElement getAddtariffplanbutton() {
		return addtariffplanbutton;
	}

	public WebElement getRental() {
		return rental;
	}

	public WebElement getLocalmin() {
		return localmin;
	}

	public WebElement getIntermin() {
		return intermin;
	}

	public WebElement getSmspack() {
		return smspack;
	}

	public WebElement getMincharge() {
		return mincharge;
	}

	public WebElement getIntercharge() {
		return intercharge;
	}

	public WebElement getSmscharge() {
		return smscharge;
	}

	public WebElement getSubmit() {
		return submit;
	}
	

} 
