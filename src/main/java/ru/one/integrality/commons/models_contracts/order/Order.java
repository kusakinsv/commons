package ru.one.integrality.commons.models_contracts.order;

import lombok.*;

import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private String orderId;
    private String instrumentId;
    private OrderStatus executionStatus;
    private String currency;
    private BigDecimal initialOrderPrice;
    private BigDecimal executedOrderPrice;
    private BigDecimal initialCommission;
    private BigDecimal executedCommission;
    private int lotsRequested;
    private int lotsExecuted;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orderId, order.orderId);
    }

    @Override
    public int hashCode() {
        return orderId != null ? orderId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return String.format(
                "Order (orderId=%s, figi=%s, currency=%s, executionStatus=%s, initialOrderPrice=%s, executedOrderPrice=%s, initialCommission=%s, executedCommission=%s, lotsRequested=%s, lotsExecuted=%s)", this.orderId, this.instrumentId, this.currency, this.executionStatus, this.initialOrderPrice, this.executedOrderPrice, this.initialCommission, this.executedCommission, this.lotsRequested, this.lotsExecuted);
    }
}
