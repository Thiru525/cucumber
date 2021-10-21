package com.telecom.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.telecom.resources.CommmonActions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommmonActions {

	CommmonActions com = new CommmonActions();

	@Before
	public void beforeScenario() {
		System.out.println("Before every scenario");
		com.launch("http://www.demo.guru99.com/telecom/index.html");
	}

	@After
	public void afterScenario(Scenario scenario) {
		System.out.println("After every scenario");

		// to take screenshot.
		if (scenario.isFailed()) {

			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

			scenario.embed(screenshot, "image/png");
		} else {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

			scenario.embed(screenshot, "image/png");
		}
		driver.quit();
	}
}
