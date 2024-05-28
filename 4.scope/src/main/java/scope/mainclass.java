package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainclass {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		Student st1 = (Student) context.getBean(Student.class);
		Student st2 = (Student) context.getBean(Student.class);
		
		System.out.println(st1+" === "+ st2);
        if(st1.equals(st2))
        {
        	System.out.println("Objects have same address");
        }else
        {
        	System.out.println("Objects have different address");
        }
        
        
        Employee em1 = context.getBean(Employee.class);
        Employee em2 = context.getBean(Employee.class);
        
		System.out.println(em1+" === "+ em2);

        if(em1.equals(em2))
        {
        	System.out.println("Objects have same address");
        }else
        {
        	System.out.println("Objects have different address");
        }
	}
}
