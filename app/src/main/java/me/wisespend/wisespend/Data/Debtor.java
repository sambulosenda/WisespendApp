package me.wisespend.wisespend.Data;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ruichaozhang on 14-11-01.
 */
public abstract class Debtor implements Serializable {
    public String name;
    public int imageicon;
    public int moneyOwe;
    private TransactionHistory aTransactionHistory;


    public Debtor(String name,int imageicon, int money ) {
        this.aTransactionHistory = new TransactionHistory();
        this.imageicon = imageicon;
        this.name = name;
        this.moneyOwe = money;
    }
    public String getName(){
        return name;
    }
    public void addTransaction(Transaction t){
        aTransactionHistory.addTransaction(t);
    }

    public int getImageicon() {


        return imageicon;
    }
    public void addOrRemoveMoney(int money){
        this.moneyOwe+=money;
    }
    public int getImage(){return imageicon;}
    public int getMoneyOwe(){return moneyOwe;}
    public String toString(){
        return name+":\t"+getMoneyOwe();
    }
    public LinkedList<Transaction> getTransactionHistory(){
         return aTransactionHistory.getTransactionHistory();
    }

}
