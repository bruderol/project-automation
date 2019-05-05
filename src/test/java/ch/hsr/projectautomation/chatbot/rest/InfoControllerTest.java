package ch.hsr.projectautomation.chatbot.rest;

import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class InfoControllerTest {

	private InfoController infoController = new InfoController();

	@Test
	public void doesReturnAMessage() throws IOException {
		String welcome = infoController.getWelcome();
		assertThat(welcome).isNotNull();
		assertThat(welcome).contains("Demo Application for Course Project Automation");
	}

}
