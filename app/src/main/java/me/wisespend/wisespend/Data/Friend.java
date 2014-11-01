package me.wisespend.wisespend.Data;

import me.wisespend.wisespend.Data.Debtor;

/**
 * Created by ruichaozhang on 14-11-01.
 */
public class Friend extends Debtor {
    private String email;
    private String mobile;

    public Friend( String name,int imageicon,int money,String email,String mobile) {
        super( name,imageicon,money);
        this.email = email;
        this.mobile = mobile;
    }

    public Friend(String name, int imageicon, int money) {
        super(name, imageicon, money);
    }

}
