package com.bala.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bala.model.Mobile;

@Repository
public interface MobileRepo extends CrudRepository<Mobile, Integer> {

}
