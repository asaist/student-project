package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.domain.register.AnswerCityRegister;
import edu.javacourse.studentorder.domain.register.AnswerCityRegisterItem;
import edu.javacourse.studentorder.domain.register.CityRegisterResponse;
import edu.javacourse.studentorder.exception.CityRegisterException;

import java.util.List;

public class CityRegisterValidator {
    public String hostName;
    protected int port;
    private String login;
    String password;

    private CityRegisterChecker  personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so){
            AnswerCityRegister ans = new AnswerCityRegister();

            ans.addItem(checkPerson(so.getHusband()));
            ans.addItem(checkPerson(so.getWife()));
            for (Child child:so.getChildren()){
                ans.addItem(checkPerson(child));
            }


        return ans;
    }
    private AnswerCityRegisterItem checkPerson(Person person){
        try{
            CityRegisterResponse cans = personChecker.checkPerson(person);
        }catch (CityRegisterException ex){
            ex.printStackTrace(System.out);
        }
        return null;
    }

}
