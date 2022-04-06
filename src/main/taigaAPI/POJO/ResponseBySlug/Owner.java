package taigaAPI.POJO.ResponseBySlug;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Owner{

	@JsonProperty("is_active")
	private boolean isActive;

	@JsonProperty("big_photo")
	private Object bigPhoto;

	@JsonProperty("photo")
	private Object photo;

	@JsonProperty("id")
	private int id;

	@JsonProperty("gravatar_id")
	private String gravatarId;

	@JsonProperty("full_name_display")
	private String fullNameDisplay;

	@JsonProperty("username")
	private String username;

	public void setIsActive(boolean isActive){
		this.isActive = isActive;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public void setBigPhoto(Object bigPhoto){
		this.bigPhoto = bigPhoto;
	}

	public Object getBigPhoto(){
		return bigPhoto;
	}

	public void setPhoto(Object photo){
		this.photo = photo;
	}

	public Object getPhoto(){
		return photo;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setGravatarId(String gravatarId){
		this.gravatarId = gravatarId;
	}

	public String getGravatarId(){
		return gravatarId;
	}

	public void setFullNameDisplay(String fullNameDisplay){
		this.fullNameDisplay = fullNameDisplay;
	}

	public String getFullNameDisplay(){
		return fullNameDisplay;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}
}