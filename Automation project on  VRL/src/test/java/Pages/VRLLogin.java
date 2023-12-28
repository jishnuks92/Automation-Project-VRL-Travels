package Pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.Excelutil;

public class VRLLogin {
	WebDriver driver;
	
	public VRLLogin(WebDriver driver) {
		this.driver=driver;
	}
	public void customerlog() {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,250)","");
				
		 driver.findElement(By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[1]/div[2]/button/span")).click();
		 driver.findElement(By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a")).click();
		 

		 
	     driver.findElement(By.xpath("//*[@id=\"txtPhoneNo\"]")).sendKeys("arn@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Generate OTP']")).click();
		
		///html/body/div[2]/div[3]/div/div[1]/section[1]/div/div[2]/div[7]
		
	}
	/*
	public void setvalues(String username,String password)
	 {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		 driver.findElement(By.xpath("//*[@id=\"txtUserName\"]")).clear();
		 driver.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys(username);
		 
		 driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).clear();
		 driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(password);
		 
		 
	 }
	 */
	public void agentlogin() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[1]/div[2]/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[1]/div[2]/div/ul/li[2]/a")).click();
		
		
		Set <String> newwindowhandle =driver.getWindowHandles();
		Iterator<String> itr=newwindowhandle.iterator();
		String newwindow=itr.next();
		String oldwindow=itr.next();
		driver.switchTo().window(newwindow);
		driver.switchTo().window(oldwindow);
		
		
		
		
		
		driver.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys("arun");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("123");
		
		driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
	}

	public void branchlogin() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[1]/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[1]/div[2]/div/ul/li[3]/a")).click();
		
		Set <String> newwindowhandle =driver.getWindowHandles();
		Iterator<String> itr=newwindowhandle.iterator();
		String newwindow=itr.next();
		String oldwindow=itr.next();
		driver.switchTo().window(newwindow);
		driver.switchTo().window(oldwindow);
		
		
		
		driver.findElement(By.xpath("//*[@id=\"txtUserID\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"txtUserID\"]")).sendKeys("arn");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("qwe");
		
		driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
		
		
	}
}
