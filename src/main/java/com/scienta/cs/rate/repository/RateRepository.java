package com.scienta.cs.rate.repository;

import com.scienta.cs.rate.model.entity.Rate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RateRepository extends JpaRepository<Rate, String> {
}
