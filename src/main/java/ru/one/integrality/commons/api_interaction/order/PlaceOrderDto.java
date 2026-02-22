package ru.one.integrality.commons.api_interaction.order;

public record PlaceOrderDto(
        String accountId,
        String instrumentId,
        OrderType orderType,
        TradingOperationType tradingOperationType,
        int amount,
        double price
) {}
