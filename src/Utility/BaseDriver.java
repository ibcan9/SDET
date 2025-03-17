package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;

    static{  //  DriverBasla(); gerek yok çünkü static olduğu için ilk burası çalışır
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 saniye mühlet: sayfayı yüklemesi için
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 saniye mühlet: sayfayı yüklemesi için

    }

    public static void BekleKapat(){
        MyFunc.Bekle(3);
        driver.quit();
    }




}
