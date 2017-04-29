package pt.ipb.esact.poo.aulas.aula04;

public class Conta {
    String nome;
    double saldo;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(double quantia) {
        saldo += quantia;
    }

    public double getSaldo() {
        return saldo;
    }

    private void x() {}
}
