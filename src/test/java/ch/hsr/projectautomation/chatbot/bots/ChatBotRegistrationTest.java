package ch.hsr.projectautomation.chatbot.bots;

import ch.hsr.projectautomation.chatbot.framework.ChatBotRegistry;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test starts up whole system to test all bots are registered as expected.
 * <p>
 * This tests the ChatBotRegistry and the ChatBotFactory work appropriately.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ChatBotRegistrationTest extends TestCase {

	@Autowired
	private ChatBotRegistry chatBotRegistry;

	@Test
	public void numberOfRegisteredBotsAsExpected() {
		assertThat(chatBotRegistry.getRegisteredBots())
			.describedAs("Registered bots")
			.hasSize(1);
	}

	@Test
	public void defaultBotIsAvailable() {
		expectBotRegistered("C3-PO");
	}

	@Test
	public void welcomeBotIsRegistered() {
		expectBotRegistered("R2D2");
	}

	private void expectBotRegistered(String expectedBotName) {
		assertThat(chatBotRegistry.getAllBots())
			.filteredOn(bot -> bot.getName().equals(expectedBotName))
			.hasSize(1);
	}

}
