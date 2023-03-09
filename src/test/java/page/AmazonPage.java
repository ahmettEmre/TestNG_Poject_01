package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class AmazonPage {
    public AmazonPage(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(id = "twotabsearchtextbox")
    public static WebElement aramaKutusu;

    @FindBy(xpath = "//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "(//div[@class='a-section a-spacing-base'])[1]")
    public WebElement ilkUrun;

    @FindBy(xpath = "//a[@data-csa-c-slot-id='nav_cs_0']")
    public WebElement todaysdeals;

    @FindBy(xpath = "//h4[.='Prime programs']")
    public WebElement primePrograms;

    @FindBy(xpath = "(//input[@class='a-button-input'])[1]")
    public WebElement todaysdealsilkUrun;

    @FindBy(id = "ap_email")
    public WebElement signIn;

    @FindBy(id = "auth-error-message-box")
    public WebElement errorKutusu;

    @FindBy(xpath = "//a[@data-nav-ref='nav_signin']")
    public WebElement signIN;





}
