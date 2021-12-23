package com.choucair;
import static org.junit.Assert.assertEquals;

import java.awt.AWTException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class VacantesTest {

	private WebDriver driver;
	VacantesPage vacantesPage;

	@Before
	public void setUp() throws Exception {
		
		vacantesPage = new VacantesPage(driver);
		driver = vacantesPage.chromeDriverConection();
		vacantesPage.visit("https://www.choucairtesting.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException, AWTException {
		vacantesPage.portalVacantes();
		assertEquals("Ofertas Laborales", vacantesPage.ofertasMessage());
		System.out.println("Ofertas Laborales");
		
	}
}
