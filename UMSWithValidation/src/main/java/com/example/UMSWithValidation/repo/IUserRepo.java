package com.example.UMSWithValidation.repo;

import com.example.UMSWithValidation.model.UserManagement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<UserManagement,Integer> {

}
