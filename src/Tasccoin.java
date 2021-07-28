import java.util.*;

public class Tasccoin {
    public static void main(String[] args) {
        Random r = new Random();
        Coin[] array = new Coin[20];
        int n = 0;

        for (int i = 0; array.length > i; i++) {
            if (i % 3 == 0) {

                array[i] = new Coin("USD", r.nextInt((100) + 1));

            } else if (i % 4 == 0) {

                array[i] = new Coin("EUR", r.nextInt(300) + 201);

            } else

                array[i] = new Coin("RUB", r.nextInt(500) + 501);

        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].getCurrency().equals("RUB")) {
                System.out.println(array[i].getValue() + " рублей под номером " + i);
            }
        }

        for (int i = 0; array.length > i; i++) {
            if (array[i].getCurrency().equals("EUR")) {
                n = n + array[i].getValue();
            }
        }
        System.out.println(n + " сумма евро");
    }
}

class Coin {
    private String currency;
    private int value;

    public Coin(String currency, int value) {
        this.currency = currency;
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString()  {
        return currency + " " + value;
    }

}



