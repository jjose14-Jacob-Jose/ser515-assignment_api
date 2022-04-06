package taigaAPI.POJO.UserstoryBySlug;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectExtraInfo{

	@JsonProperty("name")
	private String name;

	@JsonProperty("logo_small_url")
	private Object logoSmallUrl;

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

	public void setLogoSmallUrl(Object logoSmallUrl){
		this.logoSmallUrl = logoSmallUrl;
	}

	public Object getLogoSmallUrl(){
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