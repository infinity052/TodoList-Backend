package com.infinity.todolist;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Task {
	@Id @GeneratedValue private long id;
	private String task;
	Task(){
		super();
	}
	Task(String task){
		this.task = task;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}

}
