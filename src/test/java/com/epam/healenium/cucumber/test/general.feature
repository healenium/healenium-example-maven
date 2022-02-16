Feature: This file contains tests with general usages of finding elements
  Total number of cases = 3

  Background:
    Given init browser with capabilities from properties.json

  Scenario: FindBy annotation - Healing locators _1
    Given go to https://sha-test-app.herokuapp.com/
    And click test button with @FindBy
    And confirm alert
    And generate mark-up form
    When click test button with @FindBy using Healing
    Then confirm alert

  Scenario: findElements annotation - Healing locators _2
    Given go to https://sha-test-app.herokuapp.com/
    And generate form with checkboxes
    And select all checkboxes with findElements
    And check selected checkboxes
    When unselect all checkboxes with findElements using Healing
    Then check unselected checkboxes

  Scenario: Disable Healing annotation - Healing locators _3
    Given go to https://sha-test-app.herokuapp.com/
    And click test button
    And confirm alert
    When generate mark-up form
    Then check test button not healed with @DisabledHealing