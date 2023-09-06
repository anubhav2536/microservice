package com.microservice1.approve.reject.Services;

import com.microservice1.approve.reject.Model.APPROVED;
import com.microservice1.approve.reject.Repositeries.Repository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Repository repository;
    public String approve(int id){
     APPROVED apr = repository.findById(id).orElse(null);

     if(apr==null)
         return "no policy found with this number";
     apr.setApproved(true);
     repository.save(apr);
     return "success";
    }
    public String reject(int id){
        APPROVED apr = repository.findById(id).orElse(null);

        if(apr==null)
            return "no policy found with this number";
        apr.setApproved(false);
        repository.save(apr);
        return "success";
    }

}
