package com.springboot.template.mysqltemplate.repository;

import org.springframework.data.repository.CrudRepository;
import com.springboot.template.mysqltemplate.model.MySqlUser;

public interface MySqlUserRepository extends CrudRepository<MySqlUser,Integer> {}
