package com.appicenter.demo.AppicenterProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RefreshScope
@RequestMapping("/")
public class ProductController {

    @Value("${server.port}")
    private String port;

    @Value("${service.info}")
    private String info;

    @Value("${service.category}")
    private String category;

    @Autowired
    ProductsRepository productsRepository;

    @RequestMapping("/getServiceInfo")
    public String getServiceInfo(){
        return info+" running at "+port+" in category "+category;
    }

    @GetMapping("/products")
    public List<Products> getProducts(){
        return productsRepository.findAll();
    }

    @GetMapping("/productsByCategory/{category}")
    public List<Products> getProductsByCat(@PathVariable String category){
        return productsRepository.findByCategory(category);
    }
}
