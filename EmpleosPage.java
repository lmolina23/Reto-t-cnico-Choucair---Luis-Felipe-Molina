package com.choucair;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.AWTException;	
import java.awt.Robot;
import java.awt.event.InputEvent;

public class EmpleosPage extends BasePage {
	
	By empleosLink = By.xpath("//a[contains(text(),'Empleos')]");
	By portalEmpleosLink = By.xpath("//span[contains(text(),'empleos')]");
	By cookieBoton = By.xpath("//a[contains(text(),'ACEPTAR')]");
	By magnetoTexto = By.xpath("//a[contains(text(),'Magneto Empleos')]");
	
	///////////////////////////////////////////////////////////////////////////
	public EmpleosPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}//////////////////////////////////////////////////////////////////////////
	
 public void portalEmpleos () throws InterruptedException, AWTException {
		
	 
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
		//click(magnetoTexto);
	}
	
	/*public String registerCorrectMessage () {
		
		WebElement message = findElement(registerConfirmation);
		return getText(registerConfirmation);
	}*/

}
