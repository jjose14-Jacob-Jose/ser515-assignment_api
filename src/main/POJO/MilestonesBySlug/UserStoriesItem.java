package main.POJO.MilestonesBySlug;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserStoriesItem{

	@JsonProperty("due_date_reason")
	private String dueDateReason;

	@JsonProperty("subject")
	private String subject;

	@JsonProperty("total_points")
	private double totalPoints;

	@JsonProperty("project")
	private int project;

	@JsonProperty("sprint_order")
	private int sprintOrder;

	@JsonProperty("project_extra_info")
	private ProjectExtraInfo projectExtraInfo;

	@JsonProperty("status_extra_info")
	private StatusExtraInfo statusExtraInfo;

	@JsonProperty("epics")
	private Object epics;

	@JsonProperty("points")
	private Points points;

	@JsonProperty("kanban_order")
	private long kanbanOrder;

	@JsonProperty("ref")
	private int ref;

	@JsonProperty("finish_date")
	private Object finishDate;

	@JsonProperty("external_reference")
	private Object externalReference;

	@JsonProperty("assigned_to_extra_info")
	private Object assignedToExtraInfo;

	@JsonProperty("id")
	private int id;

	@JsonProperty("assigned_to")
	private Object assignedTo;

	@JsonProperty("is_closed")
	private boolean isClosed;

	@JsonProperty("backlog_order")
	private long backlogOrder;

	@JsonProperty("due_date")
	private Object dueDate;

	@JsonProperty("due_date_status")
	private String dueDateStatus;

	@JsonProperty("modified_date")
	private String modifiedDate;

	@JsonProperty("version")
	private int version;

	@JsonProperty("team_requirement")
	private boolean teamRequirement;

	@JsonProperty("is_blocked")
	private boolean isBlocked;

	@JsonProperty("milestone")
	private int milestone;

	@JsonProperty("blocked_note")
	private String blockedNote;

	@JsonProperty("client_requirement")
	private boolean clientRequirement;

	@JsonProperty("created_date")
	private String createdDate;

	@JsonProperty("status")
	private int status;

	public void setDueDateReason(String dueDateReason){
		this.dueDateReason = dueDateReason;
	}

	public String getDueDateReason(){
		return dueDateReason;
	}

	public void setSubject(String subject){
		this.subject = subject;
	}

	public String getSubject(){
		return subject;
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

	public void setSprintOrder(int sprintOrder){
		this.sprintOrder = sprintOrder;
	}

	public int getSprintOrder(){
		return sprintOrder;
	}

	public void setProjectExtraInfo(ProjectExtraInfo projectExtraInfo){
		this.projectExtraInfo = projectExtraInfo;
	}

	public ProjectExtraInfo getProjectExtraInfo(){
		return projectExtraInfo;
	}

	public void setStatusExtraInfo(StatusExtraInfo statusExtraInfo){
		this.statusExtraInfo = statusExtraInfo;
	}

	public StatusExtraInfo getStatusExtraInfo(){
		return statusExtraInfo;
	}

	public void setEpics(Object epics){
		this.epics = epics;
	}

	public Object getEpics(){
		return epics;
	}

	public void setPoints(Points points){
		this.points = points;
	}

	public Points getPoints(){
		return points;
	}

	public void setKanbanOrder(long kanbanOrder){
		this.kanbanOrder = kanbanOrder;
	}

	public long getKanbanOrder(){
		return kanbanOrder;
	}

	public void setRef(int ref){
		this.ref = ref;
	}

	public int getRef(){
		return ref;
	}

	public void setFinishDate(Object finishDate){
		this.finishDate = finishDate;
	}

	public Object getFinishDate(){
		return finishDate;
	}

	public void setExternalReference(Object externalReference){
		this.externalReference = externalReference;
	}

	public Object getExternalReference(){
		return externalReference;
	}

	public void setAssignedToExtraInfo(Object assignedToExtraInfo){
		this.assignedToExtraInfo = assignedToExtraInfo;
	}

	public Object getAssignedToExtraInfo(){
		return assignedToExtraInfo;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setAssignedTo(Object assignedTo){
		this.assignedTo = assignedTo;
	}

	public Object getAssignedTo(){
		return assignedTo;
	}

	public void setIsClosed(boolean isClosed){
		this.isClosed = isClosed;
	}

	public boolean isIsClosed(){
		return isClosed;
	}

	public void setBacklogOrder(long backlogOrder){
		this.backlogOrder = backlogOrder;
	}

	public long getBacklogOrder(){
		return backlogOrder;
	}

	public void setDueDate(Object dueDate){
		this.dueDate = dueDate;
	}

	public Object getDueDate(){
		return dueDate;
	}

	public void setDueDateStatus(String dueDateStatus){
		this.dueDateStatus = dueDateStatus;
	}

	public String getDueDateStatus(){
		return dueDateStatus;
	}

	public void setModifiedDate(String modifiedDate){
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedDate(){
		return modifiedDate;
	}

	public void setVersion(int version){
		this.version = version;
	}

	public int getVersion(){
		return version;
	}

	public void setTeamRequirement(boolean teamRequirement){
		this.teamRequirement = teamRequirement;
	}

	public boolean isTeamRequirement(){
		return teamRequirement;
	}

	public void setIsBlocked(boolean isBlocked){
		this.isBlocked = isBlocked;
	}

	public boolean isIsBlocked(){
		return isBlocked;
	}

	public void setMilestone(int milestone){
		this.milestone = milestone;
	}

	public int getMilestone(){
		return milestone;
	}

	public void setBlockedNote(String blockedNote){
		this.blockedNote = blockedNote;
	}

	public String getBlockedNote(){
		return blockedNote;
	}

	public void setClientRequirement(boolean clientRequirement){
		this.clientRequirement = clientRequirement;
	}

	public boolean isClientRequirement(){
		return clientRequirement;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}
}