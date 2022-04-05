package taigaAPI.pojo;

import java.util.List;

public class ResponseItem{
	private int owner;
	private List<UserStoriesItem> userStories;
	private Object closedPoints;
	private double totalPoints;
	private int project;
	private ProjectExtraInfo projectExtraInfo;
	private double disponibility;
	private String modifiedDate;
	private String estimatedFinish;
	private String estimatedStart;
	private String name;
	private boolean closed;
	private int id;
	private String createdDate;
	private String slug;
	private int order;

	public int getOwner(){
		return owner;
	}

	public List<UserStoriesItem> getUserStories(){
		return userStories;
	}

	public Object getClosedPoints(){
		return closedPoints;
	}

	public double getTotalPoints(){
		return totalPoints;
	}

	public int getProject(){
		return project;
	}

	public ProjectExtraInfo getProjectExtraInfo(){
		return projectExtraInfo;
	}

	public double getDisponibility(){
		return disponibility;
	}

	public String getModifiedDate(){
		return modifiedDate;
	}

	public String getEstimatedFinish(){
		return estimatedFinish;
	}

	public String getEstimatedStart(){
		return estimatedStart;
	}

	public String getName(){
		return name;
	}

	public boolean isClosed(){
		return closed;
	}

	public int getId(){
		return id;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public String getSlug(){
		return slug;
	}

	public int getOrder(){
		return order;
	}
}