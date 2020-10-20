@SmokeTest
Feature: Contact Page

  Scenario: Contact Test

    Given Navigate to website (Contact)
    And Over hover to Contact (Contact)
    When Click to Contact Button
    Then Verify Contact Text
    And Verify Phone Number
    And Verify Founder Member's Name
    And Verify Contact Us! text
    When Fill the form boxes
    | Fields   | Values                                                 |
    | Name     | John Smith                                             |
    | Mail     | john@smith.com                                         |
    | Subject  | Test Automation                                        |
    | Message  | This is a Test Automation Massage. Please don't mind.  |
    Then Click to Submit Button