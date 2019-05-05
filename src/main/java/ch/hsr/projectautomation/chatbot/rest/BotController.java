package ch.hsr.projectautomation.chatbot.rest;

import ch.hsr.projectautomation.chatbot.framework.ChatBot;
import ch.hsr.projectautomation.chatbot.framework.ChatBotRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class BotController {

	@Autowired
	ChatBotRegistry botRegistry;

	@RequestMapping(value = "/bots", method = GET)
	public List<ChatBot> getBots() {
		return botRegistry.getAllBots();
	}

}
