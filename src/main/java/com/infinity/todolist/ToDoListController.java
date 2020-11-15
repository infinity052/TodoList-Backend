package com.infinity.todolist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoListController {
	@Autowired
	private TaskRepository taskRepository;
	
	@CrossOrigin(origins = "https://infinity052.github.io")
	@GetMapping("/")
	List<Task> getTasks(){
		return taskRepository.findAll();
	}
	
	@CrossOrigin(origins = "https://infinity052.github.io")
	@PostMapping("/add")
	Task addTask(String task){
		Task newTask = new Task(task);
		taskRepository.save(newTask);
		return newTask;
	}

	@CrossOrigin(origins = "https://infinity052.github.io")
	@DeleteMapping("/delete")
	void deleteTask(long id) {
		taskRepository.deleteById(id);
	}
}
