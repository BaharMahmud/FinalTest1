package tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SignUpPage;

public class SignUp extends TestBase {


    @Test
    public void signUp() {
       // new LoginPage().signUpLink.click();
        SignUpPage signUpPage=new SignUpPage();
//new changes needed
        Faker fake=new Faker();
        signUpPage.userNameField.sendKeys(fake.name().username());
        signUpPage.firstNameField.sendKeys(fake.name().firstName());
        signUpPage.lastNameField.sendKeys(fake.name().lastName());
//new addition
        //hfhkdfs;dk


    }
}