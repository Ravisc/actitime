package testNGExample;

import org.junit.Ignore;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestAnnotations extends BaseTest{
	
	@Test(invocationCount=2,groups={"Regression","smoke"})
	
	public void testA(){
		
		Reporter.log("testA",true);
			}	
	@Test(enabled=true,priority=1)
	public void testc(){
		Reporter.log("testc enabled",true);	}
	
	@Test(enabled = false)
	public void testd(){
		Reporter.log("testd disabled",true);
	}
	@Test(groups={"smoke","regression"})
	public void teste(){
		Reporter.log("teste",true);
	}
	@Test(groups={"smoke"})
	public void testf(){
		Reporter.log("testf",true);}
		@Test(groups={"Regression"})
	public void testg(){
		Reporter.log("testg",true);
	}
	@Test(groups={"RegressionTest"})
	public void testB(){
		Reporter.log("testb",true);
	}
	
	@Test(invocationCount=0)
	public void testignore(){
		Reporter.log("testignore",true);
	}
	

}
