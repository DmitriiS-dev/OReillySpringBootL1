package com.oreilly.demo.controllers;


import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerUnitTest {

    @Test
    void sayHello() {
        HelloController controller = new HelloController();
        Model model = new BindingAwareModelMap();
        String result = controller.sayHello("Dolly", model);
        // Runs both tests regardless if either one fails
        assertAll(
                () -> assertEquals("welcome", result),
                () -> assertEquals("Dolly", model.getAttribute("user"))
        );
    }
}