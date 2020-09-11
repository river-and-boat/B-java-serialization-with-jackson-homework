package com.thoughtworks.capability.gtb.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.thoughtworks.capability.gtb.vo.PersonVo;

import java.io.IOException;

public class PersonSerializer extends StdSerializer<PersonVo> {

    protected PersonSerializer() {
        super(PersonVo.class);
    }

    @Override
    public void serialize(PersonVo personVo, JsonGenerator gen, SerializerProvider provider) throws IOException {
        if (personVo.getAge() == null) {
            personVo.setAge(0);
        }
        gen.writeObject(personVo);
    }
}
