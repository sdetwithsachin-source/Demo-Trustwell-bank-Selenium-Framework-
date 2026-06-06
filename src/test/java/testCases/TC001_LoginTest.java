package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC001_LoginTest extends BaseClass {

    @Test(groups={"Sanity","Master"})
    public void verify_login() {

        logger.info("****** Starting TC_001_LoginTest *****");

        LoginPage lp = new LoginPage(driver);
        lp.setEmail(p.getProperty("email"));
        lp.setPassword(p.getProperty("password"));
        lp.clickLogin();

        logger.info("****** Finished TC_001_LoginTest *****");

    }  

}       