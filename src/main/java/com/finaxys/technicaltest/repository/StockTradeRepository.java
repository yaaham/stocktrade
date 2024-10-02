package com.finaxys.technicaltest.repository;

import com.finaxys.technicaltest.model.StockTrade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockTradeRepository extends JpaRepository<StockTrade,Integer> {

}
