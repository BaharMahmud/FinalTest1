package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class LoginTests extends TestBase {


        @Test
        public void positiveLogin1() {
            LoginPage loginpages = new LoginPage();
            loginpages.login("usrename1", "password1");
            loginpages.loginButtonField.click();
        }

    }




