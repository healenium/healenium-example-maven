Feature: This file contains tests healing locators using different types of XPath
  Total number of cases = 12

  Background:
    Given init browser with capabilities from browsers.json

  Scenario: XPath with special characters - Healing Locators _1
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field with XPath //*[@id='change:name'] by value HLM_XPath_#1
    When click button to change locators
    Then fill field with XPath //*[@id='change:name'] with Healing by value Changed_XPath_#1

  Scenario: XPath Following - Healing Locators _2
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field with XPath //*[@id='change_className']/following::test_tag by value HLM_XPath_#2
    When click button to change locators
    Then fill field with XPath //*[@id='change_className']/following::test_tag with Healing by value Changed_XPath_#2

  Scenario: XPath Contains - Healing Locators _3
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field with XPath //input[contains(@class, 'test')] by value HLM_XPath_#3
    When click button to change locators
    Then fill field with XPath //input[contains(@class, 'test')] with Healing by value Changed_XPath_#3

  Scenario: XPath Not Contains - Healing Locators _12
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field with XPath //input[not(contains(@class, 'input1'))] by value HLM_XPath_#12
    When click button to change locators
    And fill field with XPath //input[not(contains(@class, 'input1'))] with Healing by value Changed_XPath_#12

  Scenario: XPath Following-Sibling - Healing Locators _4
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field with XPath //*[starts-with(@class, 'test')]/following-sibling::* by value HLM_XPath_#4
    When click button to change locators
    Then fill field with XPath //*[starts-with(@class, 'test')]/following-sibling::* with Healing by value Changed_XPath_#4

  Scenario: XPath Ancestor:: - Healing Locators _5
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field with XPath (//*[starts-with(@class, 'test')]/ancestor::div[@class='healenium-form validate-form']//input)[1] by value HLM_XPath_#5
    When click button to change locators
    Then fill field with XPath (//*[starts-with(@class, 'test')]/ancestor::div[@class='healenium-form validate-form']//input)[1] with Healing by value Changed_XPath_#5

  Scenario: XPath OR - Healing Locators _6
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field with XPath //*[@id='change_id' or @id='omg'] by value HLM_XPath_#6
    When click button to change locators
    Then fill field with XPath //*[@id='change_id' or @id='omg'] with Healing by value Changed_XPath_#6

  Scenario: XPath And - Healing Locators _7
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field with XPath //*[@id='change_id' and @type='text'] by value HLM_XPath_#7
    When click button to change locators
    Then fill field with XPath //*[@id='change_id' and @type='text'] with Healing by value Changed_XPath_#7

  Scenario: XPath Starts-with - Healing Locators _8
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field with XPath //*[starts-with(@class, 'test')] by value HLM_XPath_#8
    When click button to change locators
    Then fill field with XPath //*[starts-with(@class, 'test')] with Healing by value Changed_XPath_#8

  Scenario: XPath Precending:: - Healing Locators _9
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field with XPath //*[@id='change_className']/preceding::*[@id='change_id'] by value HLM_XPath_#9
    When click button to change locators
    Then fill field with XPath //*[@id='change_className']/preceding::*[@id='change_id'] with Healing by value Changed_XPath_#9

  Scenario: XPath Descendant:: - Healing Locators _10
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field with XPath //*[@id='descendant_change']/descendant::input by value HLM_XPath_#10
    When click button to change locators
    Then fill field with XPath //*[@id='descendant_change']/descendant::input with Healing by value Changed_XPath_#10

  Scenario: XPath Hover - Healing Locators _11
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field with XPath <Hover> by value HLM_XPath_#11
    When click button to change locators
    Then fill field with XPath <Hover> with Healing by value Changed_XPath_#11