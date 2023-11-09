Feature: to validate Login functionality in AdactinHotelApp

Scenario Outline: To validate Login using valid username and valid password

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user enters text '<username>' in textbox using xpath "//input[@name='username']"
And user enters text '<password>' in textbox using xpath "//input[@name='password']"
And user clicks button using xpath "//input[@name='login']"
Then user validates title to be '<expTitle>'

Examples:
| username | password | expTitle |
| reyaz009 | reyaz123 |  Adactin.com - Search Hotel |
| reyaz009 | reyaz456 | Adactin.com - Hotel Reservation System |
| reyaz1234 | reyaz123 | Adactin.com - Hotel Reservation System |
| reyaz1234 | reyaz456 | Adactin.com - Hotel Reservation System |