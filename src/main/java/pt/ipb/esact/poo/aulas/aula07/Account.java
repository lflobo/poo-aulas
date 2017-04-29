package pt.ipb.esact.poo.aulas.aula07;

/**
 * Interface que descreve os membros do tipo @code Account
 */
public interface Account {

    /**
     * Deposita a quantidade especificada e atualiza o saldo
     *
     * @param amount A quantidade a depositar
     */
    void deposit(double amount);

    /**
     * @return O saldo (balance) atual
     */
    double getBalance();

}
