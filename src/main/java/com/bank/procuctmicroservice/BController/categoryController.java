package com.bank.procuctmicroservice.BController;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/category")
@Getter
@Setter
@RefreshScope
public class categoryController {
@Value("${app.testprod}")
    private String testprod;
@GetMapping("test-prod")
    public String getTestprod() {
        return this.testprod;
 }
}
