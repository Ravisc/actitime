package testNGExample;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	@BeforeSuite(groups={"smoke","Regression"})
	public void m1(){
		Reporter.log("beforesuite",true);
	}
	@AfterSuite(groups={"smoke","Regression"})
	public void m2(){
		Reporter.log("aftersuite",true);
	}
	@BeforeTest(groups={"smoke","Regression"})
	public void m3(){
		Reporter.log("beforetest",true);
	}
	@AfterTest(groups={"smoke","Regression"})
	public void m4(){
		Reporter.log("aftertest",true);
	}
	@BeforeClass(groups={"smoke","Regression"})
	public void m5(){
		Reporter.log("beforeclass",true);
	}
	@AfterClass(groups={"smoke","Regression"})
	public void m6(){
		Reporter.log("Afterclass",true);
	}
	@BeforeMethod(groups={"smoke","Regression"})
	public void m7(){
		Reporter.log("beforemethod",true);
	}
	@AfterMethod(groups={"smoke","Regression"})
	public void m8(){
		Reporter.log("Aftermethod",true);
	}
	
}
