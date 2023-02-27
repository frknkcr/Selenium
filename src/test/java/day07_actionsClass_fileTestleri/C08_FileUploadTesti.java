package day07_actionsClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C08_FileUploadTesti extends TestBase {

    @Test
    public void test01(){

        //https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");
        //chooseFile butonuna basalim
        //Yuklemek istediginiz dosyayi secelim.
        //Downloads'a indirdigimiz logo.png dosyasini yukleyelim

        /*
            chooseFile butonuna basarsak
            bilgisayarimizdan bir dosya secme islemi yapmamiz gerekir
            Ancak selenium veya java bilgisayarimizdan dosya secme islemi yapamaz
            Bunun yerine Selenium bize bir yontem gelistirmistir
            chooseFile ile secmemiz gereken dosyanin dosya yolunu olusturup
            olusturulan dosya yolunu sendKeys ile chooseFile butonuna gondermemiz yeterli olur
         */

        String dinamikDosyaYolu = System.getProperty("user.home")+"/Downloads/picture.png";
        WebElement chooseFileButton = driver.findElement(By.id("file-upload"));

        chooseFileButton.sendKeys(dinamikDosyaYolu);

        //Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();
        //“File Uploaded!” textinin goruntulendigini test edelim.
        WebElement expectedText = driver.findElement(By.xpath("//div//h3"));

        Assert.assertTrue(expectedText.isDisplayed());
        bekle(2 );
    }
}
