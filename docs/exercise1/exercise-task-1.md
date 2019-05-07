# Exercise 1 - Task 1 - Implement Chat Bots

The goal of your team is to write funny chat bots to contribute to our chat bot system that can talk about your most favourite topics.

**Goals:**
* Every pair of developer has implemented one chatbot to talk about a topic.
* The chatbots are well integrated with other chatbots from the same team on the team's feature branch.
* The Jenkins CI build for your team branch is still happy with your software and all your chat bots are well tested.
* Your feature team is ready to integrate your chat bots on the develop branch with other chat bots from other teams for next release.

**Follow these steps to implement your chatbot (time approx. 30-40 Minutes):**
1. Update the project to the latest state (`VCS/Update Project...`).
2. Switch to your team's feature branch (Bottom right you can click on `Git: master` to switch to another branch, choose your team's remote branch and choose `Checkout as ...` and click `Ok`).
3. Create a new chatbot class similar to the class `WelcomeBot` in the same package
4. Give your chatbot a nice and unique name in `getName()`.
5. Implement a well description in `getDescription()` for your chatbot giving some hints about which topic the chat bot will reply to.
6. Define in `canHandleMessage(..)` for which keywords in messages the bot reacts with answers.
7. Implement the `getAnswer(..)` method to give some funny answers depending on the keywords.
8. Create and register your bot in the class `ChatBotFactory`
9. Write a test for your bot similar to `WelcomeBotTest` (you can copy and adjust it)
10. Make sure all tests are still passing (`src/test/Run all Tests ...` or `Gradle/Tasks/build`). $
11. If any test fails, you need to fix it.
12. Commit your changes (`Version control` rider at the bottom left, choose `Local Changes`, select all changes and select `Commit ...` from context menu)
     * please review in the commit dialog all your changes carefully and only commit what you really wanted to change!
     * by double clicking on each file, you can see all changes in each file
     * it is bad practice to commit anything that you changed by accident, this might disturb your colleagues
13. Pull other's changes from your team's branch to integrate with other's changes (`VCS/Update Project...`)
     * This step might mean that you get conflicts and need to merge some changes in some files (you will see a dialog in this case, here you can merge file by file, ask for help if you are unsure how to do it)
     * **Important:** After merging conflicts you need to commit again!
14. Push all changes to the remote repository (`VCS/Git/Push...`)
15. Verify the Jenkins CI build is passing for your changes:
    * Go to http://sinv-56080.edu.hsr.ch/job/project-automation/
    * Login with user `student` and pasword `autom@tion$1`
    * Browse to your team's branch and verify the build successfully runs for your changes
	   * Check the "Changes" log on the last executed build run (listed on the left side)
	   * If not yet executed go back to the main build page for the whole project and choose "Scan Multibranch Pipeline Now"
	   * Wait until the build and tests are executed
	* Study the test result reports:	
	   * Are all tests on your branch successful? Otherwise correct them.
	   * Were the new tests for your new added chat bot executed? 
	* Study the Test Coverage Report of `Cobertura` (if available):
		* Did you cover the new functionality with tests?
		* Should you take some action to cover the new functionality?
	* Study the Code Quality Reports of `Sonar`
		* How well is the quality of current code?
		* Did you introduce some quality issues in the code?
		* Do you see some actions that should be taken from this quality measurements?
16. When done, try to help the other pairs of your team to get their bots well integrated and pushed to the team branch. They might need some help.
17. You are finished if all bots in your team are well integrated and your CI for your team's branch with all bots passed (=blue) with all the changes on it.

**Hints:**
* Consider the slides about `Continuous Integration` from lecture about the CI process
* Consider the [Tutorial for Development Environment](../SETUP.md) for help with the development environment
* Consider the [Tutorial for using Git in IntelliJ](../guide-git-in-intellij.md) for working with Git

**Solution / Cheat Sheet:**
In case of problems or to not loose to much time with coding,
just consider the [Solution for Task 1](solution-task-1.md)
about how a simple "funny chat bot" implementation might look like.

**Done??**
You are finished with this task as a feature team, when the team has added
at least two funny chat bots on their feature branch,  
and the Jenkins build is run and still successful (no tests broken) for all their bots.

**Did you also test/review your bots manually?** Startup the system and talk with the bots.

When you think you are finished and ready for the release as a team, then ask the trainers for the next task. 
