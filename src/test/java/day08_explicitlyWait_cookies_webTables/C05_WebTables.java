package day08_explicitlyWait_cookies_webTables;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;

public class C05_WebTables extends TestBase {

    @Test
    public void test01(){

        //1.“https://www.amazon.com” adresine gidin
        driver.get("https://www.amazon.com");

        //2.Sayfanin en altina inin
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();

        //3.Web table tum body’sini yazdirin
        List<WebElement> webElementList = driver.findElements(By.xpath("//tbody"));
        for (WebElement each:webElementList) {
            System.out.println(each.getText());
        }

        //4.Web table’daki satir sayisinin 9 oldugunu test edin
        webElementList = driver.findElements(By.xpath("//tbody/tr"));
        Assert.assertEquals(10,webElementList.size());

        //5.Tum satirlari yazdirin
        System.out.println();
        int satirNo = 1;
        for (WebElement eachSatir:webElementList) {
            System.out.println(satirNo+" - "+eachSatir.getText());
            satirNo++;
        }

        //6. Web table’daki sutun sayisinin 13 olduğunu test edin
        List<WebElement> ucuncuSatirDataList = driver.findElements(By.xpath("//tbody/tr[3]/td"));
        Assert.assertEquals(13,ucuncuSatirDataList.size());

        //7. 5.sutunu yazdirin
        List<WebElement> besinciSutunDataList = driver.findElements(By.xpath("//tbody/tr/td[5]"));

        System.out.println("============5. Sutun===========");

        satirNo = 1;
        for (WebElement eachSatir:besinciSutunDataList) {
            System.out.println(satirNo+" - "+eachSatir.getText());
            satirNo++;
        }

        //8.Satir ve sutun sayisini parametre olarak alip, hucredeki bilgiyi döndüren bir method olusturun
        System.out.println("\nIstenen data: "+getData(3, 5));

        //9. 7. satirin 9.datasinin "Shoes" icerdigini test edin
        String actualData = getData(7,9);
        String expectedIcerik = "Shoes";

        Assert.assertTrue(actualData.contains(expectedIcerik));

        bekle(3);
    }

    public String getData (int satirNo, int sutunNo){

        String dataXpath = "//tbody/tr["+satirNo+"]/td["+sutunNo+"]";

        return driver.findElement(By.xpath(dataXpath)).getText();
    }

}
