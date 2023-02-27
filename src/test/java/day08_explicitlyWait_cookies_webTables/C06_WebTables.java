package day08_explicitlyWait_cookies_webTables;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C06_WebTables extends TestBase {

    @Test
    public void test01(){
        //1. “https://demoqa.com/webtables” sayfasina gidin
        driver.get("https://demoqa.com/webtables");

        // 2. Headers da bulunan basliklari yazdirin
        List<WebElement> headersList = driver.findElements(By.className("rt-resizable-header-content"));
        int index=1;
        for (WebElement each:headersList) {
            System.out.println(index+" - "+each.getText());
            index++;
        }

        // 3. 3.sutunun basligini yazdirin

        // 4. Tablodaki tum datalari yazdirin
        List<WebElement> dataList = driver.findElements(By.xpath("//div[@class='rt-td']"));
        System.out.println("\n======DATA=======\n");
        index=1;
        for (WebElement each:dataList) {
            if (!each.getText().isBlank()) {
                System.out.println(index + " - " + each.getText());
                index++;
            }
        }

        // 5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin

        int count=0;
        for (WebElement each:dataList) {
            if (each.getText().isBlank()) {
                count++;
            }
        }

        System.out.println("\nBoş data kutusu sayisi: "+count);

        // 6. Tablodaki satir sayisini yazdirin
        List<WebElement> satirList = driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
        System.out.println("\nSatir sayisi: "+satirList.size());

        // 7. Tablodaki sutun sayisini yazdirin
        System.out.println("Sutun sayisi: "+headersList.size());

        // 8. Tablodaki 3.kolonu yazdirin
        List<WebElement> ucuncuKolonList = driver.findElements(By.xpath("//div[@class='rt-td'][3]"));
        System.out.println("\n======UCUNCU KOLON=======\n");
        index=1;
        for (WebElement each:ucuncuKolonList) {
            if (!each.getText().isBlank()) {
                System.out.println(index + " - " + each.getText());
                index++;
            }
        }

        // 9. Tabloda “First Name” i Kierra olan kisinin Salary’sini yazdirin
        System.out.println("\nKierra salary: "+getData(3, 5));

        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin

    }
    public String getData(int satirNo,int sutunNo){
        String dataPath="((//div[@class='rt-tr-group'])["+satirNo+"]//div[@class='rt-td'])["+sutunNo+"]";
        return driver.findElement(By.xpath(dataPath)).getText();
    }
}
