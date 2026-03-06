package com.HiveStay.strategy;

import com.HiveStay.entity.Inventory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@AllArgsConstructor
public class HolidayPricingStrategy implements PricingStrategy{

    private final PricingStrategy wrapped;
    @Override
    public BigDecimal calculatePrice(Inventory inventory) {
        BigDecimal price = wrapped.calculatePrice(inventory);
        boolean isTodayHoliday = true;  //TODO: call an API or make Array
        if(isTodayHoliday){
            price = price.multiply(BigDecimal.valueOf((1.25)));
        }
        return price;
    }
}
