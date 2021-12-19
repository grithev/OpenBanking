package com.betterbanking.openBanking.controllers;

import com.betterbanking.openBanking.model.Transaction;
import com.betterbanking.openBanking.services.TransactionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/transactions", produces = "application/json")
@CrossOrigin(origins = "*")
public class TransactionController {

    @GetMapping(params = "accountNumber")
    public List<Transaction> getTransactions(){
        TransactionService transactionService = new TransactionService();

        return transactionService.findAllByAccountNumber();
    }
}
