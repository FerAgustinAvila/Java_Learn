package org.ferdev.junitapp.model;

import org.ferdev.junitapp.exceptions.AmountInsufficientException;

import java.math.BigDecimal;

public class Account {
    private String persona;
    private BigDecimal saldo;
    private Bank bank;

    public Account(String persona, BigDecimal saldo) {
        this.saldo = saldo;
        this.persona = persona;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Account)){
            return false;
        }
        Account ac = (Account) obj;
        if ( this.persona == null || this.saldo == null){
            return false;
        }

        return this.persona.equals(ac.getPersona()) && this.saldo.equals(ac.getSaldo());

    }

    public void debito( BigDecimal amount){
        BigDecimal newAmount = this.saldo.subtract( amount );
        this.saldo = this.saldo.subtract( amount );
        if ( newAmount.compareTo(BigDecimal.ZERO) < 0){
            throw new AmountInsufficientException("Dinero insuficiente");
        }
        this.saldo = newAmount;
    }
    public void credito( BigDecimal amount){
        this.saldo = this.saldo.add( amount );
    }
}
