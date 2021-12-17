package com.betterbanking.openBanking;

import com.betterbanking.openBanking.services.TransactionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransactionServiceTests {

    @Test
    void findAllByAccountNumberTestNoTransactions() {
        TransactionService transactionService = new TransactionService();
        Assertions.assertEquals(3,transactionService.findAllByAccountNumber().size());
    }
}

