public class Conta {
    private double saldo;

    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else{
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && saldo >= valor){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else if ( valor > saldo){
            System.out.println("Saldo insuficiente.");
        }else {
            System.out.println("Valor inválido para saque.");
        }
    }

    public double getSaldo(){
        return saldo;
    }
}
