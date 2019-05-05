package ch.hsr.projectautomation.chatbot.framework;

/**
 * A default bot to handle all otherwise unhandled messages
 */
public class DefaultBot implements ChatBot {

	@Override
	public String getName() {
		return "C3-PO";
	}

	@Override
	public String getDescription() {
		return "Answers to all messages nobody else can answer.";
	}

	@Override
	public boolean canHandleMessage(String message) {
		return true;
	}

	@Override
	public String getAnswer(String message) {
		if (message == null || message.isEmpty()) {
			return "Master, are you stil there?";
		} else {
			return "Hmm, not sure I understood you. You mean: " + message;
		}
	}

}
