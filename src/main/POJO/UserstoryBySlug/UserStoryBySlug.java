package main.POJO.UserstoryBySlug;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserStoryBySlug{

	@JsonProperty("subject")
	private String subject;

	@JsonProperty("total_watchers")
	private int totalWatchers;

	@JsonProperty("total_points")
	private double totalPoints;

	@JsonProperty("project")
	private int project;

	@JsonProperty("points")
	private Points points;

	@JsonProperty("kanban_order")
	private long kanbanOrder;

	@JsonProperty("ref")
	private int ref;

	@JsonProperty("finish_date")
	private String finishDate;

	@JsonProperty("external_reference")
	private Object externalReference;

	@JsonProperty("assigned_to_extra_info")
	private Object assignedToExtraInfo;

	@JsonProperty("tribe_gig")
	private Object tribeGig;

	@JsonProperty("id")
	private int id;

	@JsonProperty("tasks")
	private List<Object> tasks;

	@JsonProperty("is_closed")
	private boolean isClosed;

	@JsonProperty("backlog_order")
	private long backlogOrder;

	@JsonProperty("generated_from_issue")
	private Object generatedFromIssue;

	@JsonProperty("milestone_slug")
	private String milestoneSlug;

	@JsonProperty("epic_order")
	private Object epicOrder;

	@JsonProperty("due_date_status")
	private String dueDateStatus;

	@JsonProperty("assigned_users")
	private List<Object> assignedUsers;

	@JsonProperty("modified_date")
	private String modifiedDate;

	@JsonProperty("version")
	private int version;

	@JsonProperty("is_watcher")
	private boolean isWatcher;

	@JsonProperty("tags")
	private List<String> tags;

	@JsonProperty("blocked_note")
	private String blockedNote;

	@JsonProperty("status")
	private int status;

	@JsonProperty("due_date_reason")
	private String dueDateReason;

	@JsonProperty("attachments")
	private List<Object> attachments;

	@JsonProperty("watchers")
	private List<Object> watchers;

	@JsonProperty("milestone_name")
	private String milestoneName;

	@JsonProperty("sprint_order")
	private int sprintOrder;

	@JsonProperty("project_extra_info")
	private ProjectExtraInfo projectExtraInfo;

	@JsonProperty("status_extra_info")
	private StatusExtraInfo statusExtraInfo;

	@JsonProperty("owner_extra_info")
	private OwnerExtraInfo ownerExtraInfo;

	@JsonProperty("epics")
	private Object epics;

	@JsonProperty("assigned_to")
	private Object assignedTo;

	@JsonProperty("owner")
	private int owner;

	@JsonProperty("total_comments")
	private int totalComments;

	@JsonProperty("total_attachments")
	private int totalAttachments;

	@JsonProperty("origin_task")
	private Object originTask;

	@JsonProperty("is_voter")
	private boolean isVoter;

	@JsonProperty("due_date")
	private Object dueDate;

	@JsonProperty("origin_issue")
	private Object originIssue;

	@JsonProperty("team_requirement")
	private boolean teamRequirement;

	@JsonProperty("is_blocked")
	private boolean isBlocked;

	@JsonProperty("milestone")
	private int milestone;

	@JsonProperty("generated_from_task")
	private Object generatedFromTask;

	@JsonProperty("client_requirement")
	private boolean clientRequirement;

	@JsonProperty("from_task_ref")
	private Object fromTaskRef;

	@JsonProperty("swimlane")
	private Object swimlane;

	@JsonProperty("comment")
	private String comment;

	@JsonProperty("created_date")
	private String createdDate;

	@JsonProperty("total_voters")
	private int totalVoters;

	public void setSubject(String subject){
		this.subject = subject;
	}

	public String getSubject(){
		return subject;
	}

	public void setTotalWatchers(int totalWatchers){
		this.totalWatchers = totalWatchers;
	}

	public int getTotalWatchers(){
		return totalWatchers;
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

	public void setFinishDate(String finishDate){
		this.finishDate = finishDate;
	}

	public String getFinishDate(){
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

	public void setTribeGig(Object tribeGig){
		this.tribeGig = tribeGig;
	}

	public Object getTribeGig(){
		return tribeGig;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTasks(List<Object> tasks){
		this.tasks = tasks;
	}

	public List<Object> getTasks(){
		return tasks;
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

	public void setGeneratedFromIssue(Object generatedFromIssue){
		this.generatedFromIssue = generatedFromIssue;
	}

	public Object getGeneratedFromIssue(){
		return generatedFromIssue;
	}

	public void setMilestoneSlug(String milestoneSlug){
		this.milestoneSlug = milestoneSlug;
	}

	public String getMilestoneSlug(){
		return milestoneSlug;
	}

	public void setEpicOrder(Object epicOrder){
		this.epicOrder = epicOrder;
	}

	public Object getEpicOrder(){
		return epicOrder;
	}

	public void setDueDateStatus(String dueDateStatus){
		this.dueDateStatus = dueDateStatus;
	}

	public String getDueDateStatus(){
		return dueDateStatus;
	}

	public void setAssignedUsers(List<Object> assignedUsers){
		this.assignedUsers = assignedUsers;
	}

	public List<Object> getAssignedUsers(){
		return assignedUsers;
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

	public void setIsWatcher(boolean isWatcher){
		this.isWatcher = isWatcher;
	}

	public boolean isIsWatcher(){
		return isWatcher;
	}

	public void setTags(List<String> tags){
		this.tags = tags;
	}

	public List<String> getTags(){
		return tags;
	}

	public void setBlockedNote(String blockedNote){
		this.blockedNote = blockedNote;
	}

	public String getBlockedNote(){
		return blockedNote;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	public void setDueDateReason(String dueDateReason){
		this.dueDateReason = dueDateReason;
	}

	public String getDueDateReason(){
		return dueDateReason;
	}

	public void setAttachments(List<Object> attachments){
		this.attachments = attachments;
	}

	public List<Object> getAttachments(){
		return attachments;
	}

	public void setWatchers(List<Object> watchers){
		this.watchers = watchers;
	}

	public List<Object> getWatchers(){
		return watchers;
	}

	public void setMilestoneName(String milestoneName){
		this.milestoneName = milestoneName;
	}

	public String getMilestoneName(){
		return milestoneName;
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

	public void setOwnerExtraInfo(OwnerExtraInfo ownerExtraInfo){
		this.ownerExtraInfo = ownerExtraInfo;
	}

	public OwnerExtraInfo getOwnerExtraInfo(){
		return ownerExtraInfo;
	}

	public void setEpics(Object epics){
		this.epics = epics;
	}

	public Object getEpics(){
		return epics;
	}

	public void setAssignedTo(Object assignedTo){
		this.assignedTo = assignedTo;
	}

	public Object getAssignedTo(){
		return assignedTo;
	}

	public void setOwner(int owner){
		this.owner = owner;
	}

	public int getOwner(){
		return owner;
	}

	public void setTotalComments(int totalComments){
		this.totalComments = totalComments;
	}

	public int getTotalComments(){
		return totalComments;
	}

	public void setTotalAttachments(int totalAttachments){
		this.totalAttachments = totalAttachments;
	}

	public int getTotalAttachments(){
		return totalAttachments;
	}

	public void setOriginTask(Object originTask){
		this.originTask = originTask;
	}

	public Object getOriginTask(){
		return originTask;
	}

	public void setIsVoter(boolean isVoter){
		this.isVoter = isVoter;
	}

	public boolean isIsVoter(){
		return isVoter;
	}

	public void setDueDate(Object dueDate){
		this.dueDate = dueDate;
	}

	public Object getDueDate(){
		return dueDate;
	}

	public void setOriginIssue(Object originIssue){
		this.originIssue = originIssue;
	}

	public Object getOriginIssue(){
		return originIssue;
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

	public void setGeneratedFromTask(Object generatedFromTask){
		this.generatedFromTask = generatedFromTask;
	}

	public Object getGeneratedFromTask(){
		return generatedFromTask;
	}

	public void setClientRequirement(boolean clientRequirement){
		this.clientRequirement = clientRequirement;
	}

	public boolean isClientRequirement(){
		return clientRequirement;
	}

	public void setFromTaskRef(Object fromTaskRef){
		this.fromTaskRef = fromTaskRef;
	}

	public Object getFromTaskRef(){
		return fromTaskRef;
	}

	public void setSwimlane(Object swimlane){
		this.swimlane = swimlane;
	}

	public Object getSwimlane(){
		return swimlane;
	}

	public void setComment(String comment){
		this.comment = comment;
	}

	public String getComment(){
		return comment;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setTotalVoters(int totalVoters){
		this.totalVoters = totalVoters;
	}

	public int getTotalVoters(){
		return totalVoters;
	}
}