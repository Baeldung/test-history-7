package com.baeldung.jacksonjr;

import com.fasterxml.jackson.jr.ob.api.ValueWriter;
import com.fasterxml.jackson.jr.ob.impl.JSONWriter;
import com.fasterxml.jackson.jr.private_.JsonGenerator;

import java.io.IOException;
import java.time.LocalDate;

public class CustomDateSerializer implements ValueWriter {
    @Override
    public void writeValue (JSONWriter jsonWriter, JsonGenerator jsonGenerator, Object o) throws IOException {
        jsonGenerator.writeString(o.toString());
    }

    @Override
    public Class<?> valueType () {
        return LocalDate.class;
    }
}
