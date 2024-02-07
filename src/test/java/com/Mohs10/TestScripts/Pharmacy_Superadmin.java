package com.Mohs10.TestScripts;

//import java.util.Properties;

import org.testng.annotations.Test;

//import com.Mohs10.Base.ScreenRecorderUtil;
import com.Mohs10.Base.StartBrowser;
import com.Mohs10.Base.XLUtils;
import com.Mohs10.Functions.CommonFuns;
//import com.Mohs10.utility.Log;

/*import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;*/

public class Pharmacy_Superadmin extends StartBrowser
{
	
	String excelfile = "D:\\Automation_2024\\Updated-Mamatva-main\\ExcelTestInputData\\Mamatva.xlsx";
	String xlsheet = "Superadmin";
	
	//Add Admin in SuperAdmin
	
//	@Test(priority = 0 ,description="Register Test")
	
	public void PharmacyLoginTestcase() throws Exception {
		CommonFuns hm = new CommonFuns();
		
		String Memailid  = XLUtils.getStringCellData(excelfile, xlsheet, 1, 0);//(rows, columns) 
		String Mpwd      = XLUtils.getStringCellData(excelfile, xlsheet, 1, 1);
		
		String AdminName = XLUtils.getStringCellData(excelfile, xlsheet, 1, 2);
		String Location1 = XLUtils.getStringCellData(excelfile, xlsheet, 1, 3);
		String emailid   = XLUtils.getStringCellData(excelfile, xlsheet, 1, 4);
		String password  = XLUtils.getStringCellData(excelfile, xlsheet, 1, 5);
		
		
		
		hm.MamatvaLogin(Memailid, Mpwd,  AdminName, Location1, emailid, password);  
		
		Thread.sleep(5000);
	}
		
	//Add Location 
	
		@Test(priority = 1 ,description="Register Test")
		
		public void PharmacyLoginTestcase1() throws Exception {
			CommonFuns hm1 = new CommonFuns();
		
		String Memailid  = XLUtils.getStringCellData(excelfile, xlsheet, 2, 0);//(rows, columns) 
		String Mpwd      = XLUtils.getStringCellData(excelfile, xlsheet, 2, 1);
		String Location  = XLUtils.getStringCellData(excelfile, xlsheet, 2, 2);
		
		
		
		hm1.MamatvaLogin(Memailid, Mpwd, Location); 
		
		
		Thread.sleep(5000);
		}
		
  //Delete Location		
		
  //      @Test(priority = 2 ,description="Register Test")
		
		public void PharmacyLoginTestcase2() throws Exception {
			CommonFuns hm2 = new CommonFuns();
			
			String Memailid  = XLUtils.getStringCellData(excelfile, xlsheet, 3, 0);//(rows, columns) 
			String Mpwd      = XLUtils.getStringCellData(excelfile, xlsheet, 3, 1);
			
			hm2.MamatvaLogin(Memailid, Mpwd);
			Thread.sleep(5000);
			
        }
			
        
		//Add User in Admin	
        
	//		@Test(priority = 3 ,description="Register Test")
			
			public void PharmacyLoginTestcase3() throws Exception {
				CommonFuns hm2 = new CommonFuns();
				
				String Memailid   = XLUtils.getStringCellData(excelfile, xlsheet, 4, 0);//(rows, columns) 
				String Mpwd       = XLUtils.getStringCellData(excelfile, xlsheet, 4, 1);
				String Uname      = XLUtils.getStringCellData(excelfile, xlsheet, 4, 2);
				String Uemailid   = XLUtils.getStringCellData(excelfile, xlsheet, 4, 4);
				String Upwd       = XLUtils.getStringCellData(excelfile, xlsheet, 4, 5);
				
				
				hm2.MamatvaLogin1(Memailid, Mpwd, Uname, Uemailid, Upwd);
				Thread.sleep(5000);

         }
}




















        
        
        
        //String Location = XLUtils.getStringCellData(excelfile, xlsheet, 2, 2);


		/*String Memailid = XLUtils.getStringCellData(excelfile, xlsheet, 1, 0);//(rows, columns) 
		String Mpwd = XLUtils.getStringCellData(excelfile, xlsheet, 1, 1);
		
		String AdminName = XLUtils.getStringCellData(excelfile, xlsheet, 1, 2);
		String Location1 = XLUtils.getStringCellData(excelfile, xlsheet, 1, 3);
		String emailid = XLUtils.getStringCellData(excelfile, xlsheet, 1, 4);
		String password = XLUtils.getStringCellData(excelfile, xlsheet, 1, 5);
		
		//String emailid1 = XLUtils.getStringCellData(excelfile, xlsheet, 2, 0);//(rows, columns) 
		//String pwd1 = XLUtils.getStringCellData(excelfile, xlsheet, 2, 1);
		
		
		/*String SName = XLUtils.getStringCellData(excelfile, xlsheet, 1, 2);
		String CntctNum = XLUtils.getStringCellData(excelfile, xlsheet, 1, 3);
		String Email = XLUtils.getStringCellData(excelfile, xlsheet, 1, 4);
		String GSTNum = XLUtils.getStringCellData(excelfile, xlsheet, 1, 5);*/
