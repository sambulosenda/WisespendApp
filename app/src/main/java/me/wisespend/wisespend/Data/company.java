package me.wisespend.wisespend.Data;

/**
 * Created by ruichaozhang on 14-11-01.
 */
public class Company extends Debtor {
    private int recurrenceFee;
    public Company(String name, int imageicon, int money, int recurrenceFee) {
        super( name,imageicon,money);
        this.recurrenceFee = recurrenceFee;
    }
}
