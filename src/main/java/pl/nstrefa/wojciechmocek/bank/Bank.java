package pl.nstrefa.wojciechmocek.bank;

import java.util.List;

public interface Bank {
    void createBranch(String branchName);

    void createAccount(String branchName, String customerName, double transaction) throws Exception;

    List<Double> getCustomerTransactions(String branchName, String customerName) throws Exception;

    void addTransaction(String branchName, String customerName, double transaction) throws Exception;

    String[] getBranches();
}
