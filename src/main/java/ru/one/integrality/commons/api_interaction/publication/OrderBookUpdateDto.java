package ru.one.integrality.commons.api_interaction.publication;


import ru.one.integrality.commons.models_contracts.orderbook.OrderBookOrder;

import java.util.List;

public record OrderBookUpdateDto(
        String instrumentId,
        List<OrderBookOrder> bids,
        List<OrderBookOrder> asks
) {}
