package Gun09;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FridayProject_01 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement email= driver.findElement(By.id("session_email"));
        email.sendKeys("techno_group12@gmail.com");
        WebElement password= driver.findElement(By.id("session_password"));
        password.sendKeys( "123456");
        WebElement signIn=driver.findElement(By.name( "commit"));
        signIn.click();

        WebElement adresler=driver.findElement(By.linkText( "Addresses"));
        adresler.click();

        WebElement yeniAdres=driver.findElement(By.linkText( "New Address"));
        yeniAdres.click();

        WebElement firstName=driver.findElement(By.id( "address_first_name"));
        firstName.sendKeys( "Fernando");
        WebElement lastName=driver.findElement(By.id( "address_last_name"));
        lastName.sendKeys( "Torres");
        WebElement address1=driver.findElement(By.id( "address_street_address"));
        address1.sendKeys( "Anfield Rd");
        WebElement address2=driver.findElement(By.id( "address_secondary_address"));
        address2.sendKeys( "Anfield");
        WebElement city=driver.findElement(By.id( "address_city"));
        city.sendKeys(  "Liverpool");
        WebElement state=driver.findElement(By.id("address_state"));
        Select stateDDMenu=new Select(state);
        stateDDMenu.selectByValue("AZ");
        WebElement zipCode=driver.findElement(By.id("address_zip_code"));
        zipCode.sendKeys("L4 0TH");
        WebElement country=driver.findElement(By.id("address_country_us"));
        country.click();
        WebElement age= driver.findElement(By.id("address_birthday"));
        age.sendKeys("20031984");
        WebElement userAge = driver.findElement(By.id("address_age"));
        userAge.sendKeys("36");
        WebElement userWebsite = driver.findElement(By.id("address_website"));
        userWebsite.sendKeys("https://www.google.com/");
        WebElement addressPhone=driver.findElement(By.id( "address_phone"));
        addressPhone.sendKeys( "8625747878");
        WebElement climbik=driver.findElement(By.id( "address_interest_climb"));
        climbik.click();
        WebElement dancik=driver.findElement(By.id( "address_interest_dance"));
        dancik.click();
        WebElement Note=driver.findElement(By.id( "address_note"));
        Note.sendKeys( "Never Back Down");
        WebElement signIn1=driver.findElement(By.name( "commit"));
        signIn1.click();
        WebElement nameControl=driver.findElement(By.cssSelector("[data-test='first_name']"));
        WebElement surnameControl=driver.findElement(By.cssSelector("[data-test='last_name']"));

        Assert.assertTrue(nameControl.getText().contains("Fernando"));
        Assert.assertTrue(surnameControl.getText().contains("Torres"));

        WebElement addresses2=driver.findElement(By.cssSelector("[data-test='addresses']"));
        addresses2.click();
        WebElement editButton=driver.findElement(By.cssSelector("[data-test^='edit-']"));
        String editCode=editButton.getAttribute("data-test");
        editButton.click();
        WebElement editFirstName= driver.findElement(By.id("address_first_name"));
        editFirstName.clear(); editFirstName.sendKeys("Peter");
        WebElement editLastName= driver.findElement(By.id("address_last_name"));
        editLastName.clear(); editLastName.sendKeys("Crouch");

        WebElement updateAddress=driver.findElement(By.name("commit"));
        updateAddress.click();

        WebElement nameControl2=driver.findElement(By.cssSelector("[data-test='first_name']"));
        WebElement surnameControl2=driver.findElement(By.cssSelector("[data-test='last_name']"));
        Assert.assertTrue(nameControl2.getText().contains("Peter"));
        Assert.assertTrue(surnameControl2.getText().contains("Crouch"));

        WebElement addresses3=driver.findElement(By.cssSelector("[data-test='addresses']"));
        addresses3.click();

        WebElement destroy=driver.findElement(By.cssSelector("[data-test^='destroy-']"));
        destroy.click(); driver.switchTo().alert().accept();

//        try {
            WebElement editButton2=driver.findElement(By.cssSelector("[data-test^='edit-']"));
            String editCode2=editButton2.getAttribute("data-test");
            Assert.assertNotEquals(editCode, editCode2);
//        } catch (Exception e) {
//            System.out.println("Test has been successfully executed.");
//        }

        BekleKapat();
    }
}
