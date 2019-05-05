package ch.hsr.projectautomation.chatbot.framework;

/**
 * Interface for any chatbot to register in the chatbot application to talk to users
 */
public interface ChatBot {

	/**
	 * Get a name of the bot. The bot name needs to be unique for all bots in the system.
	 * @return a name, not allowed to be null
	 */
	public String getName();

	/**
	 * Get a short description abut what topic the bot will talk with you
	 * @return a description, not allowed to be null
	 */
	public String getDescription();

	/**
	 * Is the bot able to reply to this message and say something about the topic in that message?
	 *
	 * @param message the message the user sent
	 * @return true only if the bot is able to say something about the passed message
	 */
	public boolean canHandleMessage(String message);

	/**
	 * Get the answer for the message passed
	 * @param message message the user sent
	 * @return answer to the user's message, not allowed to be null
	 */
	public String getAnswer(String message);

}
