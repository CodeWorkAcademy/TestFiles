package com.nguyen.week3.project;

public class Experience {

    private String jobTitle;
    private String companyName;
    private int workDuration;
    private String description;

    public Experience() {

    }

    public Experience(String jobTitle, String companyName, int workDuration, String description) {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.workDuration = workDuration;
        this.description = description;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getWorkDuration() {
        return workDuration;
    }

    public void setWorkDuration(int workDuration) {
        this.workDuration = workDuration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
