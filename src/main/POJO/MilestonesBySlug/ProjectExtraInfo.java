package main.POJO.MilestonesBySlug;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectExtraInfo{

	@JsonProperty("name")
	private String name;

	@JsonProperty("logo_small_url")
	private String logoSmallUrl;

	@JsonProperty("id")
	private int id;

	@JsonProperty("slug")
	private String slug;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLogoSmallUrl(String logoSmallUrl){
		this.logoSmallUrl = logoSmallUrl;
	}

	public String getLogoSmallUrl(){
		return logoSmallUrl;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}
}