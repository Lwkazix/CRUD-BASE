package com.CRUD.CRUDBeatme.UsersRepositories;

import com.CRUD.CRUDBeatme.UsersModels.UserModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModels,Integer> {
}
