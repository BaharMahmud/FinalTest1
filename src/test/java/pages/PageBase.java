package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageBase {
    public void PageBase(){
        PageFactory.initElements(Driver.getDriver(),this);}


}
