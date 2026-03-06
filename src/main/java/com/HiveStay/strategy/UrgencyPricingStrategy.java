package com.HiveStay.strategy;

import com.HiveStay.entity.Inventory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
public class UrgencyPricingStrategy implements PricingStrategy{
    private final PricingStrategy wrapped;

    @Override
    public BigDecimal calculatePrice(Inventory inventory) {
        BigDecimal price = wrapped.calculatePrice(inventory);

        //checkin date is within 7 days from today's date, it's urgency so increase price
        LocalDate today = LocalDate.now();
        if(!inventory.getDate().isBefore(today) && inventory.getDate().isBefore(today.plusDays(7))){
            price = price.multiply(BigDecimal.valueOf(1.15));
        }
        return price;
    }
}
