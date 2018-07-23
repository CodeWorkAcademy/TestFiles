package com.nguyen.week3.project;

public class Skill {

    private String skillName;
    private String proficiency;

    public Skill() {

    }

    public Skill(String skillName, String proficiency) {
        this.skillName = skillName;
        this.proficiency = proficiency;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }
}
