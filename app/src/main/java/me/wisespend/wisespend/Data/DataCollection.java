package me.wisespend.wisespend.Data;

import java.util.ArrayList;
import java.util.List;

import me.wisespend.wisespend.R;

/**
 * Created by ruichaozhang on 14-11-01.
 */
public class DataCollection implements Serializeable {
    private List<Debtor> debtors = new ArrayList<Debtor>();
    public List<Debtor> getDebtors(){
        return debtors;
    }
    public void addDebtor(Debtor aDebtor){
        debtors.add(aDebtor);

    }
    public int getTotal(){
        int total = 0;
        for(Debtor aDebtor: debtors){
            total += aDebtor.getMoneyOwe();
        }
        return total;
    }


    public DataCollection() {
        //addDebtor(new Debtor("ruichao", R.drawable.download, 30));
        //addDebtor(new Debtor("testing", R.drawable.download1, 40));
        addDebtor(new Friend("arun",R.drawable.ic_launcher,50,"as;ldkfj@mail.com","612516267"));
        addDebtor(new Company("paypal",R.drawable.mario,-500,800));



    }
    public List<Debtor> getDebtor(){
        return debtors;
    }
}
