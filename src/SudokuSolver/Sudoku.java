package SudokuSolver;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Sudoku extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://sudokutable.com/");

        /*List<WebElement> mainGameGrid= driver.findElements(By.cssSelector("[transform='matrix(1 0 0 1 36 53)']"));

        for (int i=0; i<81; i++) {
            System.out.println("mainGameGrid = " + mainGameGrid.get(i).getText().length() + "mainGameGrid = (" + i + " text) =" + mainGameGrid.get(i).getText());
            if (mainGameGrid.get(i).getText().length()>2) {
                System.out.println("mainGameGrid = (" + i + ") " + mainGameGrid.get(i).getText().substring(1, (mainGameGrid.get(i).getText().length() - 1)));
            }
            System.out.println("mainGameGrid = " + mainGameGrid.get(i).getText());
        }*/

        readGrid(driver);

        // 81'li liste text    = > [transform='matrix(1 0 0 1 36 53)']
        // Okunacak değerler   = > svg[class='default']>text'in içindeki text değeri okutulacak
        // 9'lu kare bloklar   = > [class=game-grid__group] 2d array oluşturacak
        // 81 adet input hücre = > svg[viewbox]>text[transform='matrix(1 0 0 1 36 53)']
        //
        Bekle(5);

    }

    public static void readGrid(WebDriver driver) {
        List<WebElement> mainGameGrid = driver.findElements(By.cssSelector("[transform='matrix(1 0 0 1 36 53)']"));
        ArrayList<ArrayList<Integer>> mainGameGridInteger = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < 9; i++) {
            ArrayList<Integer> subArray = new ArrayList<>();
            for (int j = 0; j < 9; j++) {
                //System.out.println("count = " + count);
                //System.out.println("mainGameGrid.get(count).getText() = -->" + mainGameGrid.get(count++).getText() + "<--");
                if (mainGameGrid.get(count).getText().equals("")) {
                    subArray.add(0);
                    count++;
                } else subArray.add(Integer.parseInt(mainGameGrid.get(count++).getText()));
                //mainGameGridInteger[i][j] = Integer.parseInt(mainGameGrid.get(count).getText());
                //System.out.println("mainGameGridInteger = " + mainGameGridInteger[i][j]);
                //mainGameGridInteger[i][j]=mainGameGrid.get(j)
                //count++;
            }
            System.out.println(subArray);
            mainGameGridInteger.add(subArray);
        }
        System.out.println("count = " + count);
        System.out.println("mainGameGridInteger = " + mainGameGridInteger);
        /*for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("mainGameGridInteger = " + mainGameGridInteger[i][j]);
            }
        }*/
    }

}
