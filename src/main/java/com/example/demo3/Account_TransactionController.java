package com.example.demo3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



//@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class Account_TransactionController {
    @Autowired
    Account_TransactionRepository account_transactionRepository;

    @GetMapping("/account_transaction")
    public List<Account_Transaction> getAllAccount_Transaction() {
        return account_transactionRepository.findAll();
    }

    @GetMapping("/account_transaction/{january}")
    public Optional<Account_Transaction> getAllAccount_TransactionByJanuary(@PathVariable(value="january") String january) {
        return account_transactionRepository.findById(january);
    }
    @PostMapping("/account_transactions")
    public @Valid
    Account_Transaction createAccount_Transaction(@Valid @RequestBody Account_Transaction account_transaction) {
        return account_transactionRepository.save(account_transaction);
    }
    @DeleteMapping("account_transactions/{january}") // DELETE operation for CRUD
    public ResponseEntity<Void> deleteAccount_Transaction(@PathVariable("january") String january) throws Account_Bill_PayeeNotFoundException {
        Account_Transaction tsc = account_transactionRepository.findById(january).orElseThrow(() -> new Account_Bill_PayeeNotFoundException(january));
        account_transactionRepository.deleteById(january);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    @PutMapping("/account_transactions/{january}") // UPDATE operation for CRUD
    public @Valid Account_Transaction updateAccount_Transaction(@PathVariable(value="january") String january, @Valid @RequestBody Account_Transaction account_transaction)
            throws Account_TransactionNotFoundException {
        Account_Transaction atc = account_transactionRepository.findById(january).orElseThrow(()->new Account_TransactionNotFoundException(january));
        atc.setFeb(account_transaction.getFeb());
        Account_Transaction updAccount_Transaction = account_transactionRepository.save(atc);
        return updAccount_Transaction;
    }

}