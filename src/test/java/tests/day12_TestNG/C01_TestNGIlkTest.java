package tests.day12_TestNG;

import org.testng.annotations.Test;
import utilities.Driver;

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


         Driver.closeDriver();


     }


     @Test
    public void test02(){

         //youtube anasayfaya gidin

         Driver.getDriver().get("https://www.youtube.com");



         //urli yazdirin

         System.out.println(Driver.getDriver().getCurrentUrl());


         //sayfayi kapatın

         Driver.closeDriver();


     }






}
