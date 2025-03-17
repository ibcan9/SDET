package Odev_CssSelector;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru1 extends BaseDriver {
/*
1) Bu siteye gidin. ->
http://demoqa.com/text-box

2) Full Name kısmına "Automation" girin.
3) Email kısmına "
Testing@gmail.com
" girin.
4) Current Address kısmına "Testing Current Address" girin.
5) Permanent Address kısmına "Testing Permanent Address" girin.
6) Submit butonuna tıklayınız.
7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
*/


    @Test
    public void Test()
    {
        driver.get(" http://demoqa.com/text-box");

        WebElement fullname= driver.findElement(By.cssSelector("div[id='userName-wrapper']> :nth-child(2) > :nth-child(1)"));
        fullname.sendKeys("Automation");

        WebElement email=driver.findElement(By.cssSelector("div[id='userEmail-wrapper'] input"));
        email.sendKeys(" Testing@gmail.com ");

        WebElement currentAdress= driver.findElement(By.cssSelector("div[id='currentAddress-wrapper']>:nth-child(1)+div textarea"));
        currentAdress.sendKeys("Testing Current Address");

        WebElement permanentAdress=driver.findElement(By.cssSelector("div[id='permanentAddress-wrapper'] textarea"));
        permanentAdress.sendKeys("Testing Permanent Address");


        WebElement submit=driver.findElement(By.cssSelector("div[class='text-right col-md-2 col-sm-12'] button"));
        submit.click();


//        WebElement fullname2=driver.findElement(By.cssSelector("div[id='userName-wrapper']> :nth-child(2) > :nth-child(1)"));

//        Assert.assertTrue("Full name: Automation bulunumadi", fullname2.getText().equals("Automation") );

        BekleKapat();
    }
}
