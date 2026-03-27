import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Conta conta = new Conta(1000.0);
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\n1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Verificar Saldo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 2:
                    System.out.print("Valor para Sacar: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;

                case 3:
                    System.out.print("Saldo atual: R$ "+ conta.getSaldo());
                    break;

                case 4:
                    System.out.print("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }

        }
    }
}
