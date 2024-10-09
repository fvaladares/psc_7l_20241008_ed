import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int col = 7;
        int lin = 10;
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        // Vetor
        double[] peso = new double[col];

        // Matriz
        double[][] pesosPorSemana = new double[lin][col];

        for (int i = 0; i < col; i++) {
            peso[i] = random.nextInt(100);
        }

        for (int i = 0; i < col; i++) {
            System.out.println("O peso da pessoa " + (i + 1)
                    + " eh: " + peso[i]);
        }

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                pesosPorSemana[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < lin; i++) {
            System.out.println("Pesos da pessoa " + (i + 1));
            for (int j = 0; j < col; j++) {
                System.out.printf("%.1f, ",
                        pesosPorSemana[i][j]);
            }
            System.out.println();
        }

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Fabricio");
        lista.add("Miguel");
        lista.get(1);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));

        }

    }
}