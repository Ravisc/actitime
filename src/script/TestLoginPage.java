package script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import pom.LoginPage;
import generic.BaseTest;
import generic.ExcelUtilize;

public class TestLoginPage extends BaseTest{
	@Test
	public void testlogin() throws EncryptedDocumentException, InvalidFormatException, IOException{
		LoginPage l=new LoginPage(driver);
		String un=ExcelUtilize.getCellValue("Sheet1", 1, 0);
		String pw=ExcelUtilize.getCellValue("Sheet1", 1, 1);
		
		l.setusername(un);
		l.setPassword(pw);
		l.clickLogin();
	}

}
