package ch.hsr.projectautomation.chatbot.rest;

import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class InfoController {

	private static final String WELCOME_MESSAGE = "WELCOME TO THE PROJECT AUTOMATION COURSE !";

	@RequestMapping(value= "/info", method= GET, produces = "text/plain")
	public String getWelcome() throws IOException {
		InputStream bannerStream = this.getClass().getResourceAsStream("/banner.txt");
		return WELCOME_MESSAGE + "\n"
			+ IOUtils.toString(bannerStream);
	}

}
