package com.example.demo3;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Wire_RecieptantRepository extends JpaRepository<Wire_Recieptant, String> {
}