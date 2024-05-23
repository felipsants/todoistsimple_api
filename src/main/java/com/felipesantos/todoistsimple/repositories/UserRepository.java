package com.felipesantos.todoistsimple.repositories;

import com.felipesantos.todoistsimple.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
