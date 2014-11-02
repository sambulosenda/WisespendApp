package me.wisespend.wisespend.Data;


import java.util.LinkedList;
import java.util.List;

/**
 * Created by ruichaozhang on 14-11-01.
 */
public class TransactionHistory {
    private LinkedList<Transaction> transactions = new LinkedList<Transaction>();
    public LinkedList<Transaction> getTransactionHistory(){
        return transactions;
    }
    public void addTransaction(Transaction t){
        transactions.addFirst(t);
    }

}
