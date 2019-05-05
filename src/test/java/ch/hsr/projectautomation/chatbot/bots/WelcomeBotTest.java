package ch.hsr.projectautomation.chatbot.bots;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class WelcomeBotTest {

	private WelcomeBot bot = new WelcomeBot();

	@Test
	public void handlesAllHelloMessages() {
		assertThat(bot.canHandleMessage("hello ")).isEqualTo(true);
		assertThat(bot.canHandleMessage("HELLO ")).isEqualTo(true);
		assertThat(bot.canHandleMessage("Hello ")).isEqualTo(true);
		assertThat(bot.canHandleMessage("Hoi Du, wie goht's? ")).isEqualTo(true);
		assertThat(bot.canHandleMessage("Hallo alter! ")).isEqualTo(true);
		assertThat(bot.canHandleMessage("Mon amis, salut! ")).isEqualTo(true);
		assertThat(bot.canHandleMessage("welcome ")).isEqualTo(true);
		assertThat(bot.canHandleMessage("Nice to meet you!")).isEqualTo(true);
	}

	public void answersHelloToHello() {
		assertThat(bot.getAnswer("some message containing Hello"))
			.isEqualTo("Hello, welcome to the project automation chat! How are you?");
	}

	public void answersHoiToHoi() {
		assertThat(bot.getAnswer("some message containing Hoi"))
			.isEqualTo("Hoi, wie goht's?");
	}

	public void answersNiceToMeetYouToWelcome() {
		assertThat(bot.getAnswer("welcome"))
			.isEqualTo("Nice to meet you!");
	}

}
