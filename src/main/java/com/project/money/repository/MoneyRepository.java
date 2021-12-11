package com.project.money.repository;

import com.project.money.models.Money;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoneyRepository extends JpaRepository<Money, Long> {

    Money findById(long id);
}
