package service;

public class EmailService implements MessageService
{

	public void sendMessage(String msg)
	{
		
		System.out.println(msg + " Is send via email.");
	}

}
