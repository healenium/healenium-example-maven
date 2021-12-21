Feature: This file contains tests healing locators using different CSS selectors

  Background:
    Given init browser with capabilities from browsers.json

  Scenario: CSS Attribute - Healing locators _1
    Given go to https://mdn.github.io/web-components-examples/life-cycle-callbacks/
    And click add square button
    And verify that square has been changed
    When click update square button
    Then verify that healing appears for changing square

#  Scenario: CSS Id - Healing locators _2
#
#  Scenario: CSS Element - Healing locators _3
#
#  Scenario: CSS Disabled - Healing locators _4
#
#  Scenario: CSS Enabled - Healing locators _5
#
#  Scenario: CSS Checked - Healing locators _6
#
#  Scenario: CSS Hover - Healing locators _7
#
#  Scenario: CSS FirstChild - Healing locators _8
#
#  Scenario: CSS LastChild - Healing locators _9
#
    #  Scenario: ClassName - Healing locators _10