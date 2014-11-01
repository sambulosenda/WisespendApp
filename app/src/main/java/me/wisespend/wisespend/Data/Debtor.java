package me.wisespend.wisespend.Data;

import java.io.Serializable;

/**
 * Created by ruichaozhang on 14-11-01.
 */
public abstract class Debtor implements Serializable {
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
    public int getImage(){return imageicon;}
    public int getMoneyOwe(){return moneyOwe;}
    public String toString(){
        return name+":\t"+getMoneyOwe();
    }


}
