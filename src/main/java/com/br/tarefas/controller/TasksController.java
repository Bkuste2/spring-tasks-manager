package com.br.tarefas.controller;

import com.br.tarefas.service.TasksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TasksController {

    @Autowired
    TasksServiceImpl tasksService;

    @GetMapping("/tasks/list")
    public String list(Model model){
        model.addAttribute("tasks", tasksService.findAll());
        return "/tasks/list";
    }

    @GetMapping("/tasks/edit/{id}")
    public String edit(Model model, @PathVariable long id){
        model.addAttribute("tasks", tasksService.findById(id));
        return "tasks/edit";
    }
}
