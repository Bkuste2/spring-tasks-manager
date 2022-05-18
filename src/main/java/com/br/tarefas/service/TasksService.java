package com.br.tarefas.service;

import com.br.tarefas.model.Tasks;

import java.util.List;

public interface TasksService {

    public List<Tasks> findAll();
    public Tasks findById(Long id);
    public Tasks findByTitle(String title);

}
