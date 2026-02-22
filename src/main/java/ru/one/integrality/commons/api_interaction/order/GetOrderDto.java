package ru.one.integrality.commons.api_interaction.order;

public record GetOrderDto(
        String accountId,
        String orderId
) {}
