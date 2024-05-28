package scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("scope")
public class config {
	
	@Bean
	@Scope("singleton")
	public Student createSingle()
	{
		return new Student();
	}
	
	@Bean
	@Scope("prototype")
	public Employee createPrototype()
	{
		return new Employee();
	}

}
