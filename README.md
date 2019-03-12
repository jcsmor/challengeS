Technologies used in this project:

IDE - Intellij
Build and Dependency Management - grade
Core Driver - Selenium
Core Runner - Junit
Keyword-Driven Engine - cucumber

There is a single feature file for Web Selenium, and we have a second feature file for API testing

Get the code
Git:

git clone https://github.com/jcsmor/challengeS.git
cd challengeS

Use Gradle
Open a command window and run:

gradlew test --info
This runs Cucumber features using Cucumber's JUnit runner.

Using Gradle to run the Selenium feature file: After cloning the project and install gradle dependencies, go to project source and run:

gradle selenium

Using Gradle to run the Api feature file: After cloning the project and install gradle dependencies, go to project source and run:

gradle apiTests