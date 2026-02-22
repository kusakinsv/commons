package ru.one.integrality.commons.models_contracts.orderbook;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderBookOrder {
    double price;
    long quantity;

    @Override
    public String toString() {
        return "{\"OrderBookOrder\n\":{"
                + "        \"price\":\"" + price + "\""
                + ",\n         \"quantity\":\"" + quantity + "\""
                + "}}";
    }
}
