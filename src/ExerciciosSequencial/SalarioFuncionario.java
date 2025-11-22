package ExerciciosSequencial;

import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numero,hora;
        double salario, valorhora;

        System.out.print("Digite número do funcionário: ");
        numero= scanner.nextInt();
        System.out.print("Digite número de horas trabalhadas: ");
        hora=scanner.nextInt();
        System.out.print("Valor que recebe por hora: ");
        valorhora= scanner.nextDouble();

        salario = valorhora * hora;

        System.out.println("NUMBER = " +numero);
        System.out.printf("SALARY = U$ %.2f%n",+salario);

        scanner.close();
    }
}
