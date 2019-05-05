package ch.hsr.projectautomation.chatbot.rest;

import ch.hsr.projectautomation.chatbot.framework.Answer;
import ch.hsr.projectautomation.chatbot.framework.ChatBot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BotControllerTest {

	@Autowired
	private BotController botController;

	@Test
	public void returnsAllBots() {
		List<ChatBot> bots = botController.getBots();
		assertThat(bots).isNotEmpty();
	}

}
