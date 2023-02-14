package day02_webelemets_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C02_ImplicitlyWait {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
            Driver'i bir web uygulamasina gonderdigimizde
            o sayfanin acilmasi
            orada istedigimiz islemleri yapmak icin elementleri bulmasi... gibi islemler
            zaman gerektirebilir

            implicitlyWait bu tür zaman isteyen islemler icin
            driver'in maksimum ne kadar bekleyecegini belirler

         */

    }
}
