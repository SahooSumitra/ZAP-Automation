package com.Mohs10.OR;

import org.openqa.selenium.By;

public class PharmacySuperadminPage {
	
	
	//Login to the Mamatva Superadmin

	    public static By Memailid = By.xpath("//input[@id='email']");
	    public static By Mpwd = By.xpath("//input[@id='password']");
	    public static By Mloginbtn = By.xpath("//input[@value='LOGIN']");
	
	
	//Add Admin 
	    
		public static By AddAdmin = By.xpath("//a[@href='/superadmin/Addadmin']");
		public static By Name = By.xpath("//input[@id='exampleInputUsername1']");
		public static By Location = By.xpath("//select[@id='locationSelect']");
		public static By emailid = By.xpath("//input[@id='exampleInputUsername3']");
		public static By pwd= By.xpath("//input[@id='exampleInputPassword1']");
		
		public static By Scrolldown= By.xpath
				("//body/div[@class='container-scroller']/div[@class='container-fluid page-body-wrapper']/div[@class='main-panel']/div[@class='content-wrapper']/div[3]/div[1]/div[1]");
		
		public static By checkbox = By.xpath("//input[@id='showPasswordCheckbox']");
		public static By submitbtn= By.xpath("//button[@id='submitButton']");
		
		public static By Regsuccess = By.xpath("//button[@type='submit']");
		public static By MLogout = By.xpath("//p[@class='mb-1 text-white']");
		public static By MSignout = By.xpath("//a[@class='dropdown-item']");
	
	//Add Location
		
	    public static By AddLocation = By.xpath("//span[normalize-space()='Add Location']");
	    public static By Locationfill = By.xpath("//input[@id='Location']");
	    public static By submitbtn1= By.xpath("//button[@type='submit']");   
	    public static By BcktoHome = By.xpath("//button[@type='submit']");
	   
	    public static By MLogout1 = By.xpath("//p[@class='mb-1 text-white']");
	    public static By MSignout1 = By.xpath("//a[@class='dropdown-item']");
	    
	 
	//Delete Location

        public static By AddLoc = By.xpath("//span[normalize-space()='Add Location']");
        public static By Scrolldown1 = By.xpath("//div[@class='content-wrapper']");
        public static By Dltoption = By.xpath("//tbody/tr[26]/td[2]/span[1]/a[1]");
        public static By Dltbutton = By.xpath("//button[normalize-space()='Delete']");
        public static By BcktoHome1 = By.xpath("//button[@type='submit']");
 
        public static By MLogout2 = By.xpath("//p[@class='mb-1 text-white']");
	    public static By MSignout2 = By.xpath("//a[@class='dropdown-item']");


     //Login to the Mamatva Admin

         
        public static By Memailid1 = By.xpath("//input[@id='email']");
        public static By Mpwd1 = By.xpath("//input[@id='password']");
        public static By Mloginbtn1 = By.xpath("//input[@value='LOGIN']");
        
        //Add User 
        
        public static By AddUser = By.xpath("//span[normalize-space()='Add User']");
		public static By UserName = By.xpath("//input[@id='exampleInputUsername1']");
		
		public static By emailid1 = By.xpath("//input[@id='exampleInputUsername3']");
		public static By pwd1= By.xpath("//input[@id='exampleInputPassword1']");
		
	
		public static By Scrolldown2= By.xpath("//div[@class='content-wrapper']");
		public static By checkbox1 = By.xpath("//input[@id='showPasswordCheckbox']");
		
		public static By Role = By.xpath("//select[@id='RoleSelect']");
		                                                                   
		public static By submitbtn2= By.xpath("//button[@id='submitButton']");
		
		public static By BcktoHome2 = By.xpath("//button[@type='submit']");
		 
	    public static By MLogout3 = By.xpath("//p[@class='mb-1 text-white']");
		public static By MSignout3 = By.xpath("//a[@class='dropdown-item']");
		
}
        
        





























//("//select[@id='RoleSelect']//a[@value='ROLE_CONSULTANT']");













//public static By SelectRole = By.xpath("//select[@id='RoleSelect']//a[@value='ROLE_CONSULTANT']");









                                   
                                 
                                   
	    

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    //public static By Scrolldown= By.xpath
	//("//body/div[@class='container-scroller']/div[@class='container-fluid page-body-wrapper']/div[@class='main-panel']/div[@class='content-wrapper']/div[3]/div[1]/div[1]");
