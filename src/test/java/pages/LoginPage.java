package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginPage extends PageBase {


@FindBy(id="loginUsername")
   public WebElement userNameField;
    @FindBy(id="loginPassword")
        public WebElement passwordField;
           @FindBy(id="loginButton")
              public WebElement loginButtonField;


           public void login(String userName,String password){
               userNameField.sendKeys(ConfigReader.readProperty(userName));
               passwordField.sendKeys(ConfigReader.readProperty(password));
               loginButtonField.click();




    }
}
