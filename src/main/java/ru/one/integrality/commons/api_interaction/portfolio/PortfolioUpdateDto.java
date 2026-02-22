package ru.one.integrality.commons.api_interaction.portfolio;

import ru.one.integrality.commons.models_contracts.portfolio.PortfolioPosition;

import java.util.Set;

public record PortfolioUpdateDto(
        String accountId,
        Set<PortfolioPosition> positions
) {}
