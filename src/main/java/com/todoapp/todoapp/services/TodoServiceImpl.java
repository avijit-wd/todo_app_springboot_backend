package com.todoapp.todoapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todoapp.todoapp.dao.TodoDao;
import com.todoapp.todoapp.entities.Todo;

@Service
public class TodoServiceImpl implements TodoService {
	
	@Autowired
	private TodoDao todoDao;

	@Override
	public List<Todo> getTodos() {
		return todoDao.findAll();
	}

	@Override
	public Todo getTodo(long todoId) {
		return todoDao.getOne(todoId);
	}

	@Override
	public Todo addTodo(Todo todo) {
		todoDao.save(todo);
		return todo;
	}

	@Override
	public Todo updateTodo(Todo todo) {
		todoDao.save(todo);
		return todo;
	}

	@Override
	public void deleteTodo(long todoId) {
		Todo entity = todoDao.getOne(todoId);
		todoDao.delete(entity);
		
	}
	
}
