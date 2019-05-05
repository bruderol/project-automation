package ch.hsr.projectautomation.chatbot.bots;

import ch.hsr.projectautomation.chatbot.framework.ChatBotRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * To create and register all bots on startup.
 *
 * New bots need to be created and registered here.
 */
@Component
public class ChatBotFactory {

	@Autowired
	ChatBotRegistry botRegistry;

	@PostConstruct
	public void init() {
		botRegistry.registerBot(new WelcomeBot());
	}

}
