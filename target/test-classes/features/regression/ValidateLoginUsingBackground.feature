Feature: to validate Login functionality in AdactinHotelApp

Background: 

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"


Scenario: To validate Login using valid username and valid password

When user enters text "reyaz009" in textbox using xpath "//input[@name='username']"
And user enters text "reyaz123" in textbox using xpath "//input[@name='password']"
And user clicks button using xpath "//input[@name='login']"
Then user validates title to be "Adactin.com - Search Hotel"

Scenario: To validate Login using valid username and Invalid password

When user enters text "reyaz009" in textbox using xpath "//input[@name='username']"
And user enters text "reyaz456" in textbox using xpath "//input[@name='password']"
And user clicks button using xpath "//input[@name='login']"
Then user validates title to be "Adactin.com - Hotel Reservation System"

Scenario: To validate Login using Invalid username and valid password


When user enters text "reyaz1234" in textbox using xpath "//input[@name='username']"
And user enters text "reyaz123" in textbox using xpath "//input[@name='password']"
And user clicks button using xpath "//input[@name='login']"
Then user validates title to be "Adactin.com - Hotel Reservation System"

Scenario: To validate Login using Invalid username and Invalid password

When user enters text "reyaz1234" in textbox using xpath "//input[@name='username']"
And user enters text "reyaz456" in textbox using xpath "//input[@name='password']"
And user clicks button using xpath "//input[@name='login']"
Then user validates title to be "Adactin.com - Hotel Reservation System"







