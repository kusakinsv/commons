package ru.one.integrality.commons.models_contracts.instrument;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class MarketInstrument {
    private String api;
    private String id;
    private String additionalId;
    private String ticker;
    private String name;
    private String currency;
    private String exchange;
    private int oneLotPackSize;
    private double minPriceIncrement;
    private boolean apiTradeAvailableFlag;
    private boolean shortTradeAvailableFlag;
    private InstrumentType instrumentType;
    private final Map<String, Object> otherParams = new HashMap<>();

    @Override
    public String toString() {
        return "{\"MarketInstrument\n\":{"
                + "        \"api\":\"" + api + "\""
                + ",\n         \"id\":\"" + id + "\""
                + ",\n         \"additionalId\":\"" + additionalId + "\""
                + ",\n         \"ticker\":\"" + ticker + "\""
                + ",\n         \"name\":\"" + name + "\""
                + ",\n         \"currency\":\"" + currency + "\""
                + ",\n         \"exchange\":\"" + exchange + "\""
                + ",\n         \"oneLotPackSize\":\"" + oneLotPackSize + "\""
                + ",\n         \"minPriceIncrement\":\"" + minPriceIncrement + "\""
                + ",\n         \"apiTradeAvailableFlag\":\"" + apiTradeAvailableFlag + "\""
                + ",\n         \"shortTradeAvailableFlag\":\"" + shortTradeAvailableFlag + "\""
                + ",\n         \"instrumentType\":\"" + instrumentType + "\""
                + ",\n         \"otherParams\":" + otherParams
                + "}}";
    }
}

