package day05_assertions_dropdownMenu;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_RadioButtons {

    WebDriver driver;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void teardown(){
        driver.close();
    }

    @Test
    public void test01(){
        // a. Verilen web sayfasına gidin.
        //     https://facebook.com
        driver.get("https://facebook.com");

        // b. Cookies’i kabul edin
        // c. Create an account buton’una basin
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

        // d. Radio button elementlerini locate edin ve size uygun olani secin
        WebElement famaleButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        WebElement maleButton = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        WebElement customButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));

        maleButton.click();

        // Sectiginiz radio button'un secili digerlerinin secili olmadigini test edin

        Assert.assertTrue(maleButton.isSelected());
        Assert.assertFalse(famaleButton.isSelected());
        Assert.assertFalse(customButton.isSelected());

    }
}
