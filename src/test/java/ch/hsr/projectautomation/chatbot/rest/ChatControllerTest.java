package ch.hsr.projectautomation.chatbot.rest;

import org.assertj.core.api.AssertJProxySetup;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertNotNull;

public class ChatControllerTest {
	
	private ChatController chatController = new ChatController();
	
	@Test
	public void doesReturnAMessage() {
		String message = chatController.sendMessage("test");
		assertThat(message).isNotNull();
		assertThat(message).contains("Did I get this right?");
	}
	
}
