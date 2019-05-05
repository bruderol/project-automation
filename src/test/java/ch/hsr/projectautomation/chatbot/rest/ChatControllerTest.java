package ch.hsr.projectautomation.chatbot.rest;

import ch.hsr.projectautomation.chatbot.framework.Answer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChatControllerTest {

	@Autowired
	private ChatController chatController;

	@Test
	public void emptyMessageAnsweredByDefaultBot() {
		// Exactly one answer for empty message
		List<Answer> answers = chatController.chat("");
		assertThat(answers).isNotEmpty();
		assertThat(answers).hasSize(1);

		// Expected answer by C3-PO
		String botName = answers.get(0).getBotName();
		assertThat(botName).isEqualTo("C3-PO");
		String answerMsg = answers.get(0).getAnswer();
		assertThat(answerMsg).isEqualTo("Master, are you stil there?");
	}

	@Test
	public void meaninglessMessageAnsweredByDefaultBot() {
		// Exactly one answer for meaningless message
		List<Answer> answers = chatController.chat("piep piep piep");
		assertThat(answers).isNotEmpty();
		assertThat(answers).hasSize(1);

		// Expected answer by C3-PO
		String botName = answers.get(0).getBotName();
		assertThat(botName).isEqualTo("C3-PO");
		String answerMsg = answers.get(0).getAnswer();
		assertThat(answerMsg).isEqualTo("Hmm, not sure I understood you. You mean: piep piep piep");
	}

	@Test
	public void helloAnsweredByWelcomeBot() {

		// Exactly one answer for meaningless message
		List<Answer> answers = chatController.chat("Hello");
		assertThat(answers).isNotEmpty();
		assertThat(answers).hasSize(1);

		// Expected answer by R2D2
		String botName = answers.get(0).getBotName();
		assertThat(botName).isEqualTo("R2D2");
		String answerMsg = answers.get(0).getAnswer();
		assertThat(answerMsg).isEqualTo("Hello, welcome to the project automation chat! How are you?");

	}

	@Test
	public void hoiAnsweredByWelcomeBot() {

		// Exactly one answer for meaningless message
		List<Answer> answers = chatController.chat("Hoi du");
		assertThat(answers).isNotEmpty();
		assertThat(answers).hasSize(1);

		// Expected answer by R2D2
		String botName = answers.get(0).getBotName();
		assertThat(botName).isEqualTo("R2D2");
		String answerMsg = answers.get(0).getAnswer();
		assertThat(answerMsg).isEqualTo("Hoi, wie goht's?");
	}

}
