package day1;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Task1 {
    public static void main ( String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Введите число а"));
        Integer numbera = parseInt (scanner.nextLine(),10);
        System.out.println(("Введите число b"));
        Integer numberb = parseInt (scanner.nextLine(),10);

        for (int i = numbera; i <= numberb; i++){
          if (i % 5 == 0 && i % 10!=0){
              System.out.println(i);
          }

        }

    }
}
