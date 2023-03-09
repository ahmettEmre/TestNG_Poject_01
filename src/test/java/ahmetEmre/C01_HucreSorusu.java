package ahmetEmre;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_HucreSorusu {

    AmazonPage amazonPage=new AmazonPage();
    @Test
    public void amazonHesapAcma01(){

        // US amaci : amazon hesap acma
        //1- Amazona gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //2- sag yukaridan account and list yerine gidip


        Actions actions=new Actions(Driver.driver);
        actions.click(AmazonPage.aramaKutusu)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ENTER).perform();

        //3- cikan yerden sign in e basin

        //4- gelen yerde create a amazon account butonunna basin
        //5- bosluklari doldurun
        //6- Verify mobile number a basin
        //7- Verify mobile number yazisin gorunur oldugunu test edin
    }
}
