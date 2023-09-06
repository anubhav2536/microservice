package com.microservice1.approve.reject.Repositeries;

import com.microservice1.approve.reject.Model.APPROVED;
import org.springframework.data.repository.CrudRepository;

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<APPROVED,Integer> {

}
