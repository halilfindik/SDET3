package Gun11;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class deneme extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement menu = driver.findElement(By.id("selectOperationDropdown"));
        Select ddmenu = new Select(menu);

        for (int i = 0; i < ddmenu.getOptions().size(); i++) {

            ddmenu.selectByIndex(i);

            for (int j = 0; j < 5; j++) {
                WebElement firsNumber = driver.findElement(By.id("number1Field"));
                int sayı1 =(int) (Math.random()*100);
                String strSayi1 = String.valueOf(sayı1);
                firsNumber.sendKeys(strSayi1);

                WebElement secondNumber = driver.findElement(By.id("number2Field"));
                int sayı2 =(int)(Math.random()*100);
                String strSayi2 = String.valueOf(sayı2);
                secondNumber.sendKeys(strSayi2);

                WebElement button = driver.findElement(By.id("calculateButton"));
                button.click();
                WebElement answer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='numberAnswerField']")));

                String sonuc ="";
                if(i == 0){
                    sonuc = String.valueOf(sayı1+sayı2);
                }else if(i == 1){
                    sonuc = String.valueOf(sayı1-sayı2);

                }else if(i == 2){
                    sonuc = String.valueOf(sayı1*sayı2);

                }else if(i == 3){
                    sonuc = String.valueOf(sayı1/sayı2);

                }else if(i == 4){
                    sonuc = "" + sayı1+sayı2;
                }
                Assert.assertTrue(answer.getAttribute("value").contains(sonuc));
                firsNumber.clear();
                secondNumber.clear();
            }
        }
        BekleKapat();

    }
}
