package Gun05;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Navigating extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.navigate().to("https://testpages.eviltester.com/styled/index.html");
        // navigate().to -> get ile aynı, history için kullanılır, ileri - geri için
        MyFunc.Bekle(3);

        WebElement alertLink=driver.findElement(By.id("alerttest"));
        alertLink.click();
        //linke tıklattım yeni sayafaya gittim

        System.out.println("Sayfanın Title ı = " + driver.getTitle());
        System.out.println("Sayfanın url si = " + driver.getCurrentUrl());
        MyFunc.Bekle(3);

        driver.navigate().back();  // back: geri,  bir önceki sayfaya git
        System.out.println("Sayfanın Title ı = " + driver.getTitle());
        System.out.println("Sayfanın url si = " + driver.getCurrentUrl());
        MyFunc.Bekle(3);

        driver.navigate().forward(); // forward:ileri ,   bir sonraki sayfaya git.
        System.out.println("Sayfanın Title ı = " + driver.getTitle());
        System.out.println("Sayfanın url si = " + driver.getCurrentUrl());

        BekleKapat();
    }


}
