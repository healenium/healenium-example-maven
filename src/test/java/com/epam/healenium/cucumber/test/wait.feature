Feature: This file contains tests healing locators using conditional wait
  Total number of cases = 2

  Background:
    Given init browser with capabilities from browsers.json

  Scenario: Conditional wait for simple locator - Healing locators _1
    Given go to http://sha-test-app.herokuapp.com/
    And click test button
    And confirm alert
    When click test button waiting 5 seconds with Healing
    Then confirm alert

  Scenario: Conditional wait for alert - Healing locators _2
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And click alert button
    And wait 5 second for alert
    And confirm alert
    When click alert button
    Then wait 5 second for alert with Healing