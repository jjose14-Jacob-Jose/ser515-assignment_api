package main.POJO.ResponseBySlug;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskCustomAttributesItem{

	@JsonProperty("project_id")
	private int projectId;

	@JsonProperty("extra")
	private Object extra;

	@JsonProperty("name")
	private String name;

	@JsonProperty("description")
	private String description;

	@JsonProperty("id")
	private int id;

	@JsonProperty("created_date")
	private String createdDate;

	@JsonProperty("modified_date")
	private String modifiedDate;

	@JsonProperty("type")
	private String type;

	@JsonProperty("order")
	private int order;

	public void setProjectId(int projectId){
		this.projectId = projectId;
	}

	public int getProjectId(){
		return projectId;
	}

	public void setExtra(Object extra){
		this.extra = extra;
	}

	public Object getExtra(){
		return extra;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setModifiedDate(String modifiedDate){
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedDate(){
		return modifiedDate;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setOrder(int order){
		this.order = order;
	}

	public int getOrder(){
		return order;
	}
}