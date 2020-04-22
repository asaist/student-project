package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.domain.register.AnswerCityRegister;
import edu.javacourse.studentorder.mail.MailSender;
import edu.javacourse.studentorder.validator.ChildrenValidator;
import edu.javacourse.studentorder.validator.CityRegisterValidator;
import edu.javacourse.studentorder.validator.StudentValidator;
import edu.javacourse.studentorder.validator.WeddingValidator;

import java.util.LinkedList;
import java.util.List;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterValidator;
    private WeddingValidator weddingValidator;
    private ChildrenValidator childrenValidator;
    private StudentValidator studentValidator;
    private MailSender mailSender;

    public StudentOrderValidator(){
        cityRegisterValidator = new CityRegisterValidator();
        weddingValidator = new WeddingValidator();
        childrenValidator = new ChildrenValidator();
        studentValidator = new StudentValidator();
        mailSender = new MailSender();
    }

    public static void main(String[] args) {
       StudentOrderValidator sov = new StudentOrderValidator();
       sov.checkAll();
    }

    void checkAll(){
        List<StudentOrder> soList = readStudentOrders();
//        for (int i = 0; i<soArray.length;i++){
//            System.out.println();
//            CheckOneOrder(soArray[i]);
//        }
        for (StudentOrder so: soList){
            System.out.println();
            CheckOneOrder(so);
        }

    }

    public List<StudentOrder> readStudentOrders(){
        List<StudentOrder> soList = new LinkedList<>();
        for (int i = 0; i < 5; i++){
            StudentOrder so = SaveStudentOrder.buildStudentOrder(i);
            soList.add(so);
        }

        return soList;
    }

    public void CheckOneOrder(StudentOrder so){
        AnswerCityRegister cityAnswer = checkCityRegister(so);
//        AnswerWedding wedAnswer = checkWedding(so);
//        AnswerChildren childAnswer = checkChilren(so);
//        AnswerStudent studentAnswer = checkStudent(so);
        sendMail(so);
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so){
        return cityRegisterValidator.checkCityRegister(so);
    }
    public AnswerWedding checkWedding(StudentOrder so){
        return weddingValidator.checkWedding(so);
    }
    public AnswerChildren checkChilren(StudentOrder so){
        return childrenValidator.checkChilren(so);
    }
    public AnswerStudent checkStudent(StudentOrder so){
        return studentValidator.checkStudent(so);
    }

    public void sendMail(StudentOrder so) {
        mailSender.sendMail(so);
    }
}
