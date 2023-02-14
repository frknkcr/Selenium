package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C05_DriverNavigateMethodlari {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        // amazon ana sayfaya gidin
        driver.get("https://www.amazon.com");

        // wisequarter ana sayfaya gidin
        driver.get("https://wisequarter.com");

        // yeniden amazon ana sayfaya gidin
        driver.navigate().back();

        // wisequarter ana sayfaya donun
        driver.navigate().forward();

        // navigate().to() driver.get() ile ayni islemi yapar
        driver.navigate().to("https://www.youtube.com");
        driver.navigate().refresh();

        driver.quit();

    }
}
