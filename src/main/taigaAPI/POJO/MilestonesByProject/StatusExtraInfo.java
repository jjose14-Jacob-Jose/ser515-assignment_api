package taigaAPI.POJO.MilestonesByProject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatusExtraInfo{

	@JsonProperty("color")
	private String color;

	@JsonProperty("name")
	private String name;

	@JsonProperty("is_closed")
	private boolean isClosed;

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setIsClosed(boolean isClosed){
		this.isClosed = isClosed;
	}

	public boolean isIsClosed(){
		return isClosed;
	}
}