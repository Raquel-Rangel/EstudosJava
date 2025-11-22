package ExerciciosCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int quantidade, codigo;
        double  total=0;

        System.out.println("");
        System.out.println("CODIGO     |  LANCHES          | PREÇO  ");
        System.out.println("    1      | Cachorro Quente   | R$ 4.00");
        System.out.println("    2      | X-Salada          | R$ 4.50 ");
        System.out.println("    3      | X-Bacon           | R$ 5.00");
        System.out.println("    4      | Torrada simples   | R$ 2.00");
        System.out.println("    5      | Refrigerante      | R$ 1.50");
        System.out.println("");

        System.out.print("Digite codigo do pedido: ");
        codigo = scanner.nextInt();
        System.out.print("Digite a quantidade que deseja: ");
        quantidade = scanner.nextInt();

        if (codigo == 1){
            total = quantidade * 4.00;
        } else if (codigo == 2) {
            total = quantidade *  4.50;
        } else if (codigo == 3) {
            total = quantidade * 5.00;
        } else if (codigo == 4) {
            total = quantidade * 2.00;
        } else if (codigo == 5) {
            total = quantidade * 1.50;
        }
        System.out.printf("Total do seu pedido: R$%.2f%n", +total);

    }
}
