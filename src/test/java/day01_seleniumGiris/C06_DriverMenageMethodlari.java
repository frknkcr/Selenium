package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C06_DriverMenageMethodlari {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        System.out.println("maximize size : "+driver.manage().window().getSize());
        System.out.println("maximize position : "+driver.manage().window().getPosition());

        driver.manage().window().fullscreen();
        System.out.println("fullscreen size : "+driver.manage().window().getSize());
        System.out.println("fullscreen position : "+driver.manage().window().getPosition());

        driver.quit();

    }
}
