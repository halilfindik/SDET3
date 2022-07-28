package Gun11;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_BasicCalculator extends BaseStaticDriver {
    public static void main(String[] args) {

        /*
    Senaryo
    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
    2- random 100 e kadar 2 sayı üretiniz.
    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
    4- Sonuçları Assert ile kontrol ediniz.
    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.
 */
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement number1Field = driver.findElement(By.id("number1Field"));
        WebElement number2Field = driver.findElement(By.id("number2Field"));
        WebElement ddOperation = driver.findElement(By.id("selectOperationDropdown"));
        Select islemler = new Select(ddOperation);
        WebElement calculateButton = driver.findElement(By.id("calculateButton"));
        WebElement clear = driver.findElement(By.id("clearButton"));

        for (int i = 0; i < 5; i++) {
            {
                int num1 = randomSayi();
                int num2 = randomSayi();
                number1Field.sendKeys(Integer.toString(num1));
                number2Field.sendKeys(Integer.toString(num2));
                islemler.selectByIndex(0);
                calculateButton.click();
                int add = (num1 + num2);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#numberAnswerField")));
                WebElement result = driver.findElement(By.cssSelector("#numberAnswerField"));
                int expectedResult = Integer.parseInt(result.getAttribute("value"));
                Assert.assertEquals(add, expectedResult);
                number1Field.clear();
                number2Field.clear();
                clear.click();
            }
            {//subtract
                int num1 = randomSayi();
                int num2 = randomSayi();
                number1Field.sendKeys(Integer.toString(num1));
                number2Field.sendKeys(Integer.toString(num2));
                islemler.selectByIndex(1);
                calculateButton.click();
                int subtract = (num1 - num2);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#numberAnswerField")));
                WebElement result = driver.findElement(By.cssSelector("#numberAnswerField"));
                int expectedResult = Integer.parseInt(result.getAttribute("value"));
                Assert.assertEquals(subtract, expectedResult);
                number1Field.clear();
                number2Field.clear();
                clear.click();
            }
            {//multiply
                int num1 = randomSayi();
                int num2 = randomSayi();
                number1Field.sendKeys(Integer.toString(num1));
                number2Field.sendKeys(Integer.toString(num2));
                islemler.selectByIndex(2);
                calculateButton.click();
                int multiply = num1 * num2;
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#numberAnswerField")));
                WebElement result = driver.findElement(By.cssSelector("#numberAnswerField"));
                int expectedResult = Integer.parseInt(result.getAttribute("value"));
                Assert.assertEquals(multiply, expectedResult);
                number1Field.clear();
                number2Field.clear();
                clear.click();
            }
            {//divide
                int num1 = randomSayi();
                int num2 = randomSayi();
                number1Field.sendKeys(Integer.toString(num1));
                number2Field.sendKeys(Integer.toString(num2));
                islemler.selectByIndex(3);
                calculateButton.click();
                double divide = (double) num1 / num2;
                String divideString = Double.toString(divide);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#numberAnswerField")));
                WebElement result = driver.findElement(By.cssSelector("#numberAnswerField"));
                String resultString = result.getAttribute("value");
                Assert.assertTrue(divideString.contains(resultString));
                number1Field.clear();
                number2Field.clear();
                clear.click();
            }
            {//concatenate
                int num1 = randomSayi();
                int num2 = randomSayi();
                number1Field.sendKeys(Integer.toString(num1));
                number2Field.sendKeys(Integer.toString(num2));
                islemler.selectByIndex(4);
                calculateButton.click();
                String concat = num1 + "" + num2;
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#numberAnswerField")));
                WebElement result = driver.findElement(By.cssSelector("#numberAnswerField"));
                String expectedResult = result.getAttribute("value");
                Assert.assertEquals(concat, expectedResult);
                number1Field.clear();
                number2Field.clear();
                clear.click();
            }
        }
        BekleKapat();
    }

    public static int randomSayi() {
        return (int) (Math.random() * 100);
    }
}
