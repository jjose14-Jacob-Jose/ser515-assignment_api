package taigaAPI.POJO;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseBySlug{

	@JsonProperty("tags_colors")
	private TagsColors tagsColors;

	@JsonProperty("epic_statuses")
	private List<EpicStatusesItem> epicStatuses;

	@JsonProperty("task_statuses")
	private List<TaskStatusesItem> taskStatuses;

	@JsonProperty("total_watchers")
	private int totalWatchers;

	@JsonProperty("total_activity")
	private int totalActivity;

	@JsonProperty("swimlanes")
	private Object swimlanes;

	@JsonProperty("creation_template")
	private int creationTemplate;

	@JsonProperty("default_us_status")
	private int defaultUsStatus;

	@JsonProperty("issue_duedates")
	private List<IssueDuedatesItem> issueDuedates;

	@JsonProperty("us_duedates")
	private List<UsDuedatesItem> usDuedates;

	@JsonProperty("total_activity_last_week")
	private int totalActivityLastWeek;

	@JsonProperty("points")
	private List<PointsItem> points;

	@JsonProperty("notify_level")
	private Object notifyLevel;

	@JsonProperty("total_memberships")
	private int totalMemberships;

	@JsonProperty("is_backlog_activated")
	private boolean isBacklogActivated;

	@JsonProperty("anon_permissions")
	private List<String> anonPermissions;

	@JsonProperty("default_priority")
	private int defaultPriority;

	@JsonProperty("i_am_admin")
	private boolean iAmAdmin;

	@JsonProperty("priorities")
	private List<PrioritiesItem> priorities;

	@JsonProperty("members")
	private List<MembersItem> members;

	@JsonProperty("logo_big_url")
	private Object logoBigUrl;

	@JsonProperty("total_fans_last_month")
	private int totalFansLastMonth;

	@JsonProperty("id")
	private int id;

	@JsonProperty("default_epic_status")
	private int defaultEpicStatus;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("total_fans_last_year")
	private int totalFansLastYear;

	@JsonProperty("is_issues_activated")
	private boolean isIssuesActivated;

	@JsonProperty("issue_custom_attributes")
	private Object issueCustomAttributes;

	@JsonProperty("is_looking_for_people")
	private boolean isLookingForPeople;

	@JsonProperty("us_statuses")
	private List<UsStatusesItem> usStatuses;

	@JsonProperty("logo_small_url")
	private Object logoSmallUrl;

	@JsonProperty("epic_custom_attributes")
	private List<EpicCustomAttributesItem> epicCustomAttributes;

	@JsonProperty("modified_date")
	private String modifiedDate;

	@JsonProperty("blocked_code")
	private Object blockedCode;

	@JsonProperty("default_task_status")
	private int defaultTaskStatus;

	@JsonProperty("my_homepage")
	private String myHomepage;

	@JsonProperty("my_permissions")
	private List<String> myPermissions;

	@JsonProperty("is_watcher")
	private boolean isWatcher;

	@JsonProperty("task_custom_attributes")
	private List<TaskCustomAttributesItem> taskCustomAttributes;

	@JsonProperty("tags")
	private List<Object> tags;

	@JsonProperty("total_story_points")
	private Object totalStoryPoints;

	@JsonProperty("is_epics_activated")
	private boolean isEpicsActivated;

	@JsonProperty("task_duedates")
	private List<TaskDuedatesItem> taskDuedates;

	@JsonProperty("is_contact_activated")
	private boolean isContactActivated;

	@JsonProperty("videoconferences_extra_data")
	private Object videoconferencesExtraData;

	@JsonProperty("total_fans")
	private int totalFans;

	@JsonProperty("is_kanban_activated")
	private boolean isKanbanActivated;

	@JsonProperty("looking_for_people_note")
	private String lookingForPeopleNote;

	@JsonProperty("userstory_custom_attributes")
	private List<UserstoryCustomAttributesItem> userstoryCustomAttributes;

	@JsonProperty("name")
	private String name;

	@JsonProperty("i_am_owner")
	private boolean iAmOwner;

	@JsonProperty("default_points")
	private int defaultPoints;

	@JsonProperty("i_am_member")
	private boolean iAmMember;

	@JsonProperty("totals_updated_datetime")
	private String totalsUpdatedDatetime;

	@JsonProperty("default_severity")
	private int defaultSeverity;

	@JsonProperty("is_private")
	private boolean isPrivate;

	@JsonProperty("is_out_of_owner_limits")
	private boolean isOutOfOwnerLimits;

	@JsonProperty("default_swimlane")
	private Object defaultSwimlane;

	@JsonProperty("is_wiki_activated")
	private boolean isWikiActivated;

	@JsonProperty("roles")
	private List<RolesItem> roles;

	@JsonProperty("description")
	private String description;

	@JsonProperty("is_fan")
	private boolean isFan;

	@JsonProperty("public_permissions")
	private List<String> publicPermissions;

	@JsonProperty("default_issue_type")
	private int defaultIssueType;

	@JsonProperty("total_activity_last_year")
	private int totalActivityLastYear;

	@JsonProperty("total_activity_last_month")
	private int totalActivityLastMonth;

	@JsonProperty("issue_statuses")
	private List<IssueStatusesItem> issueStatuses;

	@JsonProperty("owner")
	private Owner owner;

	@JsonProperty("total_fans_last_week")
	private int totalFansLastWeek;

	@JsonProperty("videoconferences")
	private Object videoconferences;

	@JsonProperty("issue_types")
	private List<IssueTypesItem> issueTypes;

	@JsonProperty("default_issue_status")
	private int defaultIssueStatus;

	@JsonProperty("total_milestones")
	private Object totalMilestones;

	@JsonProperty("total_closed_milestones")
	private int totalClosedMilestones;

	@JsonProperty("created_date")
	private String createdDate;

	@JsonProperty("milestones")
	private List<MilestonesItem> milestones;

	@JsonProperty("is_featured")
	private boolean isFeatured;

	@JsonProperty("severities")
	private List<SeveritiesItem> severities;

	public void setTagsColors(TagsColors tagsColors){
		this.tagsColors = tagsColors;
	}

	public TagsColors getTagsColors(){
		return tagsColors;
	}

	public void setEpicStatuses(List<EpicStatusesItem> epicStatuses){
		this.epicStatuses = epicStatuses;
	}

	public List<EpicStatusesItem> getEpicStatuses(){
		return epicStatuses;
	}

	public void setTaskStatuses(List<TaskStatusesItem> taskStatuses){
		this.taskStatuses = taskStatuses;
	}

	public List<TaskStatusesItem> getTaskStatuses(){
		return taskStatuses;
	}

	public void setTotalWatchers(int totalWatchers){
		this.totalWatchers = totalWatchers;
	}

	public int getTotalWatchers(){
		return totalWatchers;
	}

	public void setTotalActivity(int totalActivity){
		this.totalActivity = totalActivity;
	}

	public int getTotalActivity(){
		return totalActivity;
	}

	public void setSwimlanes(Object swimlanes){
		this.swimlanes = swimlanes;
	}

	public Object getSwimlanes(){
		return swimlanes;
	}

	public void setCreationTemplate(int creationTemplate){
		this.creationTemplate = creationTemplate;
	}

	public int getCreationTemplate(){
		return creationTemplate;
	}

	public void setDefaultUsStatus(int defaultUsStatus){
		this.defaultUsStatus = defaultUsStatus;
	}

	public int getDefaultUsStatus(){
		return defaultUsStatus;
	}

	public void setIssueDuedates(List<IssueDuedatesItem> issueDuedates){
		this.issueDuedates = issueDuedates;
	}

	public List<IssueDuedatesItem> getIssueDuedates(){
		return issueDuedates;
	}

	public void setUsDuedates(List<UsDuedatesItem> usDuedates){
		this.usDuedates = usDuedates;
	}

	public List<UsDuedatesItem> getUsDuedates(){
		return usDuedates;
	}

	public void setTotalActivityLastWeek(int totalActivityLastWeek){
		this.totalActivityLastWeek = totalActivityLastWeek;
	}

	public int getTotalActivityLastWeek(){
		return totalActivityLastWeek;
	}

	public void setPoints(List<PointsItem> points){
		this.points = points;
	}

	public List<PointsItem> getPoints(){
		return points;
	}

	public void setNotifyLevel(Object notifyLevel){
		this.notifyLevel = notifyLevel;
	}

	public Object getNotifyLevel(){
		return notifyLevel;
	}

	public void setTotalMemberships(int totalMemberships){
		this.totalMemberships = totalMemberships;
	}

	public int getTotalMemberships(){
		return totalMemberships;
	}

	public void setIsBacklogActivated(boolean isBacklogActivated){
		this.isBacklogActivated = isBacklogActivated;
	}

	public boolean isIsBacklogActivated(){
		return isBacklogActivated;
	}

	public void setAnonPermissions(List<String> anonPermissions){
		this.anonPermissions = anonPermissions;
	}

	public List<String> getAnonPermissions(){
		return anonPermissions;
	}

	public void setDefaultPriority(int defaultPriority){
		this.defaultPriority = defaultPriority;
	}

	public int getDefaultPriority(){
		return defaultPriority;
	}

	public void setIAmAdmin(boolean iAmAdmin){
		this.iAmAdmin = iAmAdmin;
	}

	public boolean isIAmAdmin(){
		return iAmAdmin;
	}

	public void setPriorities(List<PrioritiesItem> priorities){
		this.priorities = priorities;
	}

	public List<PrioritiesItem> getPriorities(){
		return priorities;
	}

	public void setMembers(List<MembersItem> members){
		this.members = members;
	}

	public List<MembersItem> getMembers(){
		return members;
	}

	public void setLogoBigUrl(Object logoBigUrl){
		this.logoBigUrl = logoBigUrl;
	}

	public Object getLogoBigUrl(){
		return logoBigUrl;
	}

	public void setTotalFansLastMonth(int totalFansLastMonth){
		this.totalFansLastMonth = totalFansLastMonth;
	}

	public int getTotalFansLastMonth(){
		return totalFansLastMonth;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setDefaultEpicStatus(int defaultEpicStatus){
		this.defaultEpicStatus = defaultEpicStatus;
	}

	public int getDefaultEpicStatus(){
		return defaultEpicStatus;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}

	public void setTotalFansLastYear(int totalFansLastYear){
		this.totalFansLastYear = totalFansLastYear;
	}

	public int getTotalFansLastYear(){
		return totalFansLastYear;
	}

	public void setIsIssuesActivated(boolean isIssuesActivated){
		this.isIssuesActivated = isIssuesActivated;
	}

	public boolean isIsIssuesActivated(){
		return isIssuesActivated;
	}

	public void setIssueCustomAttributes(Object issueCustomAttributes){
		this.issueCustomAttributes = issueCustomAttributes;
	}

	public Object getIssueCustomAttributes(){
		return issueCustomAttributes;
	}

	public void setIsLookingForPeople(boolean isLookingForPeople){
		this.isLookingForPeople = isLookingForPeople;
	}

	public boolean isIsLookingForPeople(){
		return isLookingForPeople;
	}

	public void setUsStatuses(List<UsStatusesItem> usStatuses){
		this.usStatuses = usStatuses;
	}

	public List<UsStatusesItem> getUsStatuses(){
		return usStatuses;
	}

	public void setLogoSmallUrl(Object logoSmallUrl){
		this.logoSmallUrl = logoSmallUrl;
	}

	public Object getLogoSmallUrl(){
		return logoSmallUrl;
	}

	public void setEpicCustomAttributes(List<EpicCustomAttributesItem> epicCustomAttributes){
		this.epicCustomAttributes = epicCustomAttributes;
	}

	public List<EpicCustomAttributesItem> getEpicCustomAttributes(){
		return epicCustomAttributes;
	}

	public void setModifiedDate(String modifiedDate){
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedDate(){
		return modifiedDate;
	}

	public void setBlockedCode(Object blockedCode){
		this.blockedCode = blockedCode;
	}

	public Object getBlockedCode(){
		return blockedCode;
	}

	public void setDefaultTaskStatus(int defaultTaskStatus){
		this.defaultTaskStatus = defaultTaskStatus;
	}

	public int getDefaultTaskStatus(){
		return defaultTaskStatus;
	}

	public void setMyHomepage(String myHomepage){
		this.myHomepage = myHomepage;
	}

	public String getMyHomepage(){
		return myHomepage;
	}

	public void setMyPermissions(List<String> myPermissions){
		this.myPermissions = myPermissions;
	}

	public List<String> getMyPermissions(){
		return myPermissions;
	}

	public void setIsWatcher(boolean isWatcher){
		this.isWatcher = isWatcher;
	}

	public boolean isIsWatcher(){
		return isWatcher;
	}

	public void setTaskCustomAttributes(List<TaskCustomAttributesItem> taskCustomAttributes){
		this.taskCustomAttributes = taskCustomAttributes;
	}

	public List<TaskCustomAttributesItem> getTaskCustomAttributes(){
		return taskCustomAttributes;
	}

	public void setTags(List<Object> tags){
		this.tags = tags;
	}

	public List<Object> getTags(){
		return tags;
	}

	public void setTotalStoryPoints(Object totalStoryPoints){
		this.totalStoryPoints = totalStoryPoints;
	}

	public Object getTotalStoryPoints(){
		return totalStoryPoints;
	}

	public void setIsEpicsActivated(boolean isEpicsActivated){
		this.isEpicsActivated = isEpicsActivated;
	}

	public boolean isIsEpicsActivated(){
		return isEpicsActivated;
	}

	public void setTaskDuedates(List<TaskDuedatesItem> taskDuedates){
		this.taskDuedates = taskDuedates;
	}

	public List<TaskDuedatesItem> getTaskDuedates(){
		return taskDuedates;
	}

	public void setIsContactActivated(boolean isContactActivated){
		this.isContactActivated = isContactActivated;
	}

	public boolean isIsContactActivated(){
		return isContactActivated;
	}

	public void setVideoconferencesExtraData(Object videoconferencesExtraData){
		this.videoconferencesExtraData = videoconferencesExtraData;
	}

	public Object getVideoconferencesExtraData(){
		return videoconferencesExtraData;
	}

	public void setTotalFans(int totalFans){
		this.totalFans = totalFans;
	}

	public int getTotalFans(){
		return totalFans;
	}

	public void setIsKanbanActivated(boolean isKanbanActivated){
		this.isKanbanActivated = isKanbanActivated;
	}

	public boolean isIsKanbanActivated(){
		return isKanbanActivated;
	}

	public void setLookingForPeopleNote(String lookingForPeopleNote){
		this.lookingForPeopleNote = lookingForPeopleNote;
	}

	public String getLookingForPeopleNote(){
		return lookingForPeopleNote;
	}

	public void setUserstoryCustomAttributes(List<UserstoryCustomAttributesItem> userstoryCustomAttributes){
		this.userstoryCustomAttributes = userstoryCustomAttributes;
	}

	public List<UserstoryCustomAttributesItem> getUserstoryCustomAttributes(){
		return userstoryCustomAttributes;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setIAmOwner(boolean iAmOwner){
		this.iAmOwner = iAmOwner;
	}

	public boolean isIAmOwner(){
		return iAmOwner;
	}

	public void setDefaultPoints(int defaultPoints){
		this.defaultPoints = defaultPoints;
	}

	public int getDefaultPoints(){
		return defaultPoints;
	}

	public void setIAmMember(boolean iAmMember){
		this.iAmMember = iAmMember;
	}

	public boolean isIAmMember(){
		return iAmMember;
	}

	public void setTotalsUpdatedDatetime(String totalsUpdatedDatetime){
		this.totalsUpdatedDatetime = totalsUpdatedDatetime;
	}

	public String getTotalsUpdatedDatetime(){
		return totalsUpdatedDatetime;
	}

	public void setDefaultSeverity(int defaultSeverity){
		this.defaultSeverity = defaultSeverity;
	}

	public int getDefaultSeverity(){
		return defaultSeverity;
	}

	public void setIsPrivate(boolean isPrivate){
		this.isPrivate = isPrivate;
	}

	public boolean isIsPrivate(){
		return isPrivate;
	}

	public void setIsOutOfOwnerLimits(boolean isOutOfOwnerLimits){
		this.isOutOfOwnerLimits = isOutOfOwnerLimits;
	}

	public boolean isIsOutOfOwnerLimits(){
		return isOutOfOwnerLimits;
	}

	public void setDefaultSwimlane(Object defaultSwimlane){
		this.defaultSwimlane = defaultSwimlane;
	}

	public Object getDefaultSwimlane(){
		return defaultSwimlane;
	}

	public void setIsWikiActivated(boolean isWikiActivated){
		this.isWikiActivated = isWikiActivated;
	}

	public boolean isIsWikiActivated(){
		return isWikiActivated;
	}

	public void setRoles(List<RolesItem> roles){
		this.roles = roles;
	}

	public List<RolesItem> getRoles(){
		return roles;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setIsFan(boolean isFan){
		this.isFan = isFan;
	}

	public boolean isIsFan(){
		return isFan;
	}

	public void setPublicPermissions(List<String> publicPermissions){
		this.publicPermissions = publicPermissions;
	}

	public List<String> getPublicPermissions(){
		return publicPermissions;
	}

	public void setDefaultIssueType(int defaultIssueType){
		this.defaultIssueType = defaultIssueType;
	}

	public int getDefaultIssueType(){
		return defaultIssueType;
	}

	public void setTotalActivityLastYear(int totalActivityLastYear){
		this.totalActivityLastYear = totalActivityLastYear;
	}

	public int getTotalActivityLastYear(){
		return totalActivityLastYear;
	}

	public void setTotalActivityLastMonth(int totalActivityLastMonth){
		this.totalActivityLastMonth = totalActivityLastMonth;
	}

	public int getTotalActivityLastMonth(){
		return totalActivityLastMonth;
	}

	public void setIssueStatuses(List<IssueStatusesItem> issueStatuses){
		this.issueStatuses = issueStatuses;
	}

	public List<IssueStatusesItem> getIssueStatuses(){
		return issueStatuses;
	}

	public void setOwner(Owner owner){
		this.owner = owner;
	}

	public Owner getOwner(){
		return owner;
	}

	public void setTotalFansLastWeek(int totalFansLastWeek){
		this.totalFansLastWeek = totalFansLastWeek;
	}

	public int getTotalFansLastWeek(){
		return totalFansLastWeek;
	}

	public void setVideoconferences(Object videoconferences){
		this.videoconferences = videoconferences;
	}

	public Object getVideoconferences(){
		return videoconferences;
	}

	public void setIssueTypes(List<IssueTypesItem> issueTypes){
		this.issueTypes = issueTypes;
	}

	public List<IssueTypesItem> getIssueTypes(){
		return issueTypes;
	}

	public void setDefaultIssueStatus(int defaultIssueStatus){
		this.defaultIssueStatus = defaultIssueStatus;
	}

	public int getDefaultIssueStatus(){
		return defaultIssueStatus;
	}

	public void setTotalMilestones(Object totalMilestones){
		this.totalMilestones = totalMilestones;
	}

	public Object getTotalMilestones(){
		return totalMilestones;
	}

	public void setTotalClosedMilestones(int totalClosedMilestones){
		this.totalClosedMilestones = totalClosedMilestones;
	}

	public int getTotalClosedMilestones(){
		return totalClosedMilestones;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setMilestones(List<MilestonesItem> milestones){
		this.milestones = milestones;
	}

	public List<MilestonesItem> getMilestones(){
		return milestones;
	}

	public void setIsFeatured(boolean isFeatured){
		this.isFeatured = isFeatured;
	}

	public boolean isIsFeatured(){
		return isFeatured;
	}

	public void setSeverities(List<SeveritiesItem> severities){
		this.severities = severities;
	}

	public List<SeveritiesItem> getSeverities(){
		return severities;
	}
}