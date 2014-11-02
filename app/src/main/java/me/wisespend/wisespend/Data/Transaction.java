package me.wisespend.wisespend.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by ruichaozhang on 14-11-01.
 */
public class Transaction implements Serializable{
    public Date d;
    public Debtor aDebtor;
    public int moneyTransfer;
    public Transaction(Date d,Debtor aDebtor,int moneyTransfer) {
        this.d = d;
        aDebtor.addOrRemoveMoney(moneyTransfer);
        this.aDebtor = aDebtor;
        this.moneyTransfer = moneyTransfer;
    }


}
