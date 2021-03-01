package com.todoapp.todoapp.services;

import java.util.List;

import com.todoapp.todoapp.entities.Todo;

public interface TodoService {
	
public List<Todo> getTodos();
		
	public Todo addTodo(Todo todo);

	public Todo updateTodo(Todo todo);
	
	public void deleteTodo(String todoId);
}
