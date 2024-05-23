package com.felipesantos.todoistsimple.repositories;

import com.felipesantos.todoistsimple.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long > {

    List<Task> findByUser_Id(Long id);

    //Usando JPQL
    //@Query(value = "SELECT t FROM Task WHERE t.user.id")
    //List<Task> findByUser_Id(@Param("id")Long id); // Agora o nome da função pode ser qualquer um

    //Usando SQL
    //@Query(value ="SELECT * FROM task t WHERE t.user_id = :id",nativeQuery =true)
    //List<Task> findByUser_Id(@Param("id")Long id);
}
