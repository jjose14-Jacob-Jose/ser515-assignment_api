package main.POJO.ResponseBySlug;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TagsColors{

	@JsonProperty("pp")
	private Object pp;

	@JsonProperty("gui")
	private Object gui;

	@JsonProperty("tag 1")
	private Object tag1;

	@JsonProperty("tag 3")
	private Object tag3;

	@JsonProperty("tag 4")
	private Object tag4;

	public void setPp(Object pp){
		this.pp = pp;
	}

	public Object getPp(){
		return pp;
	}

	public void setGui(Object gui){
		this.gui = gui;
	}

	public Object getGui(){
		return gui;
	}

	public void setTag1(Object tag1){
		this.tag1 = tag1;
	}

	public Object getTag1(){
		return tag1;
	}

	public void setTag3(Object tag3){
		this.tag3 = tag3;
	}

	public Object getTag3(){
		return tag3;
	}

	public void setTag4(Object tag4){
		this.tag4 = tag4;
	}

	public Object getTag4(){
		return tag4;
	}
}