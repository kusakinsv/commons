package ru.one.integrality.commons.models_contracts.candle;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class Candle {
    private String instrumentId;
    private String ticker;
    private CandleType type;
    private Interval interval;
    private BigDecimal open;
    private BigDecimal closed;
    private BigDecimal high;
    private BigDecimal low;
    private Integer volume;
    private OffsetDateTime time;

    public Candle figi(String figi) {
        this.instrumentId = figi;
        return this;
    }

    public Candle(String instrumentId, String ticker, Interval interval, BigDecimal open, BigDecimal closed, BigDecimal high, BigDecimal low, Integer volume, OffsetDateTime time) {
        this.instrumentId = instrumentId;
        this.ticker = ticker;
        this.interval = interval;
        this.open = open;
        this.closed = closed;
        this.high = high;
        this.low = low;
        this.volume = volume;
        this.time = time;
        this.type = ((open.floatValue() < closed.floatValue()) ? CandleType.BULL : CandleType.BEAR);
    }

    @Override
    public String toString() {
        return String.format(
                "Candle %s|%s|%s|%s|open=%.2f|high=%.2f|low=%.2f|closed=%.2f|v=%8s| %s", this.ticker, this.instrumentId, this.type, this.interval, this.open.doubleValue(), this.high.doubleValue(), this.low.doubleValue(), this.closed.doubleValue(), this.volume, this.time);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candle candle = (Candle) o;
        return Objects.equals(ticker, candle.ticker) && interval == candle.interval && Objects.equals(open, candle.open) && Objects.equals(closed, candle.closed) && Objects.equals(high, candle.high) && Objects.equals(low, candle.low) && Objects.equals(volume, candle.volume) && Objects.equals(time, candle.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instrumentId, open, closed, high, low, volume, time);
    }
}
