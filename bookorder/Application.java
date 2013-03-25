package bookorder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"springconfig.xml");

		IBookService bookService = context.getBean("bookService",
				IBookService.class);
		bookService.toString();

	}

}
