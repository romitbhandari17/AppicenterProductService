package com.appicenter.demo.AppicenterProductService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Value("${server.port}")
    private String port;

    @Value("${service.info}")
    private String info;

    @Value("${service.category}")
    private String category;

    @RequestMapping("/")
    public String getProduct(){
        return info+" running at "+port+" in category "+category;
    }
}
