package Gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//        1) Bu siteye gidin. ->  http://demoqa.com/text-box
//        2) Full Name kısmına "Automation" girin.
//        3) Email kısmına "Testing" girin.
//        4) Current Address kısmına "Testing Current Address" girin.
//        5) Permanent Address kısmına "Testing Permanent Address" girin.
//        6) Submit butonuna tıklayınız.
//        7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
//        8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
//        Bur örnekdeki ID ve NAME kullanmadanö CSS Selector ile çözünüz

public class _02_CssSelectorOrnek2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("http://demoqa.com/text-box");

        WebElement fullName= driver.findElement(By.cssSelector("input[placeholder='Full Name']"));
        fullName.sendKeys("hello");
        Bekle(2);

        WebElement emailBox=driver.findElement(By.cssSelector(".mt-2:nth-child(2) .mr-sm-2"));
        emailBox.sendKeys("Testing@gmail.com");
        Bekle(2);

        WebElement addressBox= driver.findElement(By.cssSelector(".mt-2:nth-child(3) .form-control"));
        addressBox.sendKeys("Testing Current Address");
        Bekle(3);




        BekleKapat();
    }
}
