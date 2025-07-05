package com.example.metaphorce.task.Task.repository;

import com.example.metaphorce.task.Task.entity.TareaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TareaRepository extends JpaRepository<TareaEntity, Integer> {

    List<TareaEntity> findByCompletadaFalse();

}
