package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://wisequarter.com/");

        System.out.println(driver.getWindowHandle());
        // CDwindow-2A65CE7B329E7EDE69338E7F31C0EBC0
        // CDwindow-23F1F7D68CF5887B89F8DDA6D13291FE
        // getWindowHandle selenium tarafindan her driver sayfasi icin uretilen
        // unique handle degerini dondurur
        // getWindowHandles() ise test sirasinda birden fazla sayfa azilmissa
        // bir set olarak tüm sayfalarin window handle degerlerini dondurur

        System.out.println(driver.getPageSource());

        // sayfa kodlari "2 hours weekly meeting with the team" iceriyor mu test edin

        String expectedIcerik = "2 hours weekly meeting with the team";
        String actualSayfaKodlari = driver.getPageSource();

        if (actualSayfaKodlari.contains(expectedIcerik)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        driver.quit();
        // close() ile quit() ikisi de sayfa kapatmak icin kullanilir
        // close() sadece bir sayfa kapatirken
        // quit() test sirasinda acilan tum sayfalari kapatir





    }
}
