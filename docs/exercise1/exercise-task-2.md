# Exercise 1 - Task 2 - Integrate your Feature Branch

Your features can only be released, when they are integrated with all the features
 of other feature teams. And since there might be conflicts between different feature teams, 
 we should better ensure that different features get integrated continuously as well 
 to detect and resolve such conflicts as fast as possible, to be ready for the next release.
 
So better don't wait too long and get your features merged to the main development branch, 
where different features are integrated for the next release, as fast and often as possible. 

**Your Task:** you have to merge your team's feature branch to the `develop` branch, 
which is in our case the branch where we integrate different new features for the next release.

**Precondition:** Only start with this task, if the continuous integration build run successfully
for all your latest changes on your feature branch. Check the Jenkins build results to be sure, that everything is alright.

**Do the following only once as a whole team on your team's feature branch all together.**

1. **Open a Pull Request for your team's feature branch to get it merged to the develop branch.**
   Pull requests are a powerful tool to review changes before you merge them to another branch. 
   We strongly advice to use this tool for merging changes to important branches like the mainline develop branch. 
   In our project the develop branch is configured in such a way, that you can only push to it through pull requests.
   
   * In gitlab a Pull Request is called "Merge Request" - but it is the same!
   * Go to the gitlab Repository: https://gitlab.dev.ifs.hsr.ch/mas-se-project-automation/project-automation
   * Choose "Create Merge Request" (or if you do not see it browse to your branch and select "Merge Request" for your branch there)
   * Make sure that `develop` is choosen as the target branch
   * Give it a short description
   * Assign it to your team colleagues or to the course teacher for review
   * Choose "Submit the Merge Request"
   * All team colleagues should quickly review it and give some feedback to the changes
      
2. **Resolve Merge Conflicts, in case you see some on the Merge Request.** The tool should show you some merge conflicts.
   This conflicts happened because other team's already merged their features to the develop branch 
   and you did not yet merge these changes to your branch.
   
   * Sit together on one computer for this as a team
   * Update your team's feature branch (`VCS/Upddate...`)
   * Merge in all changes from `develop` (`VCS/Git/Pull ...` and choose the `develop` branch to pull from - Pulling means to merge as well)
   * This might end in some conflicts, so you might have to resolve this conflicts
   * Commit all changes when done with merging
   * Push the merged changes (`VCS/Git/Push...`)
   * Review your Merge Request again: are all changes now ok to be merged? Does it look well merged (merge conflicts resolved well)?
   
3. **Merge the Merge Request (=Pull Request):**
   * Once all reviewers agree to merge the Merge Request ...
   * ... AND the CI build is still successful for your branch (did you check it?)
   * ... you can click on "merge" on the merge request to merge your changes.
   
4. **Check the CI for develop again after your merge is done:**
   * Go to the Jenkins: http://sinv-56080.edu.hsr.ch/job/project-automation/
   * Browse to the develop branch
   * Wait for the build to run with your merged changes
   * Check the build passes successfully
   * Fix failures in case of errors
   
5. **Product Review: Some final manual testing of the overall product:** Now everybody can checkout the `develop` branch on their machine and test the result of the merged software
   * Switch to branch `develop` (bottom right menu `Git: feature/...` where your branch name is displayed, then choose `origin/develop` and `Checkout as..` and `Ok`)
   * Start the application (`ChatbotApplication/Run ...`)
   * Browse to http://localhost:8080
   * Browse to the Swagger UI
   * Use the bot-controller to see all registered bots 
      * is yours there?
      * what others are there?
   * Use the chat-controller to chat to some of the new bots
      * Try out some messages to chat with the bots
      * See who answers with what
      
**Hints:**
* In case you need help with git tooling, then consider the [IntelliJ Git Tutorial](../guide-git-in-intellij.md) about how to merge from one branch to another.
* Don't hesitate to ask the teachers for help in case you are unsure how to proceed.

**Done?**
Inform the course teacher that you are done and ask how to proceed.
