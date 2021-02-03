package com.example.atm;

public class Bank {

    private String username;
    private Card card;

    public Bank() {

    }

    public String getUsername() {
        return username;
    }

    public Card getCard() {
        return card;
    }

    public void changePin(){
        System.out.println("Your pin code is:" + card.getPin());
    }
}
