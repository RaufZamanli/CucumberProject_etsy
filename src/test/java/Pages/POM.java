package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM extends Parent{

    public POM() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//button[contains(text(),'Sign')]")
    public WebElement signInBtn;

    @FindBy(id = "join_neu_email_field")
    public WebElement emailBox;

    @FindBy(id = "join_neu_password_field")
    public WebElement passwordBox;

    @FindBy(xpath = "(//button[contains(text(),'Sign')])[2]")
    public WebElement signInBtn2;

    @FindBy(linkText = "Alparslan")
    public WebElement nameText;

}
