package tests.day13_testNGFramework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ResuableMethods;

public class C01_PagesilkTest {




    @Test
    public void amazonTest(){

        //amazon ana sayfaya git

        Driver.getDriver().get("https://www.amazon.com");

        //Nutella için arama yapin

           //arama kutusunun locatirina ihtiyacimiz var
        //locatorlar artık page classlarında
        //locatorlar static olmadıgı için obje olusturarak kullanabiliriz

        AmazonPage amazonPage =new AmazonPage();

        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);


        //sonucların nutella icerdigini test edin

            String expectedIcerik="Nutella";
            String actualSonucYazisi=amazonPage.sonucYaziElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

        //sayfayi kapatin

        ResuableMethods.bekle(5);
        Driver.closeDriver();

    }
























}
