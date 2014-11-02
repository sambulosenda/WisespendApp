package me.wisespend.wisespend.Data;

/**
 * Created by ruichaozhang on 14-11-01.
 */
public class Debtor {
    public String name;
    public int imageicon;
    public int moneyOwe;

    public Debtor(String name,int imageicon, int money ) {
        this.imageicon = imageicon;
        this.name = name;
        this.moneyOwe = money;
    }
    public String getName(){
        return name;
    }

    public int getMoneyOwe() {
        return moneyOwe;
    }


    public int getImageicon() {


        return imageicon;
    }
}
