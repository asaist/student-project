package edu.javacourse.studentorder.domain;

public class Street {
    private Long streetCode;
    private String StreetName;

    public Street() {
    }

    public Street(Long streetCode, String streetName) {
        this.streetCode = streetCode;
        StreetName = streetName;
    }

    public Long getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(Long streetCode) {
        this.streetCode = streetCode;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String streetName) {
        StreetName = streetName;
    }
}
