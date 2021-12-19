package com.betterbanking.openBanking.services;

import com.betterbanking.openBanking.model.Transaction;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TransactionService {

    public List<Transaction> findAllByAccountNumber(){

        ArrayList<Transaction> allTransactions = new ArrayList<>() ;
        allTransactions.add(new Transaction());
        allTransactions.add(new Transaction());
        allTransactions.add(new Transaction());

        return  allTransactions;
    }
}
