package com.thomasjayconsulting.multidb.repository;

import com.thomasjayconsulting.multidb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
