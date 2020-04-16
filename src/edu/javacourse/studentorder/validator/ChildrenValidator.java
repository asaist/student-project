package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerChildren;
import edu.javacourse.studentorder.domain.StudentOrder;

public class ChildrenValidator {
    public AnswerChildren checkChilren(StudentOrder so){
        System.out.println("Children is running");
        return new AnswerChildren();
    }
}
