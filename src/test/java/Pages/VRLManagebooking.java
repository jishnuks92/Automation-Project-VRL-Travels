package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class VRLManagebooking {
WebDriver driver;

public VRLManagebooking (WebDriver driver) {
	this.driver=driver;
}
public void mybookling() {
	
	
	driver.findElement(By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[3]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[3]/ul/li[1]/a")).click();
	
	driver.findElement(By.xpath("//*[@id=\"txtPhoneNo\"]")).sendKeys("arn@gmail.com");
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/section[1]/div/div[2]/div[2]/div[2]/button")).click();
}


public void modifybooking() {
	


	driver.findElement(By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[3]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[3]/ul/li[2]/a")).click();
	
	driver.findElement(By.xpath("//*[@id=\"txtPNR\"]")).sendKeys("9856685695");
	//driver.findElement(By.xpath("//*[@id=\"txtFromDate\"]")).sendKeys("20-12-2023");
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,300)","");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	

	driver.findElement(By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div/div/div[4]/input")).sendKeys("arn@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div/div/div[5]/input")).sendKeys("9874563216");
	

	driver.findElement(By.xpath("//button[text()='Submit']  ")).click();
	
	//driver.findElement(By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div/div/div[6]/button")).click();
}
public void cancellation() {
	
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,250)","");
	
	driver.findElement(By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[3]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[3]/ul/li[3]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"txtPNR\"]")).sendKeys("9856685699");
	
	driver.findElement(By.xpath("//*[@id=\"txtFromDate\"]")).sendKeys("25-12-2023");
	
	driver.findElement(By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div/div/div[4]/input")).sendKeys("arn@gmail.com");
	
	driver.findElement(By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div/div/div[5]/input")).sendKeys("9874563216");
	
	driver.findElement(By.xpath("//div[@class='managepnr managebutton']"));
	//driver.findElement(By.xpath("//button[text()='Submit']")).click();
	
	//driver.findElement(By.xpath("//span[contains(text(),'button')]")).click();
	//button[text()='Generate OTP']
	
	//*[@id="demo"]/section[2]/div/div/div/div/div[6]/button
	
	
	
	
}
}
