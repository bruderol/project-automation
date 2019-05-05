package ch.hsr.projectautomation.chatbot.bots;

import ch.hsr.projectautomation.chatbot.framework.ChatBot;

public class WelcomeBot implements ChatBot {

	@Override
	public String getName() {
		return "R2D2";
	}

	@Override
	public String getDescription() {
		return "Is friendly to friendly people, that say something like 'Hello'.";
	}

	@Override
	public boolean canHandleMessage(String message) {
		String msg = message.toLowerCase();
		return msg.contains("hello")
			|| msg.contains("hi")
			|| msg.contains("welcome")
			|| msg.contains("hoi")
			|| msg.contains("hallo")
			|| msg.contains("buon giorno")
			|| msg.contains("salut")
			|| msg.contains("bon jour")
			|| msg.contains("nice");
	}

	@Override
	public String getAnswer(String message) {
		String msg = message.toLowerCase();
		if (msg.contains("hello") || msg.contains("hi")) {
			return "Hello, welcome to the project automation chat! How are you?";
		} else if (msg.contains("hoi")) {
			return "Hoi, wie goht's?";
		} else {
			return "Nice to meet you!";
		}
	}

}
