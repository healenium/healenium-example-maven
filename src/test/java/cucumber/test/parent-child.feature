Feature: This file contains tests healing locators using parents and child logic
  Total number of cases = 4

  Background:
    Given init browser with capabilities from browsers.json

  Scenario: XPath parent:: - Healing locators _1
    Given go to http://sha-test-app.herokuapp.com/
    And generate mark-up form
    And generate form with checkboxes
    And select first checkbox
    And verify first checkbox checked
    When unselect first checkbox
    Then verify first checkbox unchecked with Healing

  Scenario: XPath parent.findElements - Healing locators _2
    Given go to http://sha-test-app.herokuapp.com/
    And generate form with group input
    And check group inputs parent.findElements
    When fill group inputs
    Then check group inputs parent.findElements with Healing

  Scenario: CSS FirstChild - Healing locators _3
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field with CSS test_tag:first-child by value HLM_ParentChild_#3
    When click button to change locators
    Then fill field with CSS test_tag:first-child by value Changed_ParentChild_#3

  Scenario: CSS LastChild - Healing locators _4
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field with CSS child_tag:last-child by value HLM_ParentChild_#4
    When click button to change locators
    Then fill field with CSS child_tag:last-child by value Changed_ParentChild_#4

#  selenium 4 (above, below, toLeftOf, toRightOf, near)
