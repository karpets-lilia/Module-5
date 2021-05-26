
/*Создать консольное приложение, удовлетворяющее следующим требованиям:
* Приложение должно быть обьектно-, а не процеурно- ориентированным
* Каждый класс должен иметь отражающее смысл название и информативный состав.
* Наследование должно применяться только тогда, когда это имеет смысл.
* При кодировании должны быть использованы соглашения об оформлении кода
* java code convection.
* Классы должны быть грамотно разложены по пакетам.
* Консольное меню должно быть минимальным
* Для хранения данных можно использовать файлы.
* **********
* Дракон и его сокровища. Создать программу, позволяющуу обрабатывать сведения о
* 100 сокровищах в пещере дракона. Реализовать возможность просмотра сокровищ,
*  выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.*/

package Dragon;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DragonCave dragonCave = new DragonCave();
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Menu \n" +
                    "1 <-- Treasure list \n" +
                    "2 <-- Finding the most expensive treasure \n" +
                    "3 <-- Buy treasures \n" +
                    "0 <-- EXIT");
            number = scanner.nextInt();
            switch (number) {
                case (0):
                    number = 0;
                    break;
                case (1):
                    showTreasures(dragonCave);
                    break;
                case (2):
                    showMostExpensiveTreasure(dragonCave);
                    break;
                case (3):
                    toMakePurchase(dragonCave);
                    break;
                default:
                    System.out.println("Invalid value");
                    break;
            }
        } while (number != 0);
    }

    public static void showTreasures(DragonCave dragonCave) {
        System.out.println("We have following treasures in the cave: ");
        for (ArrayList<Treasure> treasureGroup : dragonCave.getTreasures()) {
            System.out.println(
                    treasureGroup.size() + " " +
                            treasureGroup.get(0).getTreasureName() + " (" +
                            treasureGroup.get(0).getTreasureCost() + "$)"
            );
        }
    }

    public static void showMostExpensiveTreasure(DragonCave dragonCave) {
        String mostExpensiveTreasure = dragonCave.getTreasures().get(0).get(0).getTreasureName();
        int mostExpensiveCost = dragonCave.getTreasures().get(0).get(0).getTreasureCost();
        for (ArrayList<Treasure> treasureGroup : dragonCave.getTreasures()) {
            if (treasureGroup.get(0).getTreasureCost() > mostExpensiveCost) {
                mostExpensiveCost = treasureGroup.get(0).getTreasureCost();
                mostExpensiveTreasure = treasureGroup.get(0).getTreasureName();
            }
        }
        System.out.println("The most expensive treasure: " + mostExpensiveTreasure + " " + mostExpensiveCost);
    }

    public static void toMakePurchase(DragonCave dragonCave) {
        Scanner sc = new Scanner(System.in);
        int treasureOption;
        System.out.println("Enter your cash amount: ");
        int summ = sc.nextInt();
        String treasureMenu = "What would you like to buy? \n";
        for (int i = 0; i < dragonCave.getTreasures().size(); i++) {
            treasureMenu += i+1 + " --> " + dragonCave.getTreasures().get(i).get(0).getTreasureName() +
                    " (" + dragonCave.getTreasures().get(i).get(0).getTreasureCost() + "$) \n";
        }
        System.out.println(treasureMenu);
        treasureOption = sc.nextInt();
        double treasureCount = Math.floor(summ / dragonCave.getTreasures().get(treasureOption - 1).get(0).getTreasureCost());
        System.out.println("You bought " + treasureCount + " " + dragonCave.getTreasures().get(treasureOption - 1).get(0).getTreasureName());
    }
}



