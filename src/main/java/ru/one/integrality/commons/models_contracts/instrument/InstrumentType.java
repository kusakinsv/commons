package ru.one.integrality.commons.models_contracts.instrument;

import lombok.Getter;

@Getter
public enum InstrumentType {
    SHARE("SHARE"),
    BOND("BOND"),
    FUTURE("FUTURE"),
    CURRENCY("CURRENCY"),
    ETF("ETF"),
    OTHER("OTHER"),
    INSTRUMENT("INSTRUMENT");

    private final String value;

    InstrumentType(String value) {
        this.value = value;
    }
}
