package ru.one.integrality.commons.api_interaction.order;

public record CancelOrderDto(
        String accountId,
        String orderId
) {}
