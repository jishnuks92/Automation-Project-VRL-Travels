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
	By login=By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[1]/div[2]/button/span");
	By custlogin=By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a");
	By username=By.xpath("//*[@id=\"txtPhoneNo\"]");
	By genotp=By.xpath("//button[text()='Generate OTP']");
	
	By agentlogin=By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[1]/div[2]/div/ul/li[2]/a");
	By ausername=By.xpath("//*[@id=\"txtUserName\"]");
	By apassword=By.xpath("//*[@id=\"txtPassword\"]");
	By asubmit=By.xpath("//*[@id=\"btnSubmit\"]");		
			
	By branchlogin=By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[1]/div[2]/div/ul/li[3]/a");		
	By busername=By.xpath("//*[@id=\"txtUserID\"]");
	By bpassword=By.xpath("//*[@id=\"txtPassword\"]");
	By bsubmit=By.xpath("//*[@id=\"btnSubmit\"]");
	public VRLLogin(WebDriver driver) {
		this.driver=driver;
	}
	public void customerlog() {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,250)","");
				
		 driver.findElement(login).click();
		 driver.findElement(custlogin).click();
		  
	         driver.findElement(username).sendKeys("arn@gmail.com");
		 driver.findElement(genotp).click();
		
		
		
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
		
		driver.findElement(login).click();
		driver.findElement(agentlogin).click();
		
		
		Set <String> newwindowhandle =driver.getWindowHandles();
		Iterator<String> itr=newwindowhandle.iterator();
		String newwindow=itr.next();
		String oldwindow=itr.next();
		driver.switchTo().window(newwindow);
		driver.switchTo().window(oldwindow);
		
		
		
		
		
		driver.findElement(ausername).sendKeys("arun");
		driver.findElement(apassword).sendKeys("123");
		
		driver.findElement(asubmit).click();
	}

	public void branchlogin() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(login).click();
		driver.findElement(branchlogin).click();
		
		Set <String> newwindowhandle =driver.getWindowHandles();
		Iterator<String> itr=newwindowhandle.iterator();
		String newwindow=itr.next();
		String oldwindow=itr.next();
		driver.switchTo().window(newwindow);
		driver.switchTo().window(oldwindow);
		
		driver.findElement(busername).sendKeys("arn");
		driver.findElement(bpassword).sendKeys("qwe");
		
		driver.findElement(bsubmit).click();
		
		
	}
}
