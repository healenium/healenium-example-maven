Feature: This file contains tests healing locators using different CSS selectors
  Total number of cases = 9

  Background:
    Given init browser

  Scenario: CSS Attribute - Healing locators _1
    Given go to https://mdn.github.io/web-components-examples/life-cycle-callbacks/
    And click add square button
    And verify that appeared CSS attribute [c='red']
    When click update square button
    Then verify that healing appears for changing CSS attribute [c='red']

  Scenario: CSS Id - Healing locators _2
    Given go to https://elenastepuro.github.io/test_env/index.html
    And fill field with CSS #change_id by value HLM_Css_#2
    When click button to change locators
    Then fill field with CSS #change_id by value Changed_Css_#2 with Healing

  Scenario: CSS Element - Healing locators _3
    Given go to https://elenastepuro.github.io/test_env/index.html
    And fill field with CSS test_tag by value HLM_Css_#3
    When click button to change locators
    Then fill field with CSS test_tag by value Changed_Css_#3 with Healing

  Scenario: CSS Disabled - Healing locators _4
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field with CSS input:disabled by value HLM_Css_#4
    When click button to change locators
    Then fill field with CSS input:disabled by value Changed_Css_#4 with Healing

  Scenario: CSS Enabled - Healing locators _5
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field with CSS textarea:enabled by value HLM_Css_#5
    When click button to change locators
    Then fill field with CSS textarea:enabled by value Changed_Css_#5 with Healing

  Scenario: CSS Checked - Healing locators _6
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field with CSS input:checked by value HLM_Css_#6
    When click button to change locators
    Then fill field with CSS input:checked by value Changed_Css_#6 with Healing

  Scenario: CSS Hover - Healing locators _7
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field with CSS <a:hover> by value HLM_Css_#7
    When click button to change locators
    Then fill field with CSS <a:hover> by value Changed_Css_#7 with Healing

  Scenario: CSS ClassName - Healing locators _8
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field with CSS .test_class by value HLM_Css_#8
    When click button to change locators
    Then fill field with CSS .test_class by value Changed_Css_#8 with Healing

  Scenario: CSS Id Special Character - Healing locators _9
    Given go to C:\Healenium\Repository\healenium-example-maven\test_env\index.html
    And fill field with CSS input#change\\:name by value HLM_Css_#9
    When click button to change locators
    Then fill field with CSS input#change\\:name by value Changed_Css_#9 with Healing