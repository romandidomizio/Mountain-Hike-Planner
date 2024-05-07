Feature: Trail Selection
  As a hiker
  I want to select a trail from a list
  So that I can view details about the trail

  Scenario: Select a trail from the list
    Given I have a list of trails
    When I select the trail "Longs Peak"
    Then the details for "Longs Peak" should be displayed
