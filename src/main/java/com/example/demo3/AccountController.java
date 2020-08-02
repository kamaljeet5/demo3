package com.example.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



//@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class AccountController {
    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/accounts")
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @GetMapping("/accounts/{accountId}")
    public Optional<Account> getAllAccountById(@PathVariable(value = "accountId") String accountId) {
        return accountRepository.findById(accountId);
    }

    @PostMapping("/accounts")
    public @Valid
    Account createAccount(@Valid @RequestBody Account account) {
        return accountRepository.save(account);
    }

    @DeleteMapping("accounts/{accountId}") // DELETE operation for CRUD
    public ResponseEntity<Void> deleteAccount(@PathVariable("accountId") String accountId) throws AccountNotFoundException {
        Account acc = accountRepository.findById(accountId).orElseThrow(() -> new AccountNotFoundException(accountId));
        accountRepository.deleteById(accountId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    @PutMapping("/accounts/{accountId}") // UPDATE operation for CRUD
    public @Valid Account updateAccount(@PathVariable(value="accountId") String accountId, @Valid @RequestBody Account account)
            throws AccountNotFoundException {
        Account acc = accountRepository.findById(accountId).orElseThrow(()->new AccountNotFoundException(accountId));
        acc.setAccountName(account.getAccountName());
        Account updAccount = accountRepository.save(acc);
        return updAccount;
    }
}