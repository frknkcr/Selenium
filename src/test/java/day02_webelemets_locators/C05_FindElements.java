package day02_webelemets_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class C05_FindElements {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon ana sayfaya gidin
        driver.get("https://www.amazon.com");

        // arama kutusuna java yazip aratin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("java");
        aramaKutusu.submit();

        // arama sonuclarinda cikan resimlerdeki yazilari yazdirin
        List<WebElement> aramaSonuclariElementList = driver.findElements(By.className("sg-col-inner"));

        System.out.println(aramaSonuclariElementList.size()); // 86

        // bu 86 elementi yazdirin
        int elementNo=1;
        for (WebElement eachElement:aramaSonuclariElementList) {
            System.out.println(elementNo+"---"+eachElement.getText());
            elementNo++;
        }

        Thread.sleep(3000);

        driver.quit();

    }
}
