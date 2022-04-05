package taigaAPI.pojo;

public class UserStoriesItem{
	private String dueDateReason;
	private String subject;
	private double totalPoints;
	private int project;
	private int sprintOrder;
	private ProjectExtraInfo projectExtraInfo;
	private StatusExtraInfo statusExtraInfo;
	private Object epics;
	private Points points;
	private long kanbanOrder;
	private int ref;
	private Object finishDate;
	private Object externalReference;
	private Object assignedToExtraInfo;
	private int id;
	private Object assignedTo;
	private boolean isClosed;
	private long backlogOrder;
	private Object dueDate;
	private String dueDateStatus;
	private String modifiedDate;
	private int version;
	private boolean teamRequirement;
	private boolean isBlocked;
	private int milestone;
	private String blockedNote;
	private boolean clientRequirement;
	private String createdDate;
	private int status;

	public String getDueDateReason(){
		return dueDateReason;
	}

	public String getSubject(){
		return subject;
	}

	public double getTotalPoints(){
		return totalPoints;
	}

	public int getProject(){
		return project;
	}

	public int getSprintOrder(){
		return sprintOrder;
	}

	public ProjectExtraInfo getProjectExtraInfo(){
		return projectExtraInfo;
	}

	public StatusExtraInfo getStatusExtraInfo(){
		return statusExtraInfo;
	}

	public Object getEpics(){
		return epics;
	}

	public Points getPoints(){
		return points;
	}

	public long getKanbanOrder(){
		return kanbanOrder;
	}

	public int getRef(){
		return ref;
	}

	public Object getFinishDate(){
		return finishDate;
	}

	public Object getExternalReference(){
		return externalReference;
	}

	public Object getAssignedToExtraInfo(){
		return assignedToExtraInfo;
	}

	public int getId(){
		return id;
	}

	public Object getAssignedTo(){
		return assignedTo;
	}

	public boolean isIsClosed(){
		return isClosed;
	}

	public long getBacklogOrder(){
		return backlogOrder;
	}

	public Object getDueDate(){
		return dueDate;
	}

	public String getDueDateStatus(){
		return dueDateStatus;
	}

	public String getModifiedDate(){
		return modifiedDate;
	}

	public int getVersion(){
		return version;
	}

	public boolean isTeamRequirement(){
		return teamRequirement;
	}

	public boolean isIsBlocked(){
		return isBlocked;
	}

	public int getMilestone(){
		return milestone;
	}

	public String getBlockedNote(){
		return blockedNote;
	}

	public boolean isClientRequirement(){
		return clientRequirement;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public int getStatus(){
		return status;
	}
}
