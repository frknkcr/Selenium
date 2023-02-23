package day07_actionsClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C05_DinamikDosyaYolu {

    @Test
    public void test01(){

        String dosyaYolu = System.getProperty("user.home")+"\\Desktop\\TheDelta.docx";

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

    }
}
