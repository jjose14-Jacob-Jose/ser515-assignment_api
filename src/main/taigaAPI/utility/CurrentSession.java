package taigaAPI.utility;

import taigaAPI.POJO.ResponseBySlug.ResponseBySlug;

public class CurrentSession {
    private String authenticationToke;
    private String projectSlug;
    private ResponseBySlug responseBySlug;

    public ResponseBySlug getResponseBySlug() {
        return responseBySlug;
    }

    public void setResponseBySlug(ResponseBySlug responseBySlug) {
        this.responseBySlug = responseBySlug;
    }

    public String getAuthenticationToke() {
        return authenticationToke;
    }

    public void setAuthenticationToke(String authenticationToke) {
        this.authenticationToke = authenticationToke;
    }

    public String getProjectSlug() {
        return projectSlug;
    }

    public void setProjectSlug(String projectSlug) {
        this.projectSlug = projectSlug;
    }
}
