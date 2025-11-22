package ExerciciosRepeticao;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        int senha= scanner.nextInt();

        while (senha != 1999){
            System.out.println("Senha Invalida");
            senha = scanner.nextInt();
        }
            System.out.println("Acesso Permitido");

        scanner.close();
    }
}
