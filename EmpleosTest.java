package com.choucair;
import static org.junit.Assert.assertEquals;

import java.awt.AWTException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class EmpleosTest {
	
	private WebDriver driver;
	EmpleosPage empleosPage;

	@Before
	public void setUp() throws Exception {
		
		empleosPage = new EmpleosPage(driver);
		driver = empleosPage.chromeDriverConection();
		empleosPage.visit("https://www.choucairtesting.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException, AWTException {
		empleosPage.portalEmpleos();
		//assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", empleosPage.registerCorrectMessage());
		
	}

}
