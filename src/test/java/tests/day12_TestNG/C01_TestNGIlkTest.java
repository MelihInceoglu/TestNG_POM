package tests.day12_TestNG;

import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ResuableMethods;

public class C01_TestNGIlkTest {


     @Test
    public void test01(){

           /*
            POM'de driver olusturmak ve gerekli ayarlari yapmak icin
            TestBase kullanmak yerine
            Ayri bir Driver class'i icerisinde
            bize driver döndürecek bir method olusturulmasi tercih edilmistir
         */
         Driver.getDriver().get("https://www.amazon.com");

         ResuableMethods.bekle(5);

         Driver.closeDriver();


     }


     @Test
    public void test02(){

         //youtube anasayfaya gidin

         Driver.getDriver().get("https://www.youtube.com");

         ResuableMethods.bekle(3);

         //urli yazdirin

         System.out.println(Driver.getDriver().getCurrentUrl());

         ResuableMethods.bekle(3);

         //sayfayi kapatın

         Driver.closeDriver();


     }






}
