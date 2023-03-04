package tests.amazonDenemeleri;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_giris {
    AmazonPage amazonPage=new AmazonPage();

    @Test
    public void amazonTest01(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().navigate().refresh();
        String expected="amazon";
        String actual=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actual.contains(expected));
        amazonPage.aramaKutusu.sendKeys("ipad"+ Keys.ENTER);
        expected="1-16 of over 1,000 results for \"ipad\"";
        actual=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actual.contains(expected));

        amazonPage.todaysdeals.click();


    }

}
