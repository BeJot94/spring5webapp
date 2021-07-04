package pl.bejot.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.bejot.dependencyinjection.controllers.ConstructorInjectedController;
import pl.bejot.dependencyinjection.controllers.MyController;
import pl.bejot.dependencyinjection.controllers.PropertyInjectedController;
import pl.bejot.dependencyinjection.controllers.SetterInjectedController;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.helloWorld();

		System.out.println(greeting);

		System.out.println("------- Property");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------- Setter");
		SetterInjectedController setterInjectedController =
				(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------- Constructor");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
