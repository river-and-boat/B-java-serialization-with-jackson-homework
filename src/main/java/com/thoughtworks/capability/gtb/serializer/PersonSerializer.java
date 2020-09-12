package com.thoughtworks.capability.gtb.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.thoughtworks.capability.gtb.vo.PersonVo;

import java.io.IOException;

public class PersonSerializer extends StdSerializer<PersonVo> {
    private static final String AGE_FIELD_NAME = "age";
    private static final String HOBBY_FIELD_NAME = "hobby";
    private static final String ID_FIELD_NAME = "id";
    private static final String NAME_FIELD_NAME = "name";

    private static final Integer DEFAULT_AGE_VALUE = 0;

    public PersonSerializer() {
        super(PersonVo.class);
    }

    @Override
    public void serialize(PersonVo person, JsonGenerator gen, SerializerProvider provider)
            throws IOException {
        gen.writeStartObject();
        gen.writeStringField(ID_FIELD_NAME, person.getId());
        if (person.getAge() == null) {
            gen.writeNumberField(AGE_FIELD_NAME, DEFAULT_AGE_VALUE);
        } else {
            gen.writeNumberField(AGE_FIELD_NAME, person.getAge());
        }
        gen.writeStringField(NAME_FIELD_NAME, person.getName());
        if (person.getHobby() != null) {
            gen.writeStringField(HOBBY_FIELD_NAME, person.getHobby());
        }
        gen.writeEndObject();
    }
}
