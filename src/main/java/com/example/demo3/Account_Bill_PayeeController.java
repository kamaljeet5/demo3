package com.example.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



//@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class Account_Bill_PayeeController {
    @Autowired
    Account_Bill_PayeeRepository account_bill_payeeRepository;

    @GetMapping("/account_bill_payees")
    public List<Account_Bill_Payee> getAllAccount_Bill_Payees() {
        return account_bill_payeeRepository.findAll();
    }

    @GetMapping("/account_bill_payees/{account_bill_payeeId}")
    public Optional<Account_Bill_Payee> getAllAccount_Bill_PayeeById(@PathVariable(value="account_bill_payeeId") String account_bill_payeeId) {
        return account_bill_payeeRepository.findById(account_bill_payeeId);
    }
    @PostMapping("/account_bill_payees")
    public @Valid
    Account_Bill_Payee createAccount_Bill_Payee(@Valid @RequestBody Account_Bill_Payee account_bill_payee) {
        return account_bill_payeeRepository.save(account_bill_payee);
    }
    @DeleteMapping("account_bill_payees/{account_bill_payeeId}") // DELETE operation for CRUD
    public ResponseEntity<Void> deleteAccount_Bill_Payee(@PathVariable("account_bill_payeeId") String account_bill_payeeId) throws Account_Bill_PayeeNotFoundException {
        Account_Bill_Payee accbill = account_bill_payeeRepository.findById(account_bill_payeeId).orElseThrow(() -> new Account_Bill_PayeeNotFoundException(account_bill_payeeId));
        account_bill_payeeRepository.deleteById(account_bill_payeeId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    @PutMapping("/account_bill_payees/{account_bill_payeeId}") // UPDATE operation for CRUD
    public @Valid Account_Bill_Payee updateAccount_Bill_Payee(@PathVariable(value="account_bill_payeeId") String account_bill_payeeId, @Valid @RequestBody Account_Bill_Payee account_bill_payee)
            throws Account_Bill_PayeeNotFoundException {
        Account_Bill_Payee abp = account_bill_payeeRepository.findById(account_bill_payeeId).orElseThrow(()->new Account_Bill_PayeeNotFoundException(account_bill_payeeId));
        abp.setAccount_bill_payeeName(account_bill_payee.getAccount_bill_payeeName());
        Account_Bill_Payee updAccount_Bill_Payee = account_bill_payeeRepository.save(abp);
        return updAccount_Bill_Payee;
    }
}
