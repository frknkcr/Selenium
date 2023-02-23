package day07_actionsClass_fileTestleri;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FilePath{

    @Test
    public void test01(){

        //"C:\Users\frknk\Desktop\TheDelta.docx"
        String dosyaYolu = "C:\\Users\\frknk\\Desktop\\TheDelta.docx";

        boolean sonuc = Files.exists(Paths.get(dosyaYolu));
        System.out.println(sonuc);

        /*
            Bilgisayarimizda bir dosyanin var oldugunu test etmek icin
            dosya yoluna ihtiyacimiz var

            Ancak herkesin bilgisayarindaki dosya yollari
            farkliliklar gosterir

            herkesin bilgisayarina gore farkli olan kismi
            java'dan bir komut ile elde edebiliriz
         */

        System.out.println(System.getProperty("user.home"));

        dosyaYolu = "C:\\Users\\frknk\\Desktop\\TheDelta.docx";
        dosyaYolu = System.getProperty("user.home")+ "\\Desktop\\TheDelta.docx";
    }
}
