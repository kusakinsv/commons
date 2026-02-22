package ru.one.integrality.commons.messaging;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class MessageMQ {
    private String api;
    private String type;
    private String payload;
    private Map<String, String> headers;

    public MessageMQ() {
    }

    public MessageMQ(String payload) {
        this.payload = payload;
    }

    public MessageMQ(String api, String type, String payload, Map<String, String> headers) {
        this.api = api;
        this.type = type;
        this.payload = payload;
        this.headers = headers;
    }
}
