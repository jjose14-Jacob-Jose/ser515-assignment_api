package main.POJO.MilestonesBySlug;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MilestonesByProject{

	@JsonProperty("owner")
	private int owner;

	@JsonProperty("user_stories")
	private List<UserStoriesItem> userStories;

	@JsonProperty("closed_points")
	private double closedPoints;

	@JsonProperty("total_points")
	private double totalPoints;

	@JsonProperty("project")
	private int project;

	@JsonProperty("project_extra_info")
	private ProjectExtraInfo projectExtraInfo;

	@JsonProperty("disponibility")
	private double disponibility;

	@JsonProperty("modified_date")
	private String modifiedDate;

	@JsonProperty("estimated_finish")
	private String estimatedFinish;

	@JsonProperty("estimated_start")
	private String estimatedStart;

	@JsonProperty("name")
	private String name;

	@JsonProperty("closed")
	private boolean closed;

	@JsonProperty("id")
	private int id;

	@JsonProperty("created_date")
	private String createdDate;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("order")
	private int order;

	public void setOwner(int owner){
		this.owner = owner;
	}

	public int getOwner(){
		return owner;
	}

	public void setUserStories(List<UserStoriesItem> userStories){
		this.userStories = userStories;
	}

	public List<UserStoriesItem> getUserStories(){
		return userStories;
	}

	public void setClosedPoints(double closedPoints){
		this.closedPoints = closedPoints;
	}

	public double getClosedPoints(){
		return closedPoints;
	}

	public void setTotalPoints(double totalPoints){
		this.totalPoints = totalPoints;
	}

	public double getTotalPoints(){
		return totalPoints;
	}

	public void setProject(int project){
		this.project = project;
	}

	public int getProject(){
		return project;
	}

	public void setProjectExtraInfo(ProjectExtraInfo projectExtraInfo){
		this.projectExtraInfo = projectExtraInfo;
	}

	public ProjectExtraInfo getProjectExtraInfo(){
		return projectExtraInfo;
	}

	public void setDisponibility(double disponibility){
		this.disponibility = disponibility;
	}

	public double getDisponibility(){
		return disponibility;
	}

	public void setModifiedDate(String modifiedDate){
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedDate(){
		return modifiedDate;
	}

	public void setEstimatedFinish(String estimatedFinish){
		this.estimatedFinish = estimatedFinish;
	}

	public String getEstimatedFinish(){
		return estimatedFinish;
	}

	public void setEstimatedStart(String estimatedStart){
		this.estimatedStart = estimatedStart;
	}

	public String getEstimatedStart(){
		return estimatedStart;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setClosed(boolean closed){
		this.closed = closed;
	}

	public boolean isClosed(){
		return closed;
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