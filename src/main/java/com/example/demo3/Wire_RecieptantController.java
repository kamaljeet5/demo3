package com.example.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



//@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class Wire_RecieptantController {
    @Autowired
    Wire_RecieptantRepository wire_recieptantRepository;

    @GetMapping("/wire_recieptants")
    public List<Wire_Recieptant> getAllWire_Recieptants() {
        return wire_recieptantRepository.findAll();
    }

    @GetMapping("/wire_recieptants/{wire_Id}")
    public Optional<Wire_Recieptant> getAllWire_RecieptantById(@PathVariable(value="wire_Id") String wire_Id) {
        return wire_recieptantRepository.findById(wire_Id);
    }
}