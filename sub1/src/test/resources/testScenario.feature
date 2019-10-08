Feature: Search Page

  @abc
  Scenario Outline: Validating some search
    Given I  on the  google page
    When I enter some search "<City1>"
    Then I enter some search

#    Examples:
#    |City1
#    |City2  |
#    |City3  |
