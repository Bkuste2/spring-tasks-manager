package com.br.tarefas.repository;

import com.br.tarefas.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TasksRepository extends JpaRepository<Tasks, Long> {

    public List<Tasks> findAll();
    public Tasks findByTitle(String title);
    public Tasks findByDescription(String description);
    public Tasks findByTime(String time);

}
