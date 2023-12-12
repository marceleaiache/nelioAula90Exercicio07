package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double sum = 0;
        double average;

        while (true) {
            System.out.println("Quantos elementos vai ter o vetor?");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                break;
            }
            else {
                System.out.println("O número de elementos do vetor precisa ser inteiro.");
                System.out.println("Por favor insira um número inteiro");
                n = sc.nextInt();
            }
        }

        double[] vect = new double[n];

        for (int i=0; i<vect.length; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        average = sum / n;

        System.out.printf("MÉDIA DO VETOR: %.2f%n", average);

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        for (int i=0; i< vect.length; i++) {
            if(vect[i] < average) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
