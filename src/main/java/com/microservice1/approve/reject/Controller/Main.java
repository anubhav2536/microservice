package com.microservice1.approve.reject.Controller;

import com.microservice1.approve.reject.Services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
    @Autowired
    Service service;
    @GetMapping("/MarkStatus/{str}/{id}")
    public String mark(@PathVariable String str,@PathVariable int id){
        if(str.equals("approve"))
       return  service.approve(id);
        else
          return  service.reject(id);
    }



}
