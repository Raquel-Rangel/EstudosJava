package ExerciciosRepeticao;

import java.util.Scanner;

public class exer04 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int soma =0;
        int numero;

        System.out.println("Digite números inteiros(digite 0 para sair): ");


        numero = scanner.nextInt();

        while (numero != 0){
            soma = soma + numero;
            numero= scanner.nextInt();
        }
        System.out.println("A soma dos números digitados é: "+soma);

        scanner.close();
    }
}
