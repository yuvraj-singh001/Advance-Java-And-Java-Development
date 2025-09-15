package Level2;

import Level2.StudentInfo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class DiUsingAnnotationsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DiUsingAnnotationsApplication.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("Level2");

        StudentInfo studentInfo = (StudentInfo) context.getBean("studentinfo");

        studentInfo.showDetails();
	}

}
