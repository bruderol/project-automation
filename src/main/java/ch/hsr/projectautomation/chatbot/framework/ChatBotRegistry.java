package ch.hsr.projectautomation.chatbot.framework;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Registry component to register chat bots in the application
 */
@Component
public class ChatBotRegistry {

	public static ChatBot DEFAULT_BOT = new DefaultBot();

	private ArrayList<ChatBot> bots = new ArrayList<ChatBot>();

	/**
	 * Register a bot that can handle a topic.
	 *
	 * @param bot the bot to register, needs to have a unique name for being able to register
	 */
	public void registerBot(ChatBot bot) {
		checkUniqueBotName(bot);
		bots.add(bot);
	}

	private void checkUniqueBotName(ChatBot bot) {
		if (bot.getName() == null) {
			throw new IllegalArgumentException("Not allowed to register a bot with name of null");
		}
		for (ChatBot existingBot : bots) {
			if (bot.getName().equals(existingBot.getName())) {
				throw new IllegalArgumentException("Bot with name '" + bot.getName() + "' already exists. Bot with same name implemented in class " + existingBot.getClass().getName() + ". Please rename one of the bots.");
			}
		}
	}

	/**
	 * Get all bots that can produce a answer for passed message.
	 */
	public List<ChatBot> getBotsThatCanHandleMessage(String message) {
		List<ChatBot> matchedBots = bots.stream().filter(bot -> bot.canHandleMessage(message)).collect(Collectors.toList());
		if (matchedBots.isEmpty()) {
			matchedBots.add(DEFAULT_BOT);
		}
		return matchedBots;
	}

	/**
	 * This includes all bots, registered bots including the precreated out of the box default bot.
	 */
	public List<ChatBot> getAllBots() {
		List<ChatBot> allBots = new ArrayList<>(bots);
		allBots.add(DEFAULT_BOT);
		return allBots;
	}


	/**
	 * Get only the injected registered bots (without default bot)
	 */
	public List<ChatBot> getRegisteredBots() {
		return bots;
	}
}
