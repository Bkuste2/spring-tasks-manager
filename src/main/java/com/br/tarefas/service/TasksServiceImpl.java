package com.br.tarefas.service;

import com.br.tarefas.model.Tasks;
import com.br.tarefas.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TasksServiceImpl implements TasksService{

    @Autowired
    TasksRepository tasksRepository;

    @Override
    public List<Tasks> findAll() {
        return tasksRepository.findAll(Sort.by("id"));
    }

    @Override
    public Tasks findById(Long id) {
        Optional listTasks = tasksRepository.findById(id);
        if (!listTasks.isEmpty()){
            return (Tasks) listTasks.get();
        }
        else{
            return new Tasks();
        }
    }

    @Override
    public Tasks findByTitle(String title) {
        return tasksRepository.findByTitle(title);
    }
}
