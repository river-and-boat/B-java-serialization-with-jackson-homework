package com.thoughtworks.capability.gtb.deserializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.util.Date;

/**
 * @Auto Jiang Yuzhou
 * @Date 2020/9/12 7:55
 * @Description ***
 **/
public class DateTimeDeserializer extends StdSerializer<Date> {
    protected DateTimeDeserializer() {
        super(Date.class);
    }

    @Override
    public void serialize(Date date, JsonGenerator gen, SerializerProvider provider)
            throws IOException {
        gen.writeNumber(date.getTime());
    }
}
