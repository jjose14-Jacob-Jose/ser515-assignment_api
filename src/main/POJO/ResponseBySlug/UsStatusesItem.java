package main.POJO.ResponseBySlug;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsStatusesItem{

	@JsonProperty("color")
	private String color;

	@JsonProperty("is_archived")
	private boolean isArchived;

	@JsonProperty("project_id")
	private int projectId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("wip_limit")
	private Object wipLimit;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("order")
	private int order;

	@JsonProperty("is_closed")
	private boolean isClosed;

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setIsArchived(boolean isArchived){
		this.isArchived = isArchived;
	}

	public boolean isIsArchived(){
		return isArchived;
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

	public void setWipLimit(Object wipLimit){
		this.wipLimit = wipLimit;
	}

	public Object getWipLimit(){
		return wipLimit;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}

	public void setOrder(int order){
		this.order = order;
	}

	public int getOrder(){
		return order;
	}

	public void setIsClosed(boolean isClosed){
		this.isClosed = isClosed;
	}

	public boolean isIsClosed(){
		return isClosed;
	}
}