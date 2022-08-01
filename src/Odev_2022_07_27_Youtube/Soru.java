package Odev_2022_07_27_Youtube;

/*
1- https://www.youtube.com/ adresine gidiniz
2- "Selenium" kelimesi ile video aratınız.
3- Listelenen sonuçlarda 80 videoaya kadar lsiteyi uzatınız.
4- Son videonun title ını yazdırınız.
 */

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Soru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.youtube.com/");
        WebElement searchBox= driver.findElement(By.cssSelector("input[id='search']"));
        searchBox.sendKeys("selenium");
        searchBox.sendKeys(Keys.ENTER);

        WebElement filterButton= driver.findElement(By.cssSelector(".ytd-toggle-button-renderer > #button > #text"));
        filterButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='style-scope ytd-search-filter-renderer' and text()='Video']")));
        WebElement videoFilterButton= driver.findElement(By.xpath("//*[@class='style-scope ytd-search-filter-renderer' and text()='Video']"));
        videoFilterButton.click();

        List<WebElement> seleniumVideos=driver.findElements(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']"));
        System.out.println("Başlangıçta seleniumVideos.size() = " + seleniumVideos.size());
        while (seleniumVideos.size()<80) {
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            seleniumVideos.addAll(driver.findElements(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")));
            System.out.println("Döngü içinde seleniumVideos = " + seleniumVideos.size());
        }



        BekleKapat();
    }
}
