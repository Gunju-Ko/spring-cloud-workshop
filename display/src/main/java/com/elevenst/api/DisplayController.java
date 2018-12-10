package com.elevenst.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/displays")
public class DisplayController {

    @GetMapping(path = "/{displayId}")
    public String getDisplayDetail(@PathVariable String displayId) {
        String productInfo = "[unknown]";
        return String.format("[display id = %s at %s %s ]", displayId, System.currentTimeMillis(), productInfo);
    }
}