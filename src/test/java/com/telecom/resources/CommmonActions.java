package com.telecom.resources;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommmonActions {
	public static WebDriver driver;

	public void launch(String url) {
		WebDriverManager.chromedriver().setup();

		// to handle UnHandledAlert Exception.
		DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
		chromeCapabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);

		// to configure chrome.
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		// to remove
		options.setExperimentalOption("excludeSwitches",

				Arrays.asList("disable-popup-blocking"));

		// application run in background.
		options.addArguments("headless");

		// to use both chromeCapabilities and options in ChromeDriver.
		chromeCapabilities.setCapability(ChromeOptions.CAPABILITY, options);

		driver = new ChromeDriver(chromeCapabilities);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void insertText(WebElement ele, String value) {
		ele.sendKeys(value);

	}

	public void addTariffPlan(WebElement ele) {
		ele.click();

	}

}
