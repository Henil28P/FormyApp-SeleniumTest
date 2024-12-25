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

ChromeDriver (Browser Driver) Info:
- Maintained by Google
- Implements the WebDriver wire protocol for Chromium which is an open-source browser project that aims to build a safer, faster and more stable way for users to experience the web.
- Available on Chrome for Android and Desktop

Structure of basic test code for each Java class of this project:
1. `WebDriver driver = new ChromeDriver();` - New instance of ChromeDriver class is created.
- Utilizes package: org.openqa.selenium.chrome.ChromeDriver
- Instantiates driver onto browser

2. `driver.get("http://www.google.com");` - Navigate test to Google
- Utilizes package: org.openqa.selenium.WebDriver
- The get() method launches a new browser session and directs it to the URL specified in the parameter.

3. `driver.findElement(By.name("q"));` - Find element on the web page to be tested
- Utilizes package: org.openqa.selenium.By
- Locates an element with the specified selector
- Other ways to find an element are: `By.ClassName`, `By.CssSelector`, `By.Id`, `By.Name`, `By.XPath`

4. `WebElement element = driver.findElement(By.name("q"));` - assign to WebElement after it is found on the web page to be tested
- Utilizes package org.openqa.selenium.WebElement

5. `element.sendKeys("Cheese!");` - use the element found to perform some actions (send the keystrokes to the keyboard)
`element.submit();` - submit the search element that the test enters keys for
- Use actions to drive web elements on the page
- Other common actions include: Click, dragAndDrop, KeyDown, MoveToElement

6. `driver.quit();` - quit driver and close associated windows

--> Use the API documentation to see classes and methods of Selenium WebDriver: https://www.selenium.dev/selenium/docs/api/rb/Selenium/WebDriver.html

Inspecting Elements:
- Used to identify web element selectors to use in tests.
- A crucial step in test writing
- To inspect web elements in Chrome:
1. Hover mouse pointer over any element (eg. search bar on google.com)
2. Right-click on the element and select "Inspect" from the menu
3. Check the element locators (id, name, value, class, etc.)

Various Ways to Locate Elements:
- Class name
- CSS selector
- ID
- Link text
- Name
- Tag name
- XPath

The best locators are those that are: `unique`, `descriptive` and `static (unlikely to change)` 
Avoid using:
- `Link text` - works only as long as links are unique on the page
- `Tag name` - usually not unique or descriptive
- `XPath` - not descriptive at all

Prefer using: `ID`, `Class`, `Name`, `CSS Selector` - all of which are usually unique, descriptive and static

The most power locator is `CSS Selectors`:
- CSS Selectors are the most powerful choice in automation and can be used in conjunction with other types of locators.
- They can locate the most hard-to-find elements.

Examples:
1. Find element by ID: `<input id="q" class="q" name="q">` --> `driver.findElement(By.cssSelector('#q'));` (# in CSS represents ID of HTML element)
2. Find element by Class: `<input id="q" class="q" name="q">` --> `driver.findElement(By.cssSelector('.q'));`(. in CSS represents class of HTML element)
3. Find element by Name: `<input id="q" class="q" name="q">` --> `driver.findElement(By.cssSelector("input[name='q'])");` (for any other locators)

Other uses of CSS Selectors:
- Finding based on a substring or string
- Using wildcards
- Child and sibling nodes