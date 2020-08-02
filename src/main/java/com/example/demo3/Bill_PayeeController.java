package com.example.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



//@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class Bill_PayeeController {
    @Autowired
    Bill_PayeeRepository bill_payeeRepository;

    @GetMapping("/bill_payees")
    public List<Bill_Payee> getAllBill_Payees() {
        return bill_payeeRepository.findAll();
    }

    @GetMapping("/bill_payees/{bill_payeeId}")
    public Optional<Bill_Payee> getAllBill_PayeeById(@PathVariable(value="bill_payeeId") String bill_payeeId) {
        return bill_payeeRepository.findById(bill_payeeId);
    }
    @PostMapping("/bill_payees")
    public @Valid
    Bill_Payee createBill_Payee(@Valid @RequestBody Bill_Payee bill_payee) {
        return bill_payeeRepository.save(bill_payee);
    }
    @DeleteMapping("bill_payees/{bill_payeeId}") // DELETE operation for CRUD
    public ResponseEntity<Void> deleteBill_Payee(@PathVariable("bill_payeeId") String bill_payeeId) throws Bill_PayeeNotFoundException {
        Bill_Payee bcc = bill_payeeRepository.findById(bill_payeeId).orElseThrow(() -> new Bill_PayeeNotFoundException(bill_payeeId));
        bill_payeeRepository.deleteById(bill_payeeId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    @PutMapping("/bill_payees/{bill_payeeId}") // UPDATE operation for CRUD
    public @Valid Bill_Payee updateBill_Payee(@PathVariable(value="bill_payeeId") String bill_payeeId, @Valid @RequestBody Bill_Payee bill_payee)
            throws Bill_PayeeNotFoundException {
        Bill_Payee bcc = bill_payeeRepository.findById(bill_payeeId).orElseThrow(()->new Bill_PayeeNotFoundException(bill_payeeId));
        bcc.setBill_payeeName(bill_payee.getBill_payeeName());
        Bill_Payee updBill_Payee = bill_payeeRepository.save(bcc);
        return updBill_Payee;
    }
}