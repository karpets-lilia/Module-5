package flower_composition;

import java.util.Scanner;

/*Корректно спроектируйте и реализуйте предметную область задачи.
  -Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
   проектирования.
  -Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
  -для проверки корректности переданных данных можно применить регулярные выражения.
  -Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
  -Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().

  Вариант А. Цветочная композиция.Реализовать приложение, позволяющее создавать цветочные композиции
  (обьект,представляющий собой цветочную композицию). Состовляющими цветочной композиции являются
  цветы и упаковка.

  Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
  подарок). Составляющими целого подарка являются сладости и упаковка.*/
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CompositionBuilder builder = new CompositionBuilder();

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose composition:");
        System.out.println("1 - Rose composition");
        System.out.println("2 - Chamomile composition");
        System.out.println("3 - Pion composition");
        int chosenComposition = sc.nextInt();

        if (chosenComposition == 1) {
            System.out.print("Your composition: ");
            director.collectRoseComposition(builder);
            Composition composition = builder.getResult();
            System.out.println(composition.getFlower() + " \n"
                    + composition.getPackaging() + " \n"
                    + composition.getPostcard());
        } else if (chosenComposition == 2) {
            System.out.print("Your composition: ");
            director.collectChamomileComposition(builder);
            Composition composition = builder.getResult();
            System.out.println(composition.getFlower() + " \n"
                    + composition.getPackaging() + " \n"
                    + composition.getPostcard());
        } else if (chosenComposition == 3) {
            System.out.print("Your composition: ");
            director.collectPionComposition(builder);
            Composition composition = builder.getResult();
            System.out.println(composition.getFlower() + " \n"
                    + composition.getPackaging() + " \n"
                    + composition.getPostcard());
        } else {
            System.out.println("We don't have such composition");
        }
    }
}

