package ExerciciosSequencial;

import java.util.Scanner;

public class soma {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

       int A,B, soma;

       System.out.print("Digite o primeiro número: ");
       A = scanner.nextInt();
       System.out.print("Digite o segundo número: ");
       B = scanner.nextInt();

        soma = A + B;

        System.out.println("Total da soma = " +soma);

        scanner.close();

    }
}
