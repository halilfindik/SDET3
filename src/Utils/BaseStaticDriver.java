package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseStaticDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

    static  //public static void DriverBaslat() yazmak yerine direk sadece static yazarak bu metodu default
            // olarak extend edilen class'ta hep en başta çalışacak hale getirmiş oluyoruz.
    {
        KalanOncekileriKapat();

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        //System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize
        driver.manage().deleteAllCookies();

        wait=new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60)); // sadece ana sayfa yüklenirken en başta
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); // bütün webElement için geçerli
        // defaultta hiç bekleme yok, onun için pagetimeout implicitly wait'i basestaticdriver'da açmak lazım
        // pageloadtimeout açık olduğu için ilk elemanı bulabiliyor; ancak ikinci elemanı bulmak için ise
        // implicitly wait tanımlamak gerekiyor; bu tüm elemanlar için geçerli
    }

    public static void BekleKapat()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    public static void Bekle(double saniye)
    {

        try {
            Thread.sleep((long) (saniye*1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void KalanOncekileriKapat() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }
    public static String SSDateTimeFileName() {
        LocalDateTime ssDateTime= LocalDateTime.parse(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        return "SS-".concat(ssDateTime.toString().replaceAll(":","_").substring(0,16).concat(".png"));
    }
}
