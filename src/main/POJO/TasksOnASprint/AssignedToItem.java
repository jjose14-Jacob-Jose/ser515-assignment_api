package main.POJO.TasksOnASprint;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AssignedToItem{

	@JsonProperty("full_name")
	private String fullName;

	@JsonProperty("count")
	private int count;

	@JsonProperty("id")
	private Object id;

	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	public String getFullName(){
		return fullName;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setId(Object id){
		this.id = id;
	}

	public Object getId(){
		return id;
	}
}