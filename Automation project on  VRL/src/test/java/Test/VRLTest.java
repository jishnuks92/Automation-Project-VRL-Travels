package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.VRLBusbooking;
import Pages.VRLHome;
import Pages.VRLLogin;
import Pages.VRLManagebooking;
import Pages.VRLParcel;
import Pages.VRLpage;
import Utilities.Excelutil;

public class VRLTest extends BaseClass{
	@Test
	
	
	
public void testing() throws IOException {
		
	
VRLHome ob=new VRLHome(driver);
	ob.titleverification();
	ob.busesoncontract();
	ob.linkno();
	ob.register();
	ob.cityfield();
	ob.logo();
        ob.roundtrip();
	ob.valuepassing();
        ob.screenshot();


     
      VRLBusbooking ob1=new VRLBusbooking(driver);
       ob1.setfield();
     
      VRLParcel pc=new VRLParcel(driver); 
       pc.parcel();
	
 	
      VRLManagebooking mb=new VRLManagebooking(driver);
       mb.mybookling();
       mb.modifybooking();
       mb.cancellation(); 
	

     VRLLogin ln=new VRLLogin(driver);
       ln.customerlog();
       ln.agentlogin();
       ln.branchlogin();
		

		
		
		
		
		
		/*
		
		String x1="D:\\software testing-luminar\\final project\\VRL TRAVELS_DATA\\VRL_TRAVEL_DATA.xlsx";
		String sheet="Sheet1";
		int rowcount=Excelutil.getrowcount(x1,sheet);
		for(int i =1;i<=rowcount;i++)
		{
			String username=Excelutil.getcellvalue( x1, sheet, i,0);
			System.out.println("username "+username);
			
			String password=Excelutil.getcellvalue(x1, sheet, i, 1);
			System.out.println("password  "+password);
			ln.setvalues(username, password);
			} 
			
		*/
	}
	
}
