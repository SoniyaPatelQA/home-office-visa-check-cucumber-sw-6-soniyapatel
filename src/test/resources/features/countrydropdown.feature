Feature: Country DropDown feature

  @author_SoniyaPatel @smoke @sanity @regression
  Scenario: Verify the following country available in country dropdown list
    Given I am on check uk visa page
    When I click on start button
    Then I can see following country into dropdown
      | albania                  |
      | bhutan                   |
      | british protected person |
      | haiti                    |
      | kazakhstan               |
      | mozambique               |
      | norway                   |
      | portugal                 |
      | russia                   |
      | zambia                   |