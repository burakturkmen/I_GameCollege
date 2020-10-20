@SmokeTest
Feature: GameJam Page

  Scenario: GameJam test

    Given Navigate to website (GameJam)
    And Over hover to Life in College (GameJam)
    When Click to GameJam
    Then verify GameJams text
    Then verify GameJam Page's URL