package ch.hsr.projectautomation.chatbot.rest;

import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class ChatController {

	@RequestMapping(value= "/chat", method = POST)
	public String sendMessage(String message) {
		return "wait ... this is work in progress ...";
	}

}
