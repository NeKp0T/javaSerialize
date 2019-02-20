package com.example.serialize;

public class Serialization {
    static void serialize(Object o, OutputStream outputStream);
    static <T> T deserialize(InputStream, Class<T>);
}