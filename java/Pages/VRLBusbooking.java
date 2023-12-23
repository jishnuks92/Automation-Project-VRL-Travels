package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VRLBusbooking {
WebDriver driver;
public VRLBusbooking (WebDriver driver)
{this .driver= driver;

}

public void setfield() {
	driver.findElement(By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[4]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"txtcontactPerson\"]")).sendKeys("Arun");
	driver.findElement(By.xpath("//*[@id=\"txtEmail\"]")).sendKeys("arn@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"txtMobileNo\"]")).sendKeys("9869968632");
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,500)","");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
		
	//List<WebElement>lr=tour.getAllSelectedOptions();
	driver.findElement(By.xpath("//*[@id=\"txtFromCity\"]")).sendKeys("Thiruvananthapuram");
	driver.findElement(By.xpath("//*[@id=\"txtToCity\"]")).sendKeys("Kottayam");
	
	
 
	
	driver.findElement(By.id("TourCategory")).sendKeys(Keys.CONTROL +"a");
	driver.findElement(By.id("TourCategory")).sendKeys(Keys.BACK_SPACE);
	driver.findElement(By.id("TourCategory")).sendKeys("Corporate Tour");
			
			
	driver.findElement(By.xpath("//*[@id=\"txtFromDate\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"txtFromDate\"]")).sendKeys("20-12-2023");
	
	
	driver.findElement(By.xpath("//*[@id=\"txtToDate\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"txtToDate\"]")).sendKeys("21-12-2023");
	
	
	
	driver.findElement(By.id("txtPickupHour")).sendKeys(Keys.CONTROL + "a");
	driver.findElement(By.id("txtPickupHour")).sendKeys(Keys.BACK_SPACE);
	driver.findElement(By.id("txtPickupHour")).sendKeys("04");

	
	driver.findElement(By.id("txtPickMinute")).sendKeys(Keys.CONTROL + "a");
	driver.findElement(By.id("txtPickMinute")).sendKeys(Keys.BACK_SPACE);
	driver.findElement(By.id("txtPickMinute")).sendKeys("30");
	
	driver.findElement(By.id("txtPickTimeRange")).sendKeys(Keys.CONTROL + "a");
	driver.findElement(By.id("txtPickTimeRange")).sendKeys(Keys.BACK_SPACE);
	driver.findElement(By.id("txtPickTimeRange")).sendKeys("AM");
	
	
    driver.findElement(By.xpath("//*[@id=\"txtPickup\"]")).sendKeys("bus stand");
    
    
    driver.findElement(By.id("BusType")).sendKeys(Keys.CONTROL + "a");
    driver.findElement(By.id("BusType")).sendKeys(Keys.BACK_SPACE);
    driver.findElement(By.id("BusType")).sendKeys("MULTI AXLE VOLVO B11R A/C SEMI SLEEPER - 52 Seats");
	
	driver.findElement(By.xpath("//*[@id=\"txtnoOfPassenger\"]")).sendKeys("2");
	
	
	driver.findElement(By.xpath("//*[@id=\"txtremarks\"]")).sendKeys("needs quick dealings");
	
	driver.findElement(By.xpath("//div//input[@type='button']")).click();
	
	
	
}}

	//driver.findElement(By.xpath("//div//input[@type='button']")).click();
	
	
	/*
	
	driver.findElement(By.id("TourCategory")).click();
	
	List<WebElement>li= driver.findElements(By.xpath("//*[@id=\"TourCategory\"]"));
	
	System.out.print(li);
	for(int i=0;i<li.size();i++)
	{
		System.out.println(li.get(i).getText());
		if(li.get(i).getText().contains("TourCategory-option-2")){
			li.get(i).click();
			break;
			
		}}
		
	*/

