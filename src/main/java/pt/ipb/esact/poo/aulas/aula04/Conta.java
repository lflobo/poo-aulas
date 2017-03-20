package pt.ipb.esact.poo.aulas.aula04;

class Conta {
    String nome;
    double saldo;

    Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    void depositar(double quantia) {
        saldo += quantia;
    }

    double getSaldo() {
        return saldo;
    }
}
