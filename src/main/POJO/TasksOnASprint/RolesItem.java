package main.POJO.TasksOnASprint;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RolesItem{

	@JsonProperty("color")
	private Object color;

	@JsonProperty("name")
	private String name;

	@JsonProperty("count")
	private int count;

	@JsonProperty("id")
	private int id;

	@JsonProperty("order")
	private int order;

	public void setColor(Object color){
		this.color = color;
	}

	public Object getColor(){
		return color;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setOrder(int order){
		this.order = order;
	}

	public int getOrder(){
		return order;
	}
}