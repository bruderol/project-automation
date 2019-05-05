package ch.hsr.projectautomation.chatbot.framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {

	@Autowired
	ChatBotRegistry botRegistry;

	public List<Answer> getAnswers(String message) {
		List<Answer> answers = new ArrayList<Answer>();
		for (ChatBot bot : botRegistry.getBotsThatCanHandleMessage(message)) {
			answers.add(createAnswerFromBot(bot, message));
		}
		return answers;
	}

	private Answer createAnswerFromBot(ChatBot bot, String message) {
		String botName = bot.getName();
		String answer = bot.getAnswer(message);
		if (message == null) {
			throw new RuntimeException("Failure in Bot " + bot.getName() + ": returned null, not allowed! Failure in bot impl class " + bot.getClass().getName());
		}
		return new Answer(botName, answer);
	}

}
