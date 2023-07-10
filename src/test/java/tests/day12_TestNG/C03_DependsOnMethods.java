package tests.day12_TestNG;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C03_DependsOnMethods {


    //amamzon anasayafaya gidin
    //3 farklı test methodu olusturup su testleri yapın
    //1-urlin amazon icerdiğini test edin
    //2-nutella aratıp sonucun nutella icerdigini test edin
    //3-ilk urune click yapıp acilan sayfadaki urun isminin nutella icerdiginmi test edin



    @Test(priority =-5)
    public void urlTest(){
        Driver.getDriver().get("https://www.amazon.com");


        //1-urlin amazon icerdiğini test edin

        String expectedIcerik="amazon";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedIcerik));
    }

    @Test(dependsOnMethods = "urlTest")
    public void nutellaAramaTesti(){
        //2-nutella aratıp sonucun nutella icerdigini test edin

        WebElement aramaKutusu=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        WebElement aramaSonucElmenti=Driver.getDriver().findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));


        String expectedIcerik="Nutella";
        String actualSonucYazisi=aramaSonucElmenti.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

    }
    @Test(dependsOnMethods = "nutellaAramaTesti")
    public void urunIsimTesti(){
        //3-ilk urune click yapıp acilan sayfadaki urun isminin nutella icerdiginmi test edin

        Driver.getDriver()
                .findElement(By.xpath("(//div[@class='a-section a-spacing-base'])[1]"))
                .click();


        WebElement urunIsimElementi=Driver.getDriver().findElement(By.xpath("//span[@id='productTitle']"));

        String expectedIcerik="Nutella";
        String actualUrunIsmi= urunIsimElementi.getText();

        Assert.assertTrue(actualUrunIsmi.contains(expectedIcerik));

        Driver.closeDriver();

    }

}
