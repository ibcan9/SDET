package Gun05;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _02_Soru extends BaseDriver {


    // Senaryo:
    // 1-  https://form.jotform.com/221934510376353  sayfasınız açınız
    // 2-  isim kutucuğuna adınızı yazdırınız
    // 3-  soyad kutucuğuna soyadınız yazdırınız
    // 4-  Submit butona tıklatınız (click)
    // 5-  "Thank You" yazısını görünüyor ise "TEST PASSED" yazdırınız


    @Test
    public void Test1() {

        driver.get("https://form.jotform.com/221934510376353");

        WebElement element = driver.findElement(By.name("q8_name[first]"));
        element.sendKeys("İbrahim");

        WebElement element1 = driver.findElement(By.name("q8_name[last]"));
        element1.sendKeys("Can");

        WebElement submit = driver.findElement(By.id("input_2"));
        submit.click();

        WebElement ekrandakiYazi = driver.findElement(By.className("form-message-text"));
        System.out.println("tsk.getText() = " + ekrandakiYazi.getText());

//        if (tesekkurYazisi.getText().contains("Thank You..."))
//            System.out.println("Test passed");
//        else
//            System.out.println("Test failed");

        Assert.assertTrue("Aranılan mesaj bulunamadı", ekrandakiYazi.getText().contains("Thank"));
        //Ben true bekliyorum, değilse göster, yoksa test passed

        //Assert.assertTrue("Aranılan mesaj bulunamadı", tesekkurYazisi.getText().equals("Thank You!"));


        BekleKapat();
    }
}