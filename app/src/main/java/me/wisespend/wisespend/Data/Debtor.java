package me.wisespend.wisespend.Data;

/**
 * Created by ruichaozhang on 14-11-01.
 */
public class Debtor {
    public String name;
    public int imageicon;

    public Debtor(int imageicon, String name) {
        this.imageicon = imageicon;
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
