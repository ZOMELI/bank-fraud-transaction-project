package com.zomeli.spring.kafka.streams.serializers;

import com.google.gson.Gson;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import org.apache.kafka.common.serialization.Serializer;

public class JsonSerializer<T> implements Serializer<T> {
    private final Gson gson = new Gson();

    @Override
    public void configure(Map<String, ?> map, boolean b) {
    }

    @Override
    public byte[] serialize(String topic, T t) {
        return gson.toJson(t).getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public void close() {
    }

}