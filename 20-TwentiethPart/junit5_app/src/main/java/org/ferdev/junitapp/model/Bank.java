package org.ferdev.junitapp.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;
    private String name;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount( Account account ){
        accounts.add( account );
        account.setBank( this );
    }

    public void transfer(Account destiny, Account origin, BigDecimal amount){
        origin.debito( amount );
        destiny.credito( amount );
    }
}
