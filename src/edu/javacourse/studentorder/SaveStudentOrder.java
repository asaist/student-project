package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.other.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        buildStudentOrder(10);
    }
    static long saveStudentOrder(StudentOrder studentOrder){
        long answer;
        answer=199;
        System.out.println("saveStudentOrder");
        return answer;
    }
    public static StudentOrder buildStudentOrder(long id){
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        StudentOrder so1=so;
        printStudentOrder(so1);
        Adult husband = new Adult("Васильев","Андрей","Петрович", null);

        return so;
    }
    static void printStudentOrder(StudentOrder stor){
        System.out.println(stor.getStudentOrderId());

    }
}
