package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.objectrepository.AddTariffPlanPage;
import com.telecom.resources.CommmonActions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddTariffPlanSteps extends CommmonActions {
	CommmonActions com = new CommmonActions();
	AddTariffPlanPage atp = new AddTariffPlanPage();

	
	

	@Given("user launche demo telecom application")
	public void user_launche_demo_telecom_application() {
		
		
	}

	@Given("user click add tariff plan button")
	public void user_click_add_tariff_plan_button() {
		com.addTariffPlan(atp.getAddtariffplanbutton());
		
		//com.addTariffPlan(driver.findElement(By.xpath("(//a[contains(text(),'Add Tariff Plan')])[2]")));
		//driver.findElement(By.xpath("(//a[contains(text(),'Add Tariff Plan')])[2]")).click();
		
	}

	// 1 dimensional list

	@When("user fill all the fields by one dimensional list concept")
	public void user_fill_all_the_fields_by_one_dimensional_list_concept(DataTable dataTable) {
		List<String> amount = dataTable.asList(String.class);
		
		com.insertText(atp.getRental(), amount.get(0));
		com.insertText(atp.getLocalmin(), amount.get(1)); 
		com.insertText(atp.getIntermin(), amount.get(2));
		com.insertText(atp.getSmspack(), amount.get(3));
		com.insertText(atp.getMincharge(), amount.get(4));
		com.insertText(atp.getIntercharge(), amount.get(5));
		com.insertText(atp.getSmscharge(), amount.get(6));
		

//		driver.findElement(By.id("rental1")).sendKeys(amount.get(0));
//		driver.findElement(By.id("local_minutes")).sendKeys(amount.get(1));
//		driver.findElement(By.id("inter_minutes")).sendKeys(amount.get(2));
//		driver.findElement(By.id("sms_pack")).sendKeys(amount.get(3));
//		driver.findElement(By.id("minutes_charges")).sendKeys(amount.get(4));
//		driver.findElement(By.id("inter_charges")).sendKeys(amount.get(5));
//		driver.findElement(By.id("sms_charges")).sendKeys(amount.get(6));
	}

	// 1 dimensional map

	@When("user fill all the fields by one dimensional map concept")
	public void user_fill_all_the_fields_by_one_dimensional_map_concept(DataTable dataTable) {
		Map<String, String> amount = dataTable.asMap(String.class, String.class);
		driver.findElement(By.id("rental1")).sendKeys(amount.get("rental1"));
		driver.findElement(By.id("local_minutes")).sendKeys(amount.get("local_minutes"));
		driver.findElement(By.id("inter_minutes")).sendKeys(amount.get("inter_minutes"));
		driver.findElement(By.id("sms_pack")).sendKeys(amount.get("sms_pack"));
		driver.findElement(By.id("minutes_charges")).sendKeys(amount.get("minutes_charges"));
		driver.findElement(By.id("inter_charges")).sendKeys(amount.get("inter_charges"));
		driver.findElement(By.id("sms_charges")).sendKeys(amount.get("sms_charges"));
	}

	// Scenario outline

	@When("user fill all the fields {string},{string},{string},{string},{string},{string},{string}")
	public void user_fill_all_the_fields(String string, String string2, String string3, String string4, String string5,
			String string6, String string7) {
		driver.findElement(By.id("rental1")).sendKeys(string);
		driver.findElement(By.id("local_minutes")).sendKeys(string2);
		driver.findElement(By.id("inter_minutes")).sendKeys(string3);
		driver.findElement(By.id("sms_pack")).sendKeys(string4);
		driver.findElement(By.id("minutes_charges")).sendKeys(string5);
		driver.findElement(By.id("inter_charges")).sendKeys(string6);
		driver.findElement(By.id("sms_charges")).sendKeys(string7);
	}

	@When("user click  the submit button")
	public void user_click_the_submit_button() {
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Then("user confirms the add plan")
	public void user_confirms_the_add_plan() {
		driver.findElement(By.xpath("//h2[contains(text(),'Congratulation you add Tariff Plan')]")).isDisplayed();

	}

	@Then("user verify the text is equals")
	public void user_verify_the_text_is_equals() {
		WebElement confirmNote = driver
				.findElement(By.xpath("//h2[contains(text(),'Congratulation you add Tariff Plan')]"));
		String textmsg = confirmNote.getText();
		System.out.println(textmsg);
		Assert.assertEquals("Congratulation you add Tariff Plan", textmsg);
		
	}

}
