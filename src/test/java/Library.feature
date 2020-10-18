Feature: Library Page

  Scenario: Library Page Test

    Given Navigate to website (Library)
    And Over hover to Life in College (Library)
    When click Library button
    Then verify Library Text
    Then verify Library Page's url