package com.HiveStay.strategy;

import com.HiveStay.entity.Inventory;

import java.math.BigDecimal;

public class BasePricingStrategy implements PricingStrategy{
    @Override
    public BigDecimal calculatePrice(Inventory inventory) {
        return inventory.getRoom().getBasePrice();  //Inventory->Room->basePrice
    }
}
