package com.example.demo3;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bill_PayeeRepository extends JpaRepository<Bill_Payee, String> {
}