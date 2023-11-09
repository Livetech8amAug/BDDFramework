Feature: To validate Regisrtration Functionality

Scenario: To validate registration using valid test data 

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user click link using xpath "//a[text()='New User Register Here']"
Then user validates title to be "Adactin.com - New User Registration"
When user enters text "reyaz0811" in textbox using xpath "//input[@name='username']"
And  user enters text "reyaz123" in textbox using xpath "//input[@name='password']"
And  user enters text "reyaz123" in textbox using xpath "//input[@name='re_password']"
And  user enters text "riyaz s" in textbox using xpath "//input[@name='full_name']"
And  user enters text "abcd@gmail.com" in textbox using xpath "//input[@name='email_add']"
And  user enters text "hello" in textbox using xpath "//input[@name='captcha']"

@wip0811
Scenario: To validate registration using valid test data and DataTable

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user click link using xpath "//a[text()='New User Register Here']"
Then user validates title to be "Adactin.com - New User Registration"
When user enters details in Registration Form
| username | password | confirm password | full name | email address | captcha|
| reyaz0811 | reyaz123 | reyaz123 | riyaz s | abcd@gmail.com | hihello|










