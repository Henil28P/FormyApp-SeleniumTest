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

Combine Multiple Attributes:
Necessary when:
- Web page has many of the same type of elements
- No other options to describe a unique element

Different combinations of CSS Selectors that can be used to locate elements:
1. Tag and class or Tag and ID
2. Tag and attribute
3. Class and class
and many more

1. Tag and Class and Tag and ID:
- To combine Tag and Class: `<input class="q" type="text">` --> `driver.findEelement(By.cssSelector("input.q"));`
- To combine Tag and ID: `<input id="q" type="text">` --> `driver.findEelement(By.cssSelector("input#q"));`

2. Tag and Attribute
- To find by the element's "type" attribute: `<input type="radio" value="radio button">` --> `driver.findElement(By.cssSelector("input[type='radio']"))`
- To find by the element's "value" attribute: `<input type="radio" value="radio button">` --> `driver.findElement(By.cssSelector("input[value='radio button']"))`

3. Multiple Classes
`<button type="button" class="btn btn-lg btn-primary">`
`<button type="button" class="btn btn-lg btn-success">`
`<button type="button" class="btn btn-lg btn-info">`
For the above, the button element with the 'success' class can be found by:
`driver.findElement(By.cssSelector(".btn.btn-lg.btn-success"))` (to specifically find that 'success' button)

# Text Matching
When there are no descriptive selectors, matching by text comes to the rescue.

2 best ways to use a CSS selector based on text:
1. Value - Matches text by exact value of selector
2. Wildcard - Matches text based on a selector or part of a selector

1. By Value:
- Looks like `driver.findElement(By.cssSelector("<tagname>[type='<value>']"));`
- If it becomes necessary to match text using a CSS selector, it's recommended using the element's value first.

2. By Wildcard
- Can match text based on string or substring
- Prefix: `a[id=^='id_prefix_']`
- Suffix: `a[id$='_id_suffix']`
- Substring: `a[id*='id_pattern']`
- Exact match: `a[id='id']`

Examples for each of the above methods (prefix, suffix, etc.):
1. By Exact Match: `<div id="textField">` --> `driver.getElement(By.cssSelector("div[id='textField']"));`
2. By Prefix: `<div id="textField_randomId">` --> `driver.getElement(By.cssSelector("div[id^='textField']"));`
3. By Suffix: `<div id="randomId_textField">` --> `driver.getElement(By.cssSelector("div[id$='textField']"));`
4. By Substring: `<div id="123_textField_randomId">` --> `driver.getElement(By.cssSelector("div[id*='textField']"));`

Using wildcards:
Find Child Nodes
1. Child: A node directly under another node
2. Nth-child: used when there are multiple nodes at the same level under another node

1. Child
- Example:
`<div id="parent">`
`<a id="child" href="/child">Child</a>`
`</div>`
To find the child element:
`driver.findElement(By.cssSelector("div#parent a"));`

2. Nth-child
- This is helpful when there are list of elements and we want to find 1 element within the list.
- Example:
`<ul id="list">`
   `<li>One</li>`
   `<li>Two</li>`
   `<li>Three</li>`
`</ul>`
To find the list items:
`driver.findElement(By.cssSelector("#list li:nth-child(n)"));` where 'n' is the list items within the list to find within the 'ul'

# Synchronization Issues when running Selenium tests
Test Speed:
- Sometimes it takes a moment for: Pages to load, actions to finish, or components to appear.

Why do synchronization issues occur?
1. Browser driver speed:
- Browser drivers operate at different speeds
- ChromeDriver and geckodriver are fastest browser drivers

2. Where tests are executed
- As the number of simultaneous tests increases, there is a discrepancy between running tests in a local machine as opposed to running tests in a remote or virtual machine.

3. Network speed
- Makes a difference in how tests execute
- Pages can be slow to render

Therefore, note that no matter the reason, synchronization will become an issue at some point with Selenium WebDriver tests and it is critical to learn how to manage it in your test.

Identify synchronization issue:
- Test gets stuck at a steep
- "No Such Element Exception" fails tests

