package ch.hsr.projectautomation.chatbot.rest;

import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class WelcomeControllerTest {
	
	private WelcomeController welcomeController = new WelcomeController();
	
	@Test
	public void doesReturnAMessage() throws IOException {
		String welcome = welcomeController.getWelcome();
		assertThat(welcome).isNotNull();
		assertThat(welcome).contains("Demo Application for Course Project Automation");
	}
	
}
