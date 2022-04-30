package ExercicioArreys;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex1ordemInversa {
    public static void main(String[] args) {
        /*
        Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
        */

        int[] vetor = {1, 2, 3, 4, 5, 6};
        int count = 0;

        System.out.println("Vetor:");

        while (count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor Inverso:");

        int i = (vetor.length - 1);

        while (i < (vetor.length) && i >= 0){
            System.out.print(vetor[i] + " ");
            i--;
        }
    }
}
