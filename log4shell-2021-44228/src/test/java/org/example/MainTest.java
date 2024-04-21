package org.example;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void log() {
        Main.LogAsError("message as error");
    }
}