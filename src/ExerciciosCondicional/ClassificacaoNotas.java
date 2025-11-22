package ExerciciosCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ClassificacaoNotas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner=new Scanner(System.in);

        System.out.print("Digite a nota:");
        double nota = scanner.nextDouble();

        if (nota < 5){
            System.out.println("Reprovado");
        }else if (nota >= 5 && nota < 7){
            System.out.println("Recuperação");
        }else {
            System.out.println("Aprovado");
        }
        scanner.close();
    }
}