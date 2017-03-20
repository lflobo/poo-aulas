package pt.ipb.esact.poo.aulas.aula04;

class ContaOrdem extends Conta {
    public ContaOrdem(double amount) {
        // super de ContaPoupanca -> this de Conta
        super("ordem", amount);
    }
}