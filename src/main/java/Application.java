import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.MessageConfiguration;
import controller.MessageController;

public class Application
{
	public static void main(String[] args)
	{
		//MessageController messageController = new MessageController();
		//messageController.send();
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfiguration.class);
		MessageController messageController = context.getBean(MessageController.class);
		messageController.send();
	}
}
