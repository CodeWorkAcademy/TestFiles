package com.nguyen.week3.project;

import java.util.ArrayList;

public class Resume {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;

    private ArrayList<Experience> experiences;
    private ArrayList<Education> educations;
    private ArrayList<Skill> skills;

    public Resume() {
        experiences = new ArrayList<>();
        educations = new ArrayList<>();
        skills = new ArrayList<>();
    }

    public Resume(String firstName, String lastName, String email, String phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNo = phoneNo;
        experiences = new ArrayList<>();
        educations = new ArrayList<>();
        skills = new ArrayList<>();
    }

    public void addSkill(Skill aSkill) {
        this.skills.add(aSkill);
    }

    public void addEducation(Education anEducation) {
        this.educations.add(anEducation);
    }

    public void addExperience(Experience anExperience) {
        this.experiences.add(anExperience);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public ArrayList<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(ArrayList<Experience> experiences) {
        this.experiences = experiences;
    }

    public ArrayList<Education> getEducations() {
        return educations;
    }

    public void setEducations(ArrayList<Education> educations) {
        this.educations = educations;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }
}
