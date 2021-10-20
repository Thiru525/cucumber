package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomerSteps {
	static WebDriver driver;
	
	@Given("user launches demo telecom application")
	public void user_launches_demo_telecom_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
		driver.findElement(By.xpath("(//a[contains(text(),'Add Customer')])[1]")).click();
	    
	}
	// 1 dimensional list 
	@When("user fill all the fields by one dimensional list method")
	public void user_fill_all_the_fields_by_one_dimensional_list_method(DataTable dataTable) {
		List<String> datas = dataTable.asList(String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(datas.get(0));
		driver.findElement(By.id("lname")).sendKeys(datas.get(1));
		driver.findElement(By.id("email")).sendKeys(datas.get(2));
		driver.findElement(By.name("addr")).sendKeys(datas.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(datas.get(4));
	   
	}
	//1 dimensional map
	@When("user fill all the fields by one dimensional map method")
	public void user_fill_all_the_fields_by_one_dimensional_map_method(DataTable dataTable) {
		Map<String, String> datas = dataTable.asMap(String.class, String.class);
		
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(datas.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(datas.get("lname"));
		driver.findElement(By.id("email")).sendKeys(datas.get("mail"));
		driver.findElement(By.name("addr")).sendKeys(datas.get("adress"));
		driver.findElement(By.id("telephoneno")).sendKeys(datas.get("phone"));
	}
	//Scenario outline
	@When("user fill all the fields {string},{string},{string},{string},{string}")
	public void user_fill_all_the_fields(String fname, String lname, String mail, String adress, String phone) {
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("lname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(mail);
		driver.findElement(By.name("addr")).sendKeys(adress);
		driver.findElement(By.id("telephoneno")).sendKeys(phone);
	}

	@When("user click on the submit button")
	public void user_click_on_the_submit_button() {
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
	   Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed()); 
	}
	@Then("user verify please note down text is visible")
	public void user_verify_please_note_down_text_is_visible() {
	    WebElement pleaseNote = driver.findElement(By.xpath("(//td[@align='center'])[3]"));
	    String  text = pleaseNote.getText();
	    System.out.println(text);
	    Assert.assertEquals("Please Note Down Your CustomerID", text);
	    driver.quit();
	    
	}
	
	

}
