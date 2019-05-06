# Tutorial - Git in IntelliJ

This How-To explains you the most important steps on how to use Git in IntelliJ for the exercises.

In case of problems or for further information we recommend the following IntelliJ tutorial on how-to use Git in IntelliJ:
https://www.jetbrains.com/help/idea/2019.1/using-git-integration.html

## Checkout Branch

In the exercise your team will first work on its own feature branch.
Therefore all developer have to switch their local workspace to work on that feature branch.

Checkout your branch as follows:
* Bottom right in IntelliJ you see a small dropdown (where you see `Git: master`
  or whatever branch you currently checked out to your filesystem)
* Select the feature branch of your team `feature/teamXyz`, where Xyz is the name of your team
* Select `Checkout` from context menu
* It is recommended to Pull again, to be sure you have the newest latest changes from that branch (see `Pull` below).

Done.

## Committing

You developed something that you want to commit? Did you run the full gradle build to check all tests still pass? 

Then go ahead as follows to commit your changes:
* Open `Version Control`-View (tools tab on bottom of IntelliJ window, or open from `View`/`Tool Windows`)
* Select Tab `Local Changes`
* Review your changes (you can use `Show Diff` from context menu to see changes)
* Take care of `Unversioned Files`
    * The files you want to commit need to be added by choosing `Add to VCS` from context menu
    * Do not commit generated or binary files, this should be added to the `.gitignore` file to ignore them
* Then select all files you want to commit and choose `Commit...` from context menu
* In the opened window you can again review and choose what you want to commit
* Enter a commit comment about what you implemented in your commit
* Select `Commit`

Done.

You can now continue to code and commit again, or continue with Pull and Push to integrate your commits with others.

## Pull - Integrate others changes

To checkout all latest changes that others did on your currently selected branch, you have to Pull as follows:
* Select from Menu `VCS`/`Git`/`Pull`
* Control that right repo and branch is selected
* Press `Pull`
* In case you have conflicts you need to continue with next section.
* If you not have conflicts, you can proceed with coding or proceed to `Push`

## Resolve / Merge Conflicts

Sometimes it may happen, that you changed same pieces of code as another developer in your team.
In such a case you have to merge the changes, as follows:

* IntelliJ will open a merge dialog for you
* Choose to merge each of the conflicting files, which will open the merge editor:
    * Choose to accept all non-conflicting changes first
    * Then work on all (red marked) conflicts to resolve them
      * left side is your current version
      * right side is the version you pulled or merged from the remote repository or branch
      * in the middle you can choose how to merge, this will be the merge result when you select `Apply`

When you are done with merging, you should immediately do a **Commit** to commit the merge result.

**Do not continue to code without committing the merge before!**

## Push

Finally, when all tests are green again and you committed everything,
you can push your changes to make them available to other developers on your same branch.

* Check that you are on the correct branch
* Check that you have committed everything you want to push
* Select Menu `VCS`/`Git`/`Push`
* Review the list of commits matches what you realy want to push
* Select `Push`
* In case your push somehow fails, this might mean, that somebody else pushed something inbetween
  and you therefore need to Pull and Resolve Conflicts again (see above)

## Merge a Branch

When your feature is ready on your branch to get integrated to mainline development branch (in our case `develop`)
you have to merge your changes there to integrate it with other features.

Or also while working on a feature branch you want to merge changes from others on the develop branch 
into your feature branch from time to time.

**Option 1: Merge Locally**
0. Precondition: all your local work is commited, no uncommited changes
1. Switch to the branch that you want to merge (if not yet)
2. Pull all latest changes of that branch to your local workspace
3. Switch to the branch into which you want to merge your changes
4. Pull all latest changes of that branch also to your local workspace
5. From branch dropdown menu (bottom right)
    * Select your branch you want to merge and open the context menu
    * Select `Merge`
6. If there were conflicts
     * Resolve all conflicts locally
     * Commit the merge commit    
7. Push the merged changes

**Option 2: Pull to Merge from Remote Repo directly**
1. You are already on the target branch and all your work is commited (no local changes)
2. Simply use `VCS`/`Git`/`Pull` and select the remote branch you want to merge as an addtional branch to pull from
3. If there were conflicts
     * Resolve all conflicts locally
     * Commit the merge commit    
4. Push the merged changes
