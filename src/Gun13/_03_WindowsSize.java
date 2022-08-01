package Gun13;

import Utils.BaseStaticDriver;
import org.openqa.selenium.Dimension;

public class _03_WindowsSize extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://youtube.com/");
        Bekle(4);

        Dimension dim=new Dimension(516,600);
        driver.manage().window().setSize(dim);

        BekleKapat();
    }
}
