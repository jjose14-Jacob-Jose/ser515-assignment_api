package taigaAPI.POJO.MilestonesBySlug;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AssignedToExtraInfo{

	@JsonProperty("is_active")
	private boolean isActive;

	@JsonProperty("big_photo")
	private String bigPhoto;

	@JsonProperty("photo")
	private String photo;

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

	public void setBigPhoto(String bigPhoto){
		this.bigPhoto = bigPhoto;
	}

	public String getBigPhoto(){
		return bigPhoto;
	}

	public void setPhoto(String photo){
		this.photo = photo;
	}

	public String getPhoto(){
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