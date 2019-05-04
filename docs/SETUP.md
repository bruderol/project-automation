# Development Environment for Exercises

Every course participant needs to work through this setup tutorial before the first course day, 
to have a working development environment ready for the exercise.

**Please make sure to read and work through the whole document until the end to be fully prepared for the exercise in the course!**

Expected time to complete: 60 Minutes

## Register and Get Git Access

For the exercises you need to get a git access to the HSR gitlab server:

* Go to https://gitlab.dev.ifs.hsr.ch
* Click "Register"
* Order an account for your email <your-name>@hsr.ch
* Accept the link sent to your email
* Login to https://gitlab.dev.ifs.hsr.ch with your just created account
* Access our example exercise project here:
  https://gitlab.dev.ifs.hsr.ch/mas-se-project-automation/project-automation
    
## Developer Tools / Developer VM

We have even automated the setup of a linux developer VM with which you can develop for the course exercises.

### Included Tools

The provided Developer VM contains the following tools that you will need for the exercise:

* **Git, Version 2.7 or higher** 
    * in case you want to install it on your own machine, see https://www.atlassian.com/git/tutorials/install-git for how to install and configure  
    * in case you install it on windows it is important to use following options on installation:
      * `[x] Use Git from Windows Command Prompt`
      * `[x] Checkout Windows-style, commit Unix-style line endings`
      * apart from that use the default settings \(or whatever you prefer\)
* **Java OpenJDK, Version 8 or higher** (version 12 should be good as well)
    * See https://jdk.java.net/12/ in case you want to install it natively
    * The VM currently contains version 8, which is sufficient     
* **IntelliJ Ultimate IDEA, Version 2019.1 or higher** 
    * see https://www.jetbrains.com/idea/download/
    * we recommend to use the Ultimate version: 
      you can either use a trial version (for one month) or get e a student licence from here:   
      https://www.jetbrains.com/shop/eform/students
    * IDEA Community Edition might as well work to do most of the exercise, with small limitations
* **Docker, Version 18 or higher**
    * see https://docs.docker.com/install/ in case you want to install it natively   
    * Caution: this might be especially tricky to properly setup on Windows, although things have become better lately, 
      which is one reason why we provide a vagrant based linux dev VM to you.
* Some more, that are not mandatory for the exercise

### Setup the VM

For being able to use the VM you have to install the following tools:

* **Virtual Box, Version 6.0.4 or higher**
    * download and install from here: https://www.virtualbox.org/wiki/Downloads
* **Vagrant, Version 2.4.3 or higher**
    * download and install from here: https://www.vagrantup.com/downloads.html

Then follow these simple steps to install your VM for the course:

* Download this small ZIP file with the vagrant VM configuration files:
    https://github.com/bruderol/vagrant-dev-env/archive/master.zip
* Unpack the ZIP file to a location where you want to store your Dev VM and all your exercise coding stuff
     * use a local directory!
     * no mapped network directory! 
* Make sure you have a good and reliable internet connection
* Make sure you have enough disk space on your main hard drive (the VM installation will need around 10 GB of free disk)
* On Windows: Make sure you turned off "Hyper-V"
     * VMs on Windows 10 do not work with Hyper V enabled
     * See here for how to disable it: https://ugetfix.com/ask/how-to-disable-hyper-v-in-windows-10/    
* Open a command line console in the same directory where you unzipped the ZIP file 
* Make sure to go into the same folder where the `Vagrantfile` is!
* Use following commands to setup the VM in this folder:
  ``` 
  vagrant plugin install vagrant-vbguest
  vagrant up 
  ```
  * Some Hints / Troubleshooting:
    * you might have to accept a firewall rule on the first installation step (`vagrant plugin install vagrant-vbguest`): 
    in case you were too slow with accepting the rule the first step might have failed, 
    in this case just run the first step again
	* if everything seems to go wrong, try to run `vagrant destroy` and start the steps above again
	* if you see a window during installation that there was not enough memory, you might have to close all other applications and run the installation again (use `vagrant destroy` first to start from scratch again)				
* This might take a while to install (around 30 minutes typically, so take a coffee and relax! :-D )
* Once finished you should see `CLEANUP DONE` in the console
* When done, start the VM with: `vagrant reload`
* Login using the user `vagrant` with password `vagrant`

### You Prefer Your Native Setup?
    
If you prefer a local native setup of these tools on your machine, feel free to manually install and configure all the tools on your own instead.
Be careful that in this case you might have to do some additional configuration and tweaking, 
such that everything runs smoothly for the exercises.
The course teachers might not be able to help you in case of troubles with your local setup.

In case you use your own installation of the tools anyways: Once you installed the above listed tools, 
please continue with section [Development Environment Configuration](#Development-Environment-Configuration) in this setup tutorial to configure everything as needed.

### Improve VM Performance

By default the VM is configured to use 6 GB of RAM and 3 CPUs.

If you have enough RAM and CPU on your machine then you can use the VirtualBox Manager UI to give the VM more RAM or CPU.
* You have to stop the VM first to be able to do so.
* Start Oracle VM VirtualBox
* Select "Change" on your VM
* under "System" you find tabs to change RAM and CPU settings
* When done choose OK and start your VM again

### Using the VM

#### Start / Stop the VM

* Once installed you can start and stop the VM from VirtualBox UI as any other VirtualBox VM.

#### Login

For login to the VM use following credentials:

* username: vagrant
* password: vagrant

#### Starting Applications

* Inside the VM use `Activities` on the upper left to find applications you can start (use the doted icon to find more apps)
* We recommend to quickly start the following applications for initial configuration:
    * Terminal (under Utilities)
    * IntelliJ (see initial setup further below)  
* It might be useful to pin these applications as Favorites in the left hand side Favourites Start Bar

### Vagrant Configuration of the VM

In case you are interested in how the automated setup and configuration of such a Developer VM works,
you can study the configuration of the VM in this repository here:
https://github.com/bruderol/vagrant-dev-env 
* see Vagrantfile
* see provision.sh
* see README.md for installed tools and more information

It is that simple to share a VM with your working colleagues like this 
and have a well defined and consistent common development environment throughout the team, 
that is easy to maintain in code.

## Development Environment Configuration

After you installed the tools you need to do following minimal configurations:

### Configure Git User

**Highly Important Initial Git Configuration:**
* Open terminal
* Enter following commands to register your git user:
   * Open the terminal console window
        * on Windows use `Git Bash`: can be selected in file Explorer Context menu `Git Bash here`
   * Personalize your Git by setting your username and email for commits:  
     ```
     > git config --global user.name "<Firstname Lastname>"  
     > git config --global user.email <your-git-user-email>@<your-email-domain>.com
     ```
     See also here: [https://git-scm.com/book/en/v2/Getting-Started-First-Time-Git-Setup](https://git-scm.com/book/en/v2/Getting-Started-First-Time-Git-Setup)

### Configure IntelliJ

* IntelliJ will ask you some questions on first startup. We recommend to just use default settings (plugins etc.)
* It will ask you for a license:
  * You can use trial for 30 days of IntelliJ Ultimate for the exercise (just choose "Use Trial").
  * For a student license you can apply here: 
     * https://www.jetbrains.com/shop/eform/students
     * Simply use your student email, and you will get a student license quickly.
  * IntelliJ is one of the best dev tools we know of. It might be worth buying your personal license which is affordable, in case you want to use it commercially.
* Once you see the Welcome screen you can choose `Check out from Version Control/Git" and continue with the Setup of the Project (see next section)   

## Setup Exercise Project

Please follow carefully these steps to configure the project correctly for work in IntelliJ.

* Open IntelliJ
* Use `Checkout From Version Control/Git` on IntelliJ start screen or `New/Project from sources` 
* Clone the project sources as follows:
   * URL: https://gitlab.dev.ifs.hsr.ch/mas-se-project-automation/project-automation.git
   * Directory: use a good directory for your project source code e.g. `home/vagrant/workspace/project-automation` is recommended as a directory in the VM (not on a network drive!).
   * Select "Clone"
* Use the credentials \(username and password for Git\) as you registered yourself with (if needed for checkout).
* If it asks you to create a project, select "Yes"
* Choose `Import project from external model`: `Gradle` and `Next`
   * If it does not ask you to import with Gradle and directly opens the project,
     then look into the "Event Log" (lower right), 
     you should see something like "Unlinked Gradle project?",
     then click on the link "Import Gradle project".
* Select following options for gradle import:
  * Default option `(x) Use default gradle wrapper` has to be selected (such that the right gradle version is used for building, as included in the git repository)
  * Gradle JVM: Verify the installed JDK is selected. If not: configure the JDK that is installed by using the '...'-button and browse to the JDK directory.
  * Select `Finish` to create your project and open it in IntelliJ
  * Have some patience, beacuse it might take some time to download all the needed dependencies on import, especially for the gradle wrapper.
* Finally verify that your Java JDK is configured correctly in your IntelliJ for this project:
  * go to `File`/`Project Structure`
  * in `Project`-Tab under `Project SDK`: the JDK you have installed should be selected - if not yet, you can add it now using `New...` and then browse to the jdk directroy inside your java installation directory.

## Build and Test the Project

Simply **Run the full Gradle build** to execute the full automated build including the tests:
* Open `Gradle`-Tab: usually on the right side, but first time you might need to choose `View`/`Tool Windows`/`Gradle`.
* In the tab you should see the project `project-automation`
* Open `project-automation` and then open `Tasks` and then `build`.
   * If you do not see any Tasks on the project yet, then right click on `project-automation` and choose `Refresh Gradle project`
* Select the task `build` and simply execute it by double clicking.
* The gradle build will not only build your software but also download all needed dependencies \(**WARNING: This needs a reliable internet connection that does not block maven repositories!**\)
* You should see `BUILD SUCCESSFUL` in the run console window \(bottom of IntelliJ\). If not, there is something wrong with your setup.
* In the exercise you should execute this same build before each commit to ensure that you did not somehow break the build or some tests - the build of your IDE is a different build and might not necessarily always do exactly the same.
* For that a run configuration has been added to the top toolbar on the right for you, so you can next time easily execute same command by simply selecting it from the dropdown there and press the green play button besides of it.
* In case you prefer command line you can as well use `gradlew clean build` on your command line in the project's directory to execute the same build.
   
## Start the Application

**Starting the application** from IntelliJ
* In Project Explorer: Browse to the Java Class `ChatbotApplication`
   \(in `src` folder, simply search the class with `Shift-Shift`-Shortcut in IntelliJ or find it under `src/main/java/ch.hsr.projectautomation.chatbot`\)
* Select `Run Chatbot` from context menu to run the app.
* You can as well use the run configurations in IntelliJ available in upper right run configuration dropdown to run the application 
* See output in the run window console
* You should see a welcome message and that the started web service is running under port 8080
* Open a browser (if you are in the VM use the browser from within the VM! e.g. Firefox)
* Browse to http://localhost:8080
* You should see a nice welcome screen

## Swagger UI for REST API

Our chatbot provides a nice UI to test the REST API.

You can access it through the welcome page (Link "Start Swagger UI") or directly through http://localhost:8080/swagger-ui.html

You can choose one of the controllers and try it out by calling the chat service 
that we are going to extend in the exercise.
   
## Run All Test

The gradle build allready run all your tests, but you can as well run them as follows to see test results nicer in IntelliJ:

* Browse to `src/test/java` in Project browser \(left\)
* Select `Run All Tests` from context menu
* All tests should be passed and green

## CI/CD Jenkins Server

See http://sinv-56080.edu.hsr.ch to access the Jenkins CI Server for the project.

You can use following user account for this exercise:
* username: student
* password: autom@tion$1

You should see that the last automated CI build on the master branch of the `project-automation` project has run successfully (=blue, not red!).

## Ready to Automate?

**Your environment is now ready** for the course and the exercises 

**What about you? Are you ready as well?** We recommend to read following resources on how to use Git (especially if you are new to Git) as a preparation for the course:
* [Tutorial for using Git in IntelliJ](tutorial-git-in-intellij.md) in this exercises tutorial explains most important tasks that you need to perform with Git in IntelliJ for the exercises.
* Git Resources at [https://git-scm.com/doc](https://git-scm.com/doc)
* Especially the online version of the Git Book:  [https://git-scm.com/book](https://git-scm.com/book)

We are looking forward to see you soon in the course and have some fun with automation together!
