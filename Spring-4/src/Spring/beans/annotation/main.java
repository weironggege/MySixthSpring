package Spring.beans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring.beans.annotation.controller.UserController;
import Spring.beans.annotation.repository.UserRepository;
import Spring.beans.annotation.service.UserService;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
		
		TestObject to = (TestObject) ctx.getBean("testObject");
		System.out.println(to);
		
		UserController userController = (UserController) ctx.getBean("userController");
		System.out.println(userController);
		
		UserRepository userRepository = (UserRepository) ctx.getBean("userRepository");
		System.out.println(userRepository);
		
		UserService userService = (UserService) ctx.getBean("userService");
		System.out.println(userService);
		
	}

}
