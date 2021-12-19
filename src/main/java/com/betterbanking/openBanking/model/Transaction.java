package com.betterbanking.openBanking.model;

import lombok.Data;

import java.util.Date;

@Data
public class Transaction {

    private String type;
    private Date date;
    private String accountNumber;
    private String currency;
    private double amount;
    private String merchantName;
    private String merchantLogo;

}


