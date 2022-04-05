package taigaAPI.POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MembersItem{

	@JsonProperty("role_name")
	private String roleName;

	@JsonProperty("role")
	private int role;

	@JsonProperty("full_name")
	private String fullName;

	@JsonProperty("is_active")
	private boolean isActive;

	@JsonProperty("color")
	private String color;

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

	public void setRoleName(String roleName){
		this.roleName = roleName;
	}

	public String getRoleName(){
		return roleName;
	}

	public void setRole(int role){
		this.role = role;
	}

	public int getRole(){
		return role;
	}

	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	public String getFullName(){
		return fullName;
	}

	public void setIsActive(boolean isActive){
		this.isActive = isActive;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
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