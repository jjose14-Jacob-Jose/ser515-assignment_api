package taigaAPI.POJO.TasksOnASprint;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TasksOnASprint{

	@JsonProperty("roles")
	private List<RolesItem> roles;

	@JsonProperty("statuses")
	private List<StatusesItem> statuses;

	@JsonProperty("owners")
	private List<Object> owners;

	@JsonProperty("assigned_to")
	private List<AssignedToItem> assignedTo;

	@JsonProperty("tags")
	private List<TagsItem> tags;

	public void setRoles(List<RolesItem> roles){
		this.roles = roles;
	}

	public List<RolesItem> getRoles(){
		return roles;
	}

	public void setStatuses(List<StatusesItem> statuses){
		this.statuses = statuses;
	}

	public List<StatusesItem> getStatuses(){
		return statuses;
	}

	public void setOwners(List<Object> owners){
		this.owners = owners;
	}

	public List<Object> getOwners(){
		return owners;
	}

	public void setAssignedTo(List<AssignedToItem> assignedTo){
		this.assignedTo = assignedTo;
	}

	public List<AssignedToItem> getAssignedTo(){
		return assignedTo;
	}

	public void setTags(List<TagsItem> tags){
		this.tags = tags;
	}

	public List<TagsItem> getTags(){
		return tags;
	}
}