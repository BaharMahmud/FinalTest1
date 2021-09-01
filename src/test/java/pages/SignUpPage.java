package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends PageBase{

@FindBy(id="username")
    public WebElement userNameField;
@FindBy(id="firstname")

public WebElement firstNameField;
@FindBy(id="lastname")
public WebElement lastNameField;
@FindBy(id="email")
public WebElement FirstEmailField;
@FindBy(id="email2")
public WebElement SecondEmailField;
}
