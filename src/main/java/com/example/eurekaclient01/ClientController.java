package com.example.eurekaclient01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @RequestMapping("/01")
    public String client01(){
        return "Hello Cloud";
    }
}
