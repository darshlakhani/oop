package service;

import model.Transaction;
import model.TransactionType;

import java.util.List;

public interface TransactionService {

    void createTransaction(Transaction transaction);

    Transaction getTransactionByUser(String userId);

    List<Transaction> getTransactionsByItemId(String itemId);

    List<Transaction> getTransactionsByTransactionType(TransactionType transactionType);
}
