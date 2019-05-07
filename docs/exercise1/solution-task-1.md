# Exercise 1 - Solution - Task 1

This is a simple reference implementation of a simple chat bot,
that you could use as a reference on how to implement Task 1 of the exercise.

**Please Replace `Funny` everywhere with your unique bot name!**

The ChatBot class:

```

public class FunnyBot implements ChatBot {

	@Override
	public String getName() {
		return "Funny";
	}

	@Override
	public String getDescription() {
		return "Responds to every message containing the word `fun`.";
	}

	@Override
	public boolean canHandleMessage(String message) {
		String msg = message.toLowerCase();
		return msg.contains("fun");
	}

	@Override
	public String getAnswer(String message) {
		return "Sorry, but I think this is no fun at all!"	
	}

}

```

Register your bot inside method `init()` in `ChatBotFactory` class:
```
botRegistry.registerBot(new WelcomeBot());
```



You have at least to adjust the `ChatBotRegistrationTest` to reflect the newly added bot:
```

	@Test
	public void numberOfRegisteredBotsAsExpected() {
		assertThat(chatBotRegistry.getRegisteredBots())
			.describedAs("Registered bots")
			.hasSize(1); // <--- adjust the number of expected bots here!
	}

	// add another test method for the new added bot:
	@Test
	public void funnyBotIsRegistered() {
		expectBotRegistered("Funny");
	}
	
```

Finally a test for the new chat bot should have been added:
```
	public class FunnyBotTest {
    
    	private FunnyBot bot = new FunnyBot();
    
    	@Test
    	public void handlesAllFunMessages() {
    		assertThat(bot.canHandleMessage("fun")).isEqualTo(true);
    		assertThat(bot.canHandleMessage("funny")).isEqualTo(true);
    		assertThat(bot.canHandleMessage("something is sooo FUNNY in the middle of the sentence")).isEqualTo(true);    	    		
    	}
    
    	@Test
    	public void answersWithNoFunAtAll() {
    		assertThat(bot.getAnswer("some message containing fun"))
    			.isEqualTo("Sorry, but I think this is no fun at all!");
    	}
    	
    }

```
