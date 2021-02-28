package com.todoapp.todoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.todoapp.todoapp.entities.Todo;
import com.todoapp.todoapp.services.TodoService;

@RestController
public class TodoController {
	
	@Autowired
	public TodoService todoService;
	
	@GetMapping("/")
	public String home() {
		return "This is starting";
	}
	
	@GetMapping("/todos")
	public List<Todo> getTodos(){
		return this.todoService.getTodos();
	}
	
	@GetMapping("/todos/{todoId}")
	public Todo getTodo(@PathVariable  String todoId) {
		return this.todoService.getTodo(Long.parseLong(todoId));
	}
	@PostMapping("/todos")
	public Todo addTodo(@RequestBody Todo todo) {
		return this.todoService.addTodo(todo);
	}
	@PutMapping("/todos")
	public Todo updateTodo(@RequestBody Todo todo) {
		return this.todoService.updateTodo(todo);
	}
	@DeleteMapping("/todos/{todoId}")
	public ResponseEntity<HttpStatus> deleteTodo(@PathVariable String todoId) {
		try {
			this.todoService.deleteTodo(Long.parseLong(todoId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
