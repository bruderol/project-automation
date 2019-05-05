package ch.hsr.projectautomation.chatbot.rest;

import ch.hsr.projectautomation.chatbot.framework.Answer;
import ch.hsr.projectautomation.chatbot.framework.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class ChatController {

	@Autowired
	ChatService chatService;

	@RequestMapping(value = "/chat", method = POST)
	public List<Answer> chat(String message) {
		return chatService.getAnswers(message);
	}

}
