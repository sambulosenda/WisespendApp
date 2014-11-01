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
    public void addPerson(Debtor aDebtor){
        debtors.add(aDebtor);

    }

    public DataCollection() {
        addPerson(new Debtor(1,"ruichao"));
        addPerson(new Debtor(2,"testing"));

    }
}
