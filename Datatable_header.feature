@Datatable
Feature: This is login feature
Scenario Outline: Login sceanrio
Given go to login page
When enter the user valid "<username>" and "<password>"
And click ogin page
Examples:
|username|password|
|Admin   |admin123  |
|admin   |Admin123@@|
@tag2
Scenario: login
Given when the user in loginpage
When give uname&Pword
Then success
