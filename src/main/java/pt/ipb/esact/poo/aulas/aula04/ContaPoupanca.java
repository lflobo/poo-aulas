package pt.ipb.esact.poo.aulas.aula04;

class ContaPoupanca extends Conta {
    public ContaPoupanca(double amount) {
        // super de ContaPoupanca -> this de Conta
        super("poupança", amount);
    }
}