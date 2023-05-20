package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class POM extends Parent{

    public POM() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Etsy']")
    public WebElement displayedMssg;

    @FindBy(id = "catnav-primary-link-10923")
    public WebElement clthAndShoes;

    @FindBy(id = "side-nav-category-link-10936")
    public  WebElement mensSection;

    @FindBy(id = "catnav-l4-10938")
    public WebElement shirtsSection;

    @FindBy(xpath = "//div[@class='wt-bg-white wt-display-block wt-pb-xs-2 wt-mt-xs-0']//h3[contains(text(),'Shirt') or contains(text(),'shirt')]")
    public List<WebElement> shirts;
}
