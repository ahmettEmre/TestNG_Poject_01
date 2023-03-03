package tests.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import page.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_amazonAlisveris {



    @Test
    public void amazonAlisveris(){
        //Amazonda oturum acma
        //Uygulama: Amazon Alışveriş
        //Amaç: Bir urun arama, ucuncu urunu secme
        //Adımlar:
        AmazonPage amazonPage=new AmazonPage();
        //1.Amazon Alışveriş uygulamasını açın.
        //2.sayfanın altında yer alan "Çerezleri Kabul Etme" kutucuğundaki işareti secin.
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //3.Arama çubuğuna "bicycle" yazın ve arama yapın.
        amazonPage.aramaKutusu.sendKeys("bicycle"+ Keys.ENTER);

        //4. todays deals kutucuguna tiklayin
        amazonPage.todaysdeals.click();

        //5. Solda prime programs bolumundeki kutucuklari tiklayin
        Actions actions=new Actions(Driver.getDriver());
        actions.click(amazonPage.primePrograms)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE).perform();


    }
}
