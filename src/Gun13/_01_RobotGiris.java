package Gun13;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.security.Key;

/*
     Interview Soruları :
     1- Windows popupları nasıl kontrol edersiniz ? Robot class la
     2- Dosya yükleme işlemini ne ile yaparsınız ? Robot class la
 */
public class _01_RobotGiris extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("https://demo.guru99.com/test/upload/");

        Robot robot = new Robot();
        for (int i = 0; i < 13; i++) {
            robot.keyPress(KeyEvent.VK_TAB); // tuş basılı duruma geldi
            robot.keyRelease(KeyEvent.VK_TAB); // basılı tuş bırakıldı
            Bekle(0.2);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Stringi hafızaya-clipboard a kopyalama kodu
        StringSelection stringSelection = new StringSelection("C:\\Metropol.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);
        // Verilen stringi clipboard a set ediyor.
        Bekle(1);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);  // bu iki tuş şu anda basılmış durumda
        Bekle(2);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        WebElement acceptAll=driver.findElement(By.id("submitbutton"));
        acceptAll.click();

        WebElement result= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));
        Assert.assertTrue(result.getText().contains("has been successfully uploaded"));

        BekleKapat();
    }
}
