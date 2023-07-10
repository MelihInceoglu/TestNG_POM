package tests.day13_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ResuableMethods;

public class C07_QdNegativeLoginTest {



    //1- https://www.qualitydemy.com/ anasayfasina gidin
    //2- login linkine basin
    // 3- 3 farkli test method’u olusturun.
    // - gecerli username, gecersiz password
    // - gecersiz username, gecerli password
    // - gecersiz username, gecersiz password.
    //4- Login butonuna basarak login olun
    //5- Basarili olarak giris yapilamadigini test edin


    //1- https://www.qualitydemy.com/ anasayfasina gidin
    //2- login linkine basin
    //3- 3 farkli test method’u olusturun.
    //	- gecerli username, gecersiz password
    //	- gecersiz username, gecerli password
    //	- gecersiz username, gecersiz password.
    //4- Login butonuna basarak login olun
    //5- Basarili olarak giris yapilamadigini test edin

    @Test
    public void gecersizPasswordTesti(){
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        QdPage qdPage = new QdPage();

        qdPage.ilkLoginLinki.click();

        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));

        qdPage.cookiesKapama.click();
        ResuableMethods.bekle(3);

        ResuableMethods.bekle(3);

        qdPage.loginButonu.click();

        Assert.assertTrue(qdPage.emailKutusu.isDisplayed());

        Driver.closeDriver();
    }



}
