package com.choucair;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;	
import java.awt.Robot;
import java.awt.event.InputEvent;


public class RegistrateTest {

	public static void main(String[] args)throws InterruptedException, AWTException
 {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.choucairtesting.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Robot robot = new Robot();
		
		driver.findElement(By.xpath("//a[contains(text(),'Empleos')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'ACEPTAR')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'empleos')]")).click();
		
		robot.mouseMove(650,650);
		robot.delay(1500);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.xpath("//a[contains(text(),'Regístrate')]")).click();
		Thread.sleep(3000);
		WebElement mensaje = driver.findElement(By.xpath("//b[contains(text(),'te encuentras en:')]"));
		Thread.sleep(1000);
		assertEquals("te encuentras en:", mensaje.getText());
		
		System.out.println("te encuentras en:");
		
		driver.quit();

	}

}
