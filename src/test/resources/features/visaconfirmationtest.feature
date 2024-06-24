Feature: visa confirmation functionality
As a user i want to check visa confirmation result

  @author_SoniyaPatel @smoke @sanity @regression
  Scenario: Verify Australian Coming To UK For Tourism
    Given I am on check uk visa page
    When I click on start button
    And I select a Nationality "Australia"
    And I Click on Continue button
    And I select reason "Tourism or visiting family and friends"
    And I Click on Continue button
    Then Verify result message "You will not need a visa to come to the UK"

  @author_SoniyaPatel @smoke @regression
  Scenario: Verify A Chilean Coming To The UK For Work And Plans On Staying For Longer Than Six Months
    Given I am on check uk visa page
    When I click on start button
    And I select a Nationality "Chile"
    And I Click on Continue button
    And I select reason "Work, academic visit or business"
    And I Click on Continue button
    And I select intendent to stay for "longer than 6 months"
    And I Click on Continue button
    And I select have planning to work for "Health and care professional"
    And I Click on Continue button
    Then Verify result message "You need a visa to work in health and care"

  @author_SoniyaPatel  @regression
  Scenario:Verify A Columbian National Coming To The UK To Join A Partner For A Long Stay They Do Have An Article 10Or20 Card
    Given I am on check uk visa page
    When I click on start button
    And I select a Nationality "Dominica"
    And I Click on Continue button
    And I select reason "Join partner or family for a long stay"
    And I Click on Continue button
    And I select state My partner of family member have uk immigration status "Yes"
    And I Click on Continue button
    Then Verify result message "You’ll need a visa to join your family or partner in the UK"