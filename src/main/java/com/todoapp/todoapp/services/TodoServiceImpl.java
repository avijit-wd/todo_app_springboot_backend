package com.todoapp.todoapp.services;

import java.util.List;
import java.util.stream.Collectors;

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
	public void deleteTodo(String todoId) {
//		List<Todo> entity = getTodos()
//				.stream()
//				.filter(e -> e.getId().equals(todoId))
//				.collect(Collectors.toList());
		
		
		List<Todo> entity = getTodos();
		
		Todo c = null;
		
		for(Todo x : entity) {
			if(x.getId().equals(todoId)) {
				c = x;
			}
		}
		System.out.println(entity);

		System.out.println(c);
		
		todoDao.delete(c);
	}	
}
