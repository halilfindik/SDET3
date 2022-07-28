package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.WebElement;

import java.util.HashSet;
import java.util.Set;

public class SudokuDeneme extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://sudokutable.com/");

        int[][] mainGameGrid=new int[9][9];

        // Okunacak değerler   = > svg[class='default']>text'in içindeki text değeri okutulacak
        // 9'lu kare bloklar   = > [class=game-grid__group] 2d array oluşturacak
        // 81 adet input hücre = > svg[viewbox]>text[transform='matrix(1 0 0 1 36 53)']
        //


    }
}
