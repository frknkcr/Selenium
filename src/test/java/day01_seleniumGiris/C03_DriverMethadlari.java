package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethadlari {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // amazon sayfasina gidin
        driver.get("https://www.amazon.com");

        // gittiginiz sayfadaki title ve url'i yazdirin
        System.out.println("URL: "+driver.getCurrentUrl()); // URL : https://www.amazon.com/
        System.out.println("Baslik: "+driver.getTitle());

        // amazon sayfasina gittiginizi test edin

        // test expected result ile actual result'in karsilastirilmasidir

        // ornegin url amazon iceriyorsa diyebiliriz

        String expectedIcerik = "amazon";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedIcerik)){ // amazon ana sayfaya gittiysek
            System.out.println("Test PASSED");
        }else { // gidemediysek
            System.out.println("Test FAILED");
        }
    }
}
