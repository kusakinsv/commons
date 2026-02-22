package ru.one.integrality.commons.models_contracts.portfolio;

import lombok.Getter;
import lombok.Setter;
import ru.one.integrality.commons.models_contracts.instrument.InstrumentType;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Модель для позиций портфеля
 */
@Getter
@Setter
public class PortfolioPosition {
    private String instrumentId;
    private InstrumentType instrumentType;
    private int quantity;
    private BigDecimal averagePositionPrice;
    private BigDecimal expectedYield;
    private BigDecimal currentPrice;
    private int oneLotPackSize;
    private String currency;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PortfolioPosition portfolioPosition = (PortfolioPosition) o;
        return Objects.equals(instrumentId, portfolioPosition.instrumentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instrumentId);
    }

    @Override
    public String toString() {
        return String.format(
                "PortfolioPosition (figi=%s, instrumentType=%s, quantity=%s, averagePositionPrice=%s, expectedYield=%s, currentPrice=%s, oneLotPackSize=%s, currency=%s)", this.instrumentId, this.instrumentType, this.quantity, this.averagePositionPrice, this.expectedYield, this.currentPrice, this.oneLotPackSize, this.currency);
    }
}
