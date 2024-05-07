Feature: Manage Gear Checklist
  As a hiker
  I want to customize my gear checklist
  So that I can add items I need and remove items I don't

  Scenario: Add an item to the gear checklist
    Given I am viewing the gear checklist
    When I add the item "Extra Water Bottle" to the checklist
    Then "Extra Water Bottle" should appear in the checklist

  Scenario: Remove an item from the gear checklist
    Given I am viewing the gear checklist
    And the checklist contains "Extra Water Bottle"
    When I remove the item "Extra Water Bottle" from the checklist
    Then "Extra Water Bottle" should no longer appear in the checklist
