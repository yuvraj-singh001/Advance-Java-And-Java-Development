package Level3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("studentinfo")
public class StudentInfo {

    @Autowired()
    Student student;

    public void showDetails(){
        System.out.println(student.college());
    }
}
