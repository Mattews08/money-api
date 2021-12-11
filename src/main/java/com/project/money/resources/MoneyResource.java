package com.project.money.resources;

import com.project.money.models.Money;
import com.project.money.repository.MoneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class MoneyResource {

    @Autowired
    MoneyRepository moneyRepository;

    @GetMapping("/transactions")
    public List<Money> listaMoney() {
        return moneyRepository.findAll();
    }

    @GetMapping("/transactions/{id}")
    public Money listaMoneyUnico(@PathVariable(value="id") long id) {
        return moneyRepository.findById(id);
    }

    @PostMapping("/transactions")
    public Money saveMoney(@RequestBody Money money) {
        return moneyRepository.save(money);
    }
}
