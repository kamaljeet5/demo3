package com.example.demo3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Account_TransactionRepository extends JpaRepository<Account_Transaction, String> {
}