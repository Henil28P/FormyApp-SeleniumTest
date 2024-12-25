# FormyApp-SeleniumTest
A Selenium Automation Software Testing project for Formy Web Application to test its functionalities of features and user interaction components on the web.

Required tools for this project:
1. JDK 17 (Java SE Development Kit) - provides the environment to build and run Java programs and includes useful tools for developing and testing.
2. IntelliJ - All tests written and run in IntelliJ, a Java integrated development environment.
3. Chrome (browser)
4. ChromeDriver - browser driver that runs Selenium WebDriver tests in Chrome.
5. Maven - Dependency Management tool for Java
6. Selenium WebDriver - language bindings for Java
7. JUnit - Assertion library

The Selenium Project background:
1. Selenium Grid - provides a central hub that allows multiple Selenium tests to run concurrently.
2. Selenium IDE - Firefox plugin used to record each interaction of an application as test steps.

Goals of WebDriver:
- Quickly and easily write automated tests
- Maintain a standardized API that is user-friendly
- Emulate actions of users

Ideal Users of WebDriver:
- Tester who want to save time manually testing
- Deevelopers have confidence in testing to know they aren't introducing regressions
- Those who need to test across multiple browsers and platforms
- Those who need a customizable and powerful framework

WebDriver Architecture:
Selenium WebDriver works using Client-Server communication
1. When a Selenium test is executed, a new session of the browser is created and the browser window is launched.
2. For each command in the test script, a request is sent to the WebDriver API which is a REST based service.
3. The WebDriver API interprets the request and the step is then executed in the browser which acts as the server and just waits for requests to come in.
4. Once each step is complete, the response is sent back to the WebDriver API and then the test script - this process continues until all tests are complete.
