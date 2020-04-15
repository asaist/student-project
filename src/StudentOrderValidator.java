public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll(){
        while (true){
        StudentOrder so = readStudentOrder();
        System.out.println("Start");
        if (so==null){
            break;
        }
        System.out.println("Finish");
            AnswerCityRegister cityAnswer = checkCityRegister(so);
            AnswerWedding wedAnswer = checkWedding(so);
            AnswerChildren childAnswer = checkChilren(so);
            AnswerStudent studentAnswer = checkStudent(so);

            sendMail(so);
        }
        System.out.println("Finish 2");
    }

    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return null;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so){
        System.out.println("CityRegister is running");
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }

    static AnswerWedding checkWedding(StudentOrder so){
        System.out.println("Wedding is running");
        AnswerWedding ans = new AnswerWedding();
        return ans;
    }
    static AnswerChildren checkChilren(StudentOrder so){
        System.out.println("Children is running");
        return new AnswerChildren();
    }
    static AnswerStudent checkStudent(StudentOrder so){
        System.out.println("Student is running");
        return new AnswerStudent();
    }

    static void sendMail(StudentOrder so){

    }
}