An `ElementNotFound` error can indicate 2 things:
1. The element could not be found by the locator specified at the time of searching for it.
2. The element is not visible or present on the page at the time of searching for it.

Adding Waits:
- If the locator has been correctly specified, the solution is to add a wait.
- Waits slow down the test, and search for the element specified only after it becomes available.

2 different types of waits:
1. Implicit waits
2. Explicit waits

# Implicit waits
- Tells the WebDriver to wait for a specified amount of time before throwing a no such element exception
- Default wait time is 0
- Doesn't depend on a certain element state, just time
- Syntax: `driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);` where TimeOut is int, TimeUnit is a measurement which can be microseconds, milliseconds or seconds

1. Pros of Implicit waits
- Easy to implement
- Non-intrusive
- They can be applied to all elements in the script (not just 1)

2. Cons of Implicit waits
- Implicit waits can end up waiting for too much time and if they're waiting when they don't need to be, they are just taking up unnecessary time

# Explicit waits
- Wait for a specified amount of time for a certain condition to be true.
- If the condition is not met in the time specified, an exception is thrown.
- Explicit wait is intelligent
- It gives better options than implicit waits
- It waits for dynamically located elements
- Syntax:
1. Define a new `wait` object: `WebDdriverWait wait = new WebDriverWait(driver, 10);` where 10 is the max time to wait in seconds as the 2nd parameter
2. Expected conditions to specify what we are waiting for (eg. wait for an element to become visible): `WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("element")));`
- Other expected conditions for explicit waits besides from `visibilityOfElementsLocated` are: `elementToBeClickable()`, `elementToBeSelected()`, `presenceOfElementLocated()`, `textToBePresentInElement()` and more.

1. Pros of Explicit waits
- Allows flexibility to wait for an element to be in a specific condition
- Will likely not take up unnecessary time

# Page Objects
- Allows functionality to be separated into different classes based on area of functionality
- Benefits: organize test code and keep test clean and readable.

# Selenium Grid
- Proxy server that routes commands to remote browser instances
- It spreads the load of testing across several machines
- These machines can run different browsers and browser versions, and different platforms as well.

How it works:
- One server acts as the hub and routes JSON-formatteed test commands to grid nodes to access browser instances.

What to know about the Selenium grid:
1. Will have to maintain grid infrastructure
2. Choose physical or virtual machines

# Continuous Integration
- It provides continuous feedback that tests are working and validates the functionality of the application is working as expected.
- Many CI servers integrate well with Selenium WebDriver - they can be run automatically on a regular basis.
- Few CI servers:

1. CircleCI - cloud service that supports GitHub projects and all major programming languages (Java, JS, Typescript, etc.)
- It is a flexible tool that offers support to run jobs concurrently up to 16 parallel builds each isolated in their own container.

2. Jenkins - open-source CI tool written in Java that can be hosted locally or remotely.
- It's a cross-platform tool that offers configuration both through a GUI interface as well as console commands.

3. TeamCity - from JetBrains which offers all of its features in its free version and also good solution for Enterprise services
4. TravisCI - oldest CI servers and offers both hosted and on-premise variants, free for all open-source projects hosted on GitHub and for the first 100 builds

Picking a CI server is based on certain factors:
- Infrastructure
- Setup
- Maintenance
- Flexibility

# Cloud-based Test Tools
- Allows for hundreds of thousands of combinations of cross-browser, cross-device, and cross-platform testing.
- It's an alternative for building out your own Selenium Grid infrastructure where you don't have to worry about maintaining that infrastructure yourself.
- With cloud-based test tools, Virtual Machines can spin up on demand with a certain set of specifications, run tests, and then shut down.
- SauceLabs is one of the most recommended cloud-based test tools - easier to set up --> `https://saucelabs.com`

1. Advantages of Saucelabs:
- Supports all major programming languages
- Real device testing
- Integrate well with CI servers (such as CircleCI, Jenkins, etc.)

To use SauceLabs, specify:
- Sauce username
- Sauce access key
- URL to spin up a new VM to specified capabilities

Then all those above are used to create a new remote WebDriver