package ch.hsr.projectautomation.chatbot.framework;

/**
 * DTO for answers by bots to deliver them to users
 */
public class Answer {

	private String botName;

	private String answer;

	public Answer(String botName, String answer) {
		this.botName = botName;
		this.answer = answer;
	}

	public String getBotName() {
		return botName;
	}

	public String getAnswer() {
		return answer;
	}

}
