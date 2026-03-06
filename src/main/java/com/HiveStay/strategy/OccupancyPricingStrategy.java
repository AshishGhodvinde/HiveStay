package com.HiveStay.strategy;

import com.HiveStay.entity.Inventory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@AllArgsConstructor
public class OccupancyPricingStrategy implements PricingStrategy{
    private final PricingStrategy wrapped;

    @Override
    public BigDecimal calculatePrice(Inventory inventory) {
        BigDecimal price = wrapped.calculatePrice(inventory);
        double occupancyRate = (double) inventory.getBookedCount() / inventory.getTotalCount();
        if(occupancyRate > 0.8) {   //high occupancy, so charging more xd
            price = price.multiply(BigDecimal.valueOf(1.2));
        }
        return price;
    }
}
