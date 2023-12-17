
@tag
Feature: Feature to test login scenario

  @firstTag
  Scenario Outline: check login successful
    Given user on login page
    And user enters <username> and <password>
    When click  on login button
    And user nevigate to home page

    Examples: 
      |username|password|
      |name1|pass1| 

