package SudokuSolver;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SudokuArray extends BaseStaticDriver {
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
        // yatay elemanlar     = > .game-grid__cell[data-row='0']
        // düşey elemanlar     = > .game-grid__cell[data-column='0']

        Bekle(5);
    }

    public static void readGrid(WebDriver driver) {
        List<WebElement> mainGameGridElements = driver.findElements(By.cssSelector("[transform='matrix(1 0 0 1 36 53)']"));
        String horizontalXpath=".game-grid__cell[data-row='" + i + "']";
        List<WebElement> horizontalGridElements = driver.findElements(By.cssSelector(".game-grid__cell[data-row='0']"));
        List<WebElement> verticalGridElements = driver.findElements(By.cssSelector(".game-grid__cell[data-column='0']"));

        for (int i=0; i<9; i++) {
            System.out.println(horizontalGridElements.get(i).getText());
        }

        int[][] cubeArray=gridToArray(mainGameGridElements);
        int[][] verticalArray=gridToArray(horizontalGridElements);
        int[][] horizontalArray=gridToArray(verticalGridElements);

        printArray(cubeArray);
        printArray(verticalArray);
        printArray(horizontalArray);

    }
    public static int[][] gridToArray(List<WebElement> elements) {
        int[][] array=new int[9][9];
        int count=0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (elements.get(count).getText().equals("")) {
                    array[i][j]=0;
                    count++;
                } else array[i][j]=Integer.parseInt(elements.get(count++).getText());
            }
        } return array;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("Array to Table = " + array[i][j]);
            }
        }
    }
}