//public static By Delete = By.xpath("//tbody/tr[11]/td[2]/span[1]/a[1]");
//public static By Dltoption = By.xpath("//button[normalize-space()='Delete']");
	
	
	
	/*//Edit User
	public static By User = By.xpath("//a[@href='/superadmin/User']");
	
	public static By Edituser = By.xpath("//tbody/tr[1]/td[4]/span[1]/a[1]");
	//public static By dltuser = By.xpath("//div[@class='col-md-12 grid-margin stretch-card']//div[@class='card-body']");
	public static By Username = By.xpath("//input[@id='exampleInputUsername1']");
	public static By Scrolldown1= By.xpath
			("//body/div[@class='container-scroller']/div[@class='container-fluid page-body-wrapper']/div[@class='main-panel']/div[@class='content-wrapper']/div[3]/div[1]/div[1]");
	public static By Submitbtn = By.xpath("//button[@type='submit']");*/
	
	
	
	
	
	
	
    
	
	
	
	
	
	
	
	/*Login (as Superadmin)--> Pharmacy --> Add Supplier --> View Details --> 
	Edit supplier --> Delete the supplier --> Logout
	
	//Login to the Pharmacy Superadmin
	public static By emailid = By.xpath("//input[@id='email']");
	public static By pwd = By.xpath("//input[@id='password']");
	public static By loginbtn = By.xpath("//input[@value='LOGIN']");
    public static By Pharmacy = By.xpath("//img[@alt='Logo 2']");*/
	
/*	// Add Supplier
    public static By supplier = By.xpath("//a[normalize-space()='']");
    public static By Addsupplier = By.xpath("//a[@class='btn btn-danger']");
    public static By SName = By.xpath("//input[@id='SupplierNameInput']");
    public static By CntctNum = By.xpath("//input[@id='ContactNumberInput']");
    public static By Email = By.xpath("//input[@id='EmailInput']");
    public static By GSTNum = By.xpath("//input[@id='Supplier_GST_NumberInput']");
    public static By SaveDet= By.xpath("//button[@type='submit']");
    
    //View details & Edit the Supplier
    public static By ViewDetails = By.xpath("//tbody/tr[1]/td[3]/a[1]");
    public static By EditDetails = By.xpath("//a[@class='btn btn-primary']");
    public static By Email1= By.xpath("//input[@id='EmailInput']");
   
    public static By SaveDetails = By.xpath("//button[@type='submit']");
    
    //Delete the Supplier
    public static By DltSupplier = By.xpath("//a[@class='btn btn-danger']");
    
    //Logout 
    public static By Logout = By.xpath("//a[@role='button']");
    public static By Signout = By.xpath("//a[@class='dropdown-item']");*/



   /*Login (as Superadmin) --> Jyotsna --> 
   Add Admin --> Verify the admin is added in User section --> Logout*/
    
   /* //Add Admin 
    public static By Jyotsna = By.xpath("//img[@alt='Logo 1']");
    public static By AddAdmin = By.xpath("//a[@href='/superadmin/jyotsna/Addadmin']");
    public static By AName = By.xpath("//input[@id='exampleInputUsername1']");
    public static By Location= By.xpath("//select[@id='locationSelect']");
    public static By AEmail= By.xpath("//input[@id='exampleInputUsername3']");
    public static By Password = By.xpath("//input[@id='exampleInputPassword1']");
    public static By Pwdcheckbox= By.xpath("//input[@id='showPasswordCheckbox']");
    public static By Submit = By.xpath("//form[@class='forms-sample']");

    //Verify user & Logout
    public static By Users = By.xpath("//a[@href='/superadmin/jyotsna/User']");
    public static By Logout1 = By.xpath("//a[@role='button']");
    public static By Signout1 = By.xpath("//a[@class='dropdown-item']");

    
    /*Login (as Superadmin) --> Users (Edit/delete) 
      --> Changes should reflect --> Logout*/
    
   /* //User Edit & delete
    public static By Users1 = By.xpath("//a[@href='/superadmin/jyotsna/User']");
    public static By Edit = By.xpath("//tbody/tr[6]/td[4]/span[1]/a[1]");
    public static By UserName = By.xpath("//input[@id='exampleInputUsername1']");
    public static By Submit1 = By.xpath("//form[@class='forms-sample']");
    public static By Delete = By.xpath("//tbody/tr[6]/td[4]/span[2]/a[1]");
    public static By DltBtn = By.xpath("//button[normalize-space()='Delete']");
    
    // Logout
    public static By Users2 = By.xpath("//a[@href='/superadmin/jyotsna/User']");
    public static By Logout2 = By.xpath("//a[@role='button']");
    public static By Signout2 = By.xpath("//a[@class='dropdown-item']");



    /*Login (as Superadmin) --> Reports (select/unselect the checkbox) 
     --> Selected headers should visible --> Logout*/

    /*public static By Reports = By.xpath("//a[@href='/superadmin/jyotsna/Reports']");
    public static By StartDate = By.id("startDate");
    public static By EndDate = By.id("endDate");
    public static By chckboxState = By.xpath("//input[@id='showState']");
    public static By GenerateReport = By.xpath("//button[@id='filterButton']");*/
    
    
    
    /*Login (as Admin) --> Add User --> verify in User --> Delete user --> Logout */
    
    
   /* public static By Login = By.xpath("//input[@id='email']");
    public static By pswd = By.xpath("//input[@id='password']");
    public static By loginbtn1 = By.xpath("//input[@value='LOGIN']");
    public static By Login = By.xpath("//input[@id='email']");
    public static By Login = By.xpath("//input[@id='email']");*/

















	