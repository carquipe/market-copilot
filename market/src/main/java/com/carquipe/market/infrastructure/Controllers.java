package com.carquipe.market.infrastructure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @GetMapping("hello")
    public String index(){
        return "Hello World";
    }
}
