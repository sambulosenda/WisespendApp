package me.wisespend.wisespend.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ruichaozhang on 14-11-01.
 */
public class DataCollection {
    private List<Debtor> debtors = new ArrayList<Debtor>();
    public List<Debtor> getDebtors(){
        return debtors;
    }
    public void addDebtor(Debtor aDebtor){
        debtors.add(aDebtor);

    }

    public DataCollection() {
        addDebtor(new Debtor("ruichao", 1, 30));
        addDebtor(new Debtor("testing", 2, 40));
        addDebtor(new Friend("arun",1,50,"as;ldkfj@mail.com","612516267"));
        addDebtor(new Company("paypal",121,500,800));
    }
}
