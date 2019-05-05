package ch.hsr.projectautomation.chatbot.framework;

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
