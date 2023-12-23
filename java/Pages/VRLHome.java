package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class VRLHome{
WebDriver driver;

public VRLHome(WebDriver driver)
{
	this.driver=driver;
	
	
}

public void titleverification()

{String actualtitle=driver.getTitle();
	//System.out.print(actualtitle);
	String expectedtitle="Vijayanand Travels Private Ltd | ONLINE BUS TICKET BOOKINGS & TRAVEL SERVICES";
			
	if(actualtitle.equals(expectedtitle)) {
		System.out.println("Title verification passed");
	}
		else {
			System.out.println("Title verification failed");
		}
	}

public void busesoncontract() {
	WebElement busoncnt=driver.findElement(By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[4]/a"));
	String buscntbtn=busoncnt.getAttribute("class");
	//System.out.println(buscntbtn);
	busoncnt.click();
	String exptbtnname="buscharter";
	
	if(buscntbtn.equals(exptbtnname))
	{
		System.out.println("Button test passed");
	}
	else {
		System.out.println("button test failed");
	}
}

public void linkno()
{
	List<WebElement>li=driver.findElements(By.tagName("a"));
	//int listno=li.size();
	//int actno=40;
	System.out.println("Total no of links "+li.size());
	
}
 public void register()
 {
	 String pgs=driver.getPageSource();
	 if(pgs.contains("Register"))
	 {System.out.print("Page contains Register text ");
	 
	 }
	 else {
		 System.out.println("Page does not contain register text");
	 }
 }
 public void cityfield()
 {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,500)","");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 WebElement cityelements=driver.findElement(By.xpath("//*[@id=\"FromCity\"]"));
	 Select city=new Select(cityelements);
	
	 List<WebElement>le=city.getOptions();
	 System.out.println("No of elements in city "+le.size());
 }
 
 public void logo()
 {
	 boolean logo=driver.findElement(By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[1]/a/img")).isDisplayed();
	 
	 if(logo) {System.out.println("logo present");
	 }
	 else {
		 System.out.println("logo not present");
	 }
 } 
	
 public void roundtrip() {
	 
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,500)","");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 
	 driver.findElement(By.xpath("//*[@id=\"myTab\"]/li[2]/a")).click();
 }
	public void valuepassing() {
		
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)","");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	     
	     
	//driver.findElement(By.id("FromCity")).sendKeys(Keys.CONTROL + "a");
	//driver.findElement(By.id("FromCity")).sendKeys(Keys.BACK_SPACE);
	driver.findElement(By.id("FromCity")).sendKeys("ALMATTI");
	
	//driver.findElement(By.id("ToCity")).sendKeys(Keys.CONTROL + "a");
	//driver.findElement(By.id("ToCity")).sendKeys(Keys.BACK_SPACE);
	driver.findElement(By.id("ToCity")).sendKeys("BANGALORE");
	
	driver.findElement(By.id("txtFromDate")).sendKeys(Keys.CONTROL + "a");
	driver.findElement(By.id("txtFromDate")).sendKeys(Keys.BACK_SPACE);
    driver.findElement(By.id("txtFromDate")).sendKeys("25-12-2023");
    
   driver.findElement(By.xpath("//button[text()='SEARCH']")).click(); 
    
    
}	
	public void screenshot() throws IOException {
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File("D:\\software testing-luminar\\final project\\VRL TRAVELS_DATA\\homescr.jpg"));
		
	}
}		
		
		
		
	

