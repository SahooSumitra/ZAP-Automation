package com.Mohs10.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Mohs10.utility.ExtentReport;
import com.Mohs10.utility.Log;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.zaproxy.clientapi.core.ApiResponse;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartBrowser {
	EdgeOptions edgeOptions = new EdgeOptions();
	FirefoxOptions fireOptions = new FirefoxOptions();
	ChromeOptions chromeOptions = new ChromeOptions();
	public static WebDriver driver;
	public static Properties prop;

	// set up report
	public static ExtentReports extent;
	 public static ExtentTest parentTest;
	 public static ExtentTest childTest;
	 ExtentSparkReporter sparkReporter;
	 static final String ZAP_PROXY_ADDRESS = "localhost";
	 static final int ZAP_PROXY_PORT = 8080;
	 static final String ZAP_API_KEY = "1eq8gn72ermkelgkb9vub8c4mn";
	 private ClientApi api;
	 ChromeOptions options ;

	// loadConfig method is to load the configuration
	@BeforeSuite(groups = { "Smoke", "Sanity", "Regression" })
	public void loadConfig() throws Throwable {
		extent = new ExtentReports(); // Initialize the extent variable
		ExtentReport.setExtent();
		DOMConfigurator.configure("C:\\Users\\DELL\\Downloads\\Production-Painite_Aug_2023 (1)\\Production-Painite_Aug_2023\\src\\main\\resources\\log4j2.xml");
		Log.info("This is before test method");

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/resources/Config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeMethod
	public void methodName(Method method) {
		// Create a parent test in the extent report with the name of the test method
		parentTest = extent.createTest(method.getName());
	}

	@Parameters(value = { "browser" })
	//@BeforeClass
	/*public void browserSetup(String browserName) throws Throwable {

		// Setup WebDriver for browsers
		if (browserName.equalsIgnoreCase("chrome")) {
			System.out.println("Chrome browser started");
			try {
				driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			System.out.println("Firefox browser started");
			try {
				driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), fireOptions);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		} else if (browserName.equalsIgnoreCase("Edge")) {
			System.out.println("Edge browser started");

			try {
				driver = new RemoteWebDriver(new URL("http://localhost:4444/"), edgeOptions);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		// Handle other browsers or invalid browser names
		else {
			Reporter.log("Invalid browser name provided: " + browserName, true);
			return;
		}

		// Maximize the browser window
		driver.manage().window().maximize();
		// Delete all the cookies
		driver.manage().deleteAllCookies();
		// Set Implicit TimeOuts
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Set PageLoad TimeOuts
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	}*/
	
	@BeforeClass
	  public void beforeClass() {
		 String proxyServerUrl = ZAP_PROXY_ADDRESS + ":" + ZAP_PROXY_PORT;
			Proxy proxy = new Proxy();
			proxy.setHttpProxy(proxyServerUrl);
			proxy.setSslProxy(proxyServerUrl);
			ChromeOptions co = new ChromeOptions();
			co.setAcceptInsecureCerts(true);
			co.setProxy(proxy);
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			api= new ClientApi(ZAP_PROXY_ADDRESS,ZAP_PROXY_PORT, ZAP_API_KEY);
			}
	
	
	@AfterMethod
	  public void tearDown() { if(api !=null) {
		  String title = "demowebshop Website ZAP Security Report";
		  String template = "traditional-html";
		  String description = "this demo is mohs10 zap security test report";
		  String reportfilename = "demowebshop-zap-report.html";
		  String targetFolder = System.getProperty("user.dir");
		  try{
			  ApiResponse response =
	  api.reports.generate(title, template, null, description, null, null, null,
	  null, null, reportfilename, null, targetFolder, null);
	  System.out.println("ZAP report generated at this location:" +
	  response.toString()); } catch (ClientApiException e) { // TODO Auto-generated catch block
		  e.printStackTrace(); } } }

	@AfterClass
	public void afterClass() {
		driver.quit();
		extent.flush();

	}

	@AfterSuite(groups = { "Smoke", "Regression", "Sanity" })
	public void afterSuite() {
		ExtentReport.endReport();
		Log.info("This is After Suite Method");
	}
}
