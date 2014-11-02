package me.wisespend.wisespend.Data;

/**
 * Created by ruichaozhang on 14-11-01.
 */
public class Company extends Debtor {
    private double recurrenceFee;
    private int dayOfTheMonth;
    public Company(String name, int imageicon, double recurringFee, int dayOfTheMonth) {
        super( name,imageicon,0);
        this.recurrenceFee = recurringFee;
        this.dayOfTheMonth = dayOfTheMonth;
    }
}
