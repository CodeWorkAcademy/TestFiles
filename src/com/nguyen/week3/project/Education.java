package com.nguyen.week3.project;

public class Education {

    private String universityName;
    private String degreeType; // Bachelors of Science (BS) vs. Bachelors of Art (BA)
    private String degreeName; // Biology, Business, IT
    private String city;
    private String state;

    public Education() {

    }

    public Education(String universityName, String degreeType, String degreeName, String city, String state) {
        this.universityName = universityName;
        this.degreeType = degreeType;
        this.degreeName = degreeName;
        this.city = city;
        this.state = state;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
