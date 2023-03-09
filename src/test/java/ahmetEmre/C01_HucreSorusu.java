package ahmetEmre;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_HucreSorusu {

    AmazonPage amazonPage=new AmazonPage();
    @Test
    public void amazonHesapAcma(){

        // US amaci : amazon hesap acma
        //1- Amazona gidelim
        //2- sag yukaridan account and list yerine gidip
        //3- cikan yerden sign in e basin
        //4- gelen yerde create a amazon account butonunna basin
        //5- bosluklari doldurun
        //6- Verify mobile number a basin
        //7- Verify mobile number yazisin gorunur oldugunu test edin
    }
}
