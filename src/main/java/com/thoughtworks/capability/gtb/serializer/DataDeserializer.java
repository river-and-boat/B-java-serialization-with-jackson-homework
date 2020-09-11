package com.thoughtworks.capability.gtb.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.Instant;
import java.util.Date;

public class DataDeserializer extends StdDeserializer<Date> {
    protected DataDeserializer() {
        super(Date.class);
    }

    @Override
    public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        Instant instant = Instant.ofEpochMilli(p.getLongValue());
        return Date.from(instant);
    }
}
