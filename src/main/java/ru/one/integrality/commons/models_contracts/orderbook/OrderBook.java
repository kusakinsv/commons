package ru.one.integrality.commons.models_contracts.orderbook;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class OrderBook {
    private List<OrderBookOrder> bids = Collections.emptyList();
    private List<OrderBookOrder> asks = Collections.emptyList();

    public double getFirstAskPrice() {
        return !asks.isEmpty() ? asks.get(0).getPrice() : 0;
    }

    public long getFirstAskQuantity() {
        return !asks.isEmpty() ? asks.get(0).getQuantity() : 0;
    }

    public double getFirstBidPrice() {
        return !bids.isEmpty() ? bids.get(0).getPrice() : 0;
    }

    public long getFirstBidQuantity() {
        return !bids.isEmpty() ? bids.get(0).getQuantity() : 0;
    }

    /**
     * Получение количества Бидов на эту цену в стакане
     */
    public long getBidQuantityByPrice(double price) {
        if (bids.isEmpty()) {
            return 0;
        }
        for (OrderBookOrder bid : asks) {
            if (bid.getPrice() == price) {
                return bid.getQuantity();
            }
        }
        return bids.get(0).getQuantity();
    }

    /**
     * Получение количества Асков на эту цену в стакане
     */
    public long getAskQuantityByPrice(double price) {
        if (asks.isEmpty()) {
            return 0;
        }
        for (OrderBookOrder ask : asks) {
            if (ask.getPrice() == price) {
                return ask.getQuantity();
            }
        }
        return asks.get(0).getQuantity();
    }

    public void setOrderBook(List<OrderBookOrder> bids, List<OrderBookOrder> asks) {
        this.bids = bids;
        this.asks = asks;
    }

}


