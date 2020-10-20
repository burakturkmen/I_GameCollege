@SmokeTest
Feature: Social Activities Page

  Scenario: Social Activities Test

    Given Navigate to website (Social Activities)
    And Over hover to Life in Collage (Social Activities)
    When Click to Social Activities
    Then verify SOCIAL ACTIVITIES text
    Then verify Social Activities Page's url