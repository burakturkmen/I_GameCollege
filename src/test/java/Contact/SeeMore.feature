@SmokeTest
Feature: See More Page

  Scenario: See More Test

    Given Navigate to website (See More)
    And Over hover to Contact
    When Click to See More button
    Then Verify About Us text
    Then Verify About Us Page's Url

    #See More buttonunun locatorunda "Hakkımızda" yazıyor. Commentlere ekle