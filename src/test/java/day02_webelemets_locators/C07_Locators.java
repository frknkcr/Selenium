package day02_webelemets_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C07_Locators {
    public static void main(String[] args) throws InterruptedException {

        // 1- https://www.amazon.com/ sayfasına gidin.
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https:/amazon.com");

        // 2- Arama kutusuna “city bike” yazip aratin
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike"+ Keys.ENTER);

        // 3- Görüntülenen sonuçların sayısını yazdırın
        System.out.println(driver.findElement(By.className("sg-col-inner")).getText());

        // 4- Listeden ilk urunun resmine tıklayın.
        driver.findElement(By.className("s-image")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
