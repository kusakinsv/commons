package ru.one.integrality.commons.api_interaction.publication;

public record LastPriceUpdateDto(
        String instrumentId,
        double price
) {}
