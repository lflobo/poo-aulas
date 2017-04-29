package pt.ipb.esact.poo.aulas.aula07;

/**
 * Extrato bancário de uma conta
 */
public interface BankStatement {

    /**
     * Coloca no ecrã o saldo da conta no formato:
     * <pre>
     * balance: € ${balance}
     * </pre>
     */
    void print();

}
