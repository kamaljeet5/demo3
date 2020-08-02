package com.example.demo3;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_AccountRepository extends JpaRepository<User_Account, String> {
}