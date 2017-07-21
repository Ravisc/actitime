package script;

import org.testng.annotations.Test;

import pom.LoginPage;
import generic.BaseTest;

public class TestLoginPage extends BaseTest{
	@Test
	public void testlogin(){
		LoginPage l=new LoginPage(driver);
		l.setusername("admin");
		l.setPassword("manager");
		l.clickLogin();
	}

}
