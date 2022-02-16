Feature: This file contains tests healing locators using different semantic locators
  Total number of cases = 6

  Background:
    Given init browser with capabilities from browsers.json

  Scenario: Find element by Id - Healing locators _1
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field find by <id> and locator idField by value HLM_Semantic_#1
    When click button to change locators
    Then fill field find by <id> and locator idField with Healing by value Changed_Semantic_#1

  Scenario: Find element by classname - Healing locators _2
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field find by <classname> and locator test_class by value HLM_Semantic_#2
    When click button to change locators
    Then fill field find by <classname> and locator test_class with Healing by value Changed_Semantic_#2

  Scenario: Find element by linktext - Healing locators _3
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field find by <linktext> and locator Change: LinkText, PartialLinkText by value HLM_Semantic_#3
    When click button to change locators
    Then fill field find by <linktext> and locator Change: LinkText, PartialLinkText with Healing by value Changed_Semantic_#3

  Scenario: Find element by name - Healing locators _4
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field find by <name> and locator change_name by value HLM_Semantic_#4
    When click button to change locators
    Then fill field find by <name> and locator change_name with Healing by value Changed_Semantic_#4

  Scenario: Find element by partialLinkText - Healing locators _5
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field find by <partialLinkText> and locator PartialLinkText by value HLM_Semantic_#5
    When click button to change locators
    Then fill field find by <partialLinkText> and locator PartialLinkText with Healing by value Changed_Semantic_#5

  Scenario: Find element by tagName - Healing locators _6
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field find by <tagName> and locator test_tag by value HLM_Semantic_#6
    When click button to change locators
    Then fill field find by <tagName> and locator test_tag with Healing by value Changed_Semantic_#6