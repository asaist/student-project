package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.mail.MailSender;
import edu.javacourse.studentorder.validator.ChildrenValidator;
import edu.javacourse.studentorder.validator.CityRegisterValidator;
import edu.javacourse.studentorder.validator.StudentValidator;
import edu.javacourse.studentorder.validator.WeddingValidator;

public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll(){
        while (true){
        StudentOrder so = readStudentOrder();
        if (so==null){
            break;
        }
            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if (!cityAnswer.success){
                //
                //continue;
                break;
            }
            AnswerWedding wedAnswer = checkWedding(so);
            AnswerChildren childAnswer = checkChilren(so);
            AnswerStudent studentAnswer = checkStudent(so);

            sendMail(so);
        }
    }

    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return so;
    }
    static AnswerCityRegister checkCityRegister(StudentOrder so){
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = "Host1";
        AnswerCityRegister ans1 = crv1.checkCityRegister(so);
        return ans1;
    }
    static AnswerWedding checkWedding(StudentOrder so){
        WeddingValidator wv = new WeddingValidator();
        return wv.checkWedding(so);
    }
    static AnswerChildren checkChilren(StudentOrder so){
        ChildrenValidator cv = new ChildrenValidator();
        return cv.checkChilren(so);
    }
    static AnswerStudent checkStudent(StudentOrder so){
        return new StudentValidator().checkStudent(so);
    }

    static void sendMail(StudentOrder so){
        new MailSender().sendMail(so);
    }
}
