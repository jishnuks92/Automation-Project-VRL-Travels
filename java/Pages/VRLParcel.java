package Pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class VRLParcel {
WebDriver driver;
public VRLParcel(WebDriver driver)
{
	this.driver=driver;
}
public void parcel() {
	

	
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.findElement(By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[2]/a")).click();
	
	Set <String> newwindowhandle =driver.getWindowHandles();
	Iterator<String> itr=newwindowhandle.iterator();
	String newwindow=itr.next();
	String oldwindow=itr.next();
	driver.switchTo().window(newwindow);
	driver.switchTo().window(oldwindow);
	
	driver.findElement(By.id("txtGRNNo")).sendKeys("VRL123");
	driver.findElement(By.xpath("//*[@id=\"btnSearch\"]")).click();
	
}
}
