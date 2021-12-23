package com.choucair;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.AWTException;	
import java.awt.Robot;
import java.awt.event.InputEvent;

public class VacantesPage extends BasePage{

	By empleosLink = By.xpath("//a[contains(text(),'Empleos')]");
	By portalEmpleosLink = By.xpath("//span[contains(text(),'empleos')]");
	By cookieBoton = By.xpath("//a[contains(text(),'ACEPTAR')]");
	By vacantesLink = By.xpath("//a[contains(text(),'Conoce nuestras vacantes')]");
	By ofertasMessage = By.xpath("//h1[contains(text(),'Ofertas Laborales')]");
	
	///////////////////////////////////////////////////////////////////////////
	public VacantesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}//////////////////////////////////////////////////////////////////////////
	
 public void portalVacantes () throws InterruptedException, AWTException {
		
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 
	 Robot robot = new Robot();
	 	
		click(empleosLink);
		Thread.sleep(2000);
		click(cookieBoton);
		Thread.sleep(2000);
		click(portalEmpleosLink);
		
		robot.mouseMove(650,650);
		robot.delay(1500);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(1500);
		click(vacantesLink);
		
		String winHandleBefore = driver.getWindowHandle();
		
		Thread.sleep(1500);
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
	}
	
	public String ofertasMessage () {
		
		WebElement message = findElement(ofertasMessage);
		return getText(ofertasMessage);

		
	}
}
