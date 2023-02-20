package day05_assertions_dropdownMenu;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBaseClass;

public class C07_JsAlert extends TestBaseClass {



    @Test
    public void test01(){
        // Gerekli ayarlamalari yapip
        // https://the-internet.herokuapp.com/javascript_alerts  adresine gidin
        // 3 test method'u olusturup her method'da bir JsAlert'e basin
        // Ilgili method'lari kullanin

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // 1.alert'e tiklayalim
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();

        // Alert'deki yazinin "I am a JS Alert" oldugunu test edelim
        String expectedAlertText = "I am a JS Alert";
        String actualAlertText = driver.switchTo().alert().getText();
        Assert.assertEquals(expectedAlertText,actualAlertText);

        // OK tusuna basip alert'i kapatalim
        driver.switchTo().alert().accept();

    }

    @Test
    public void test02(){

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // 2.alert'e tiklayalim
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();

        // cancel'a basip, cikan sonuc yazisinin "You clicked: Cancel" oldugunu test edin
        driver.switchTo().alert().dismiss();

        String expectedSonucText = "You clicked: Cancel";
        String actualSonucText = driver.findElement(By.xpath("//*[@id='result']")).getText();

        Assert.assertEquals(expectedSonucText,actualSonucText);

    }

    @Test
    public void test03(){

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // 3.alert'e tiklayalim
        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();

        // Cikan prompt ekranina "Abdullah" yazdiralim ve OK tusuna basarak alert'i kapatalim
        driver.switchTo().alert().sendKeys("Abdullah");
        driver.switchTo().alert().accept();

        // Cikan sonuc yazisinin Abdullah icerdigini test edelim
        String expectedIcerik = "Abdullah";
        String actualSonucText = driver.findElement(By.xpath("//*[@id='result']")).getText();

        Assert.assertTrue(actualSonucText.contains(expectedIcerik));

    }
}
