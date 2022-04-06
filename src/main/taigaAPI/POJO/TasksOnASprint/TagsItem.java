package taigaAPI.POJO.TasksOnASprint;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TagsItem{

	@JsonProperty("color")
	private Object color;

	@JsonProperty("name")
	private String name;

	@JsonProperty("count")
	private int count;

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
}