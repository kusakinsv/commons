package ru.one.integrality.commons.api_interaction.publication;


public record PriceLimitUpdateDto(
        String instrumentId,
        Double limitUp,
        Double limitDown
) {}
