package taigaAPI.POJO;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RolesItem{

	@JsonProperty("project_id")
	private int projectId;

	@JsonProperty("permissions")
	private List<String> permissions;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("computable")
	private boolean computable;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("order")
	private int order;

	public void setProjectId(int projectId){
		this.projectId = projectId;
	}

	public int getProjectId(){
		return projectId;
	}

	public void setPermissions(List<String> permissions){
		this.permissions = permissions;
	}

	public List<String> getPermissions(){
		return permissions;
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

	public void setComputable(boolean computable){
		this.computable = computable;
	}

	public boolean isComputable(){
		return computable;
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
}