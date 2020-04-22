package edu.javacourse.studentorder.domain.register;

import edu.javacourse.studentorder.domain.Person;

public class AnswerCityRegisterItem {

    public enum CityStatus {
        YES, NO, ERROR;
    }
    public static class CityError{
        private String code;
        private String name;

        public CityError(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }
    }

    private CityStatus status;
    private Person person;
    private CityError error;

    public AnswerCityRegisterItem(CityStatus status, Person person, CityError error) {
        this.status = status;
        this.person = person;
        this.error = error;
    }

    public AnswerCityRegisterItem(CityStatus status, Person person) {
        this.status = status;
        this.person = person;
    }

    public CityStatus getStatus() {
        return status;
    }

    public Person getPerson() {
        return person;
    }

    public CityError getError() {
        return error;
    }
}
