package com.example.demo3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

//@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class User_AccountController {
    @Autowired
    User_AccountRepository user_accountRepository;

    @GetMapping("/user_accounts")
    public List<User_Account> getAllUser_accounts() {
        return user_accountRepository.findAll();
    }

    @GetMapping("/user_accounts/{user_accountId}")
    public Optional<User_Account> getAllUser_accountById(@PathVariable(value="user_accountId") String user_accountId) {
        return user_accountRepository.findById(user_accountId);
    }

}