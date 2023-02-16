package day04_JUnitFreamework;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TestNotasyonu {
    /*
        Freamework: ortak calisma penceresidir
        hangi dosyalari nerede olusturacagimizi belirler ve boylece toplu calismayi kolaylastirir.
        Her freamework, dosya düzeni olusturmanin yaninda
        islerimizi kolaylastiran yeni özellikler sunmustur.

        JUnit freamework en temel test freamework'udur
        bize kazandirdigi en onemli ozellik @Test Annotion (Notasyon)'dir

        @Test notasyonu sayesinde her bir method
        bagimsiz olarak calistirilabilen bir TEST Methodu olur

        @Test notasynu sayesinde istersek her bir test methodunu bagimsiz calistirabildigimiz gibi
        istenirse class level'dan calistirip tum testlerin calismasini saglayabiliriz

        JUnit freamework'de test method'larinin hangi sira ile calisacagini
        ONGOREMEYİZ ve KONTROL EDEMEYİZ.

     */
    @Test
    public void test01(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.wisequarter.com");
        driver.close();
    }

    @Test
    public void test02(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.youtube.com");
        driver.close();
    }
}
