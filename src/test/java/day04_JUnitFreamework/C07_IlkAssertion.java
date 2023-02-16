package day04_JUnitFreamework;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_IlkAssertion {

    static WebDriver driver;
    //1) Bir class oluşturun: BestBuyAssertions
    //2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak asagidaki testleri yapin
    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.bestbuy.com/");
    }

    @AfterClass
    public static void teardown(){
        driver.close();
    }

    @Test
    public void test01(){
        // ○ Sayfa URL’inin  ’a esit oldugunu test edin "https://www.bestbuy.com/"

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.bestbuy.com/");
    }


    @Test
    public void test02(){
        // ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
        Assert.assertNotEquals(driver.getTitle(),"Rest");
    }

    @Test
    public void test03(){
        // ○ logoTest => BestBuy logosunun görüntülendigini test edin
        WebElement logoElementi = driver.findElement(By.xpath("(//img[@alt='Best Buy Logo'])[1]"));

        Assert.assertTrue(logoElementi.isDisplayed());
    }

    @Test
    public void test04(){
        // ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
        Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Français']")).isDisplayed());
    }



}
