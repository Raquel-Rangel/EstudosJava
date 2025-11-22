package ExerciciosCondicional;

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.print("Digite um número: ");
      int N= scanner.nextInt();

        if (N % 2 == 0){
            System.out.print("PAR");
        } else {
            System.out.print("IMPAR");
        }

        scanner.close();
    }
}
