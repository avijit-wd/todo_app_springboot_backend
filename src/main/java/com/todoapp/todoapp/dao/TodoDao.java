package com.todoapp.todoapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todoapp.todoapp.entities.Todo;

public interface TodoDao extends JpaRepository<Todo, Long>{

	
}

