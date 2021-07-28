import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Random ra = new Random();
        int[][] matrice = new int[9][9];

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = ra.nextInt();
            }
        }


        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = matrice.length - 1; i >= 0; i = i - 1) {
            System.out.print(matrice[i][i] + " ");
        }
    }
}
