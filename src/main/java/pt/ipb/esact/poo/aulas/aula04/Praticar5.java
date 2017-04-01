package pt.ipb.esact.poo.aulas.aula04;

public class Praticar5 {
    public static void main(String[] args) {
        Conta conta = new Conta("conta", 0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(0);
        ContaOrdem contaOrdem = new ContaOrdem(0);
        conta.depositar(10.2);
        contaPoupanca.depositar(2.5);
        contaPoupanca.depositar(2.5);
        contaOrdem.depositar(1000000.2);
        System.out.println("Valor da " + conta.nome + ":" + conta.getSaldo());
        System.out.println("Valor da " + contaPoupanca.nome + ":" + contaPoupanca.getSaldo());
        System.out.println("Valor da " + contaOrdem.nome + ":" + contaOrdem.getSaldo());
    }

}
