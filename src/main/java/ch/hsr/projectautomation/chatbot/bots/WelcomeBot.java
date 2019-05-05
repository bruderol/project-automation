package ch.hsr.projectautomation.chatbot.bots;

import ch.hsr.projectautomation.chatbot.framework.ChatBot;

public class WelcomeBot implements ChatBot {

	@Override
	public String getName() {
		return "R2D2";
	}

	@Override
	public String getDescription() {
		return "Says something stupid about meaningless topics, like 'Hello'.";
	}

	@Override
	public boolean canHandleMessage(String message) {
		String msg = message.toLowerCase();
		return msg.contains("hello") || msg.contains("hi") || msg.contains("welcome") || msg.contains("hoi");
	}

	@Override
	public String getAnswer(String message) {
		String msg = message.toLowerCase();
		if (msg.contains("hello") || msg.contains("hi")) {
			return "Hello, welcome to the project automation chat! How are you?";
		} else  if (msg.contains("hoi")) {
			return "Hoi, wie goht's?";
		} else {
			return "Nice to meet you!";
		}
	}

}
