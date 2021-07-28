import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println ("введите первое число");
            int a = s.nextInt();
        System.out.println ("введите второе число");
        int b = s.nextInt();
        int c = a+b;
        System.out.println ("введите вашу фамилию");
        String d = s.nextLine();
        String e = s.nextLine();
            System.out.println ("сумма "+c+ " "+e);
    }
}
