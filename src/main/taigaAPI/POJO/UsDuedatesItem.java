package taigaAPI.POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsDuedatesItem{

	@JsonProperty("by_default")
	private boolean byDefault;

	@JsonProperty("color")
	private String color;

	@JsonProperty("project_id")
	private int projectId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("days_to_due")
	private Object daysToDue;

	@JsonProperty("order")
	private int order;

	public void setByDefault(boolean byDefault){
		this.byDefault = byDefault;
	}

	public boolean isByDefault(){
		return byDefault;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setProjectId(int projectId){
		this.projectId = projectId;
	}

	public int getProjectId(){
		return projectId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setDaysToDue(Object daysToDue){
		this.daysToDue = daysToDue;
	}

	public Object getDaysToDue(){
		return daysToDue;
	}

	public void setOrder(int order){
		this.order = order;
	}

	public int getOrder(){
		return order;
	}
}