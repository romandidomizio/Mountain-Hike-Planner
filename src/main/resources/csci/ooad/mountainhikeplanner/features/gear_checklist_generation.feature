Feature: Gear Checklist Generation
  As a hiker
  I want to see a recommended gear checklist when I select a trail
  So that I know what to carry for the hike

  Scenario: Generate a gear checklist for a selected trail
    Given I have selected the trail "Longs Peak"
    When the trail details are displayed
    Then a recommended gear checklist based on the trail's difficulty should be shown
