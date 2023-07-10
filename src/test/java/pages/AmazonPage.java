package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {




    public AmazonPage(){

        //baska packagedeki classalrın bu constructırı kullanabailmeleri için aceess modifier'ini
        //public yapalım


        //bu page classsından locate kullnacak tum classlar
        //amazon page classından obje olusturmalı
        //obje olusturmak icinde mutlaka bu constructor calisacak
        //o zaman bu class da webdriverımız tanımlama işini
        //bu constroctor icinde yapabiliriz

        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;


    @FindBy(xpath = "//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")
    public WebElement sonucYaziElementi;



}
