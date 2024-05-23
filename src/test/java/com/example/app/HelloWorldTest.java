package com.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    @Test
    public void testSayHello() {
        com.example.app.HelloWorld helloWorld = new com.example.app.HelloWorld();
        assertEquals("Hello, World!", helloWorld.sayHello());
    }
}