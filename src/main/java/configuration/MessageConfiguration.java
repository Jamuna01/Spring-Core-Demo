package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import controller.MessageController;
import service.EmailService;
import service.MessageService;

@Configuration
@PropertySource(value="classpath:message.properties")
public class MessageConfiguration 
{
	
	@Bean
	public MessageController messageController()
	{
		return new MessageController(null);
	}
	
	@Bean
	public MessageService messageService()
	{
		return new EmailService();
	}
}
