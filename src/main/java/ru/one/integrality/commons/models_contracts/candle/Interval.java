package ru.one.integrality.commons.models_contracts.candle;

import lombok.Getter;

@Getter
public enum Interval {
    CANDLE_INTERVAL_UNSPECIFIED("CANDLE_INTERVAL_UNSPECIFIED", 0),
    CANDLE_INTERVAL_1_MIN("CANDLE_INTERVAL_1_MIN", 1),
    CANDLE_INTERVAL_5_MIN("CANDLE_INTERVAL_5_MIN", 5),
    CANDLE_INTERVAL_10_MIN("CANDLE_INTERVAL_10_MIN", 10),
    CANDLE_INTERVAL_15_MIN("CANDLE_INTERVAL_15_MIN", 15),
    CANDLE_INTERVAL_30_MIN("CANDLE_INTERVAL_30_MIN", 30),
    CANDLE_INTERVAL_1_HOUR("CANDLE_INTERVAL_1_HOUR", 60),
    CANDLE_INTERVAL_DAY("CANDLE_INTERVAL_DAY", 1440);

    private final String value;
    private final int minsInPeriod;

    Interval(String value, int minsInPeriod) {
        this.value = value;
        this.minsInPeriod = minsInPeriod;
    }
}
