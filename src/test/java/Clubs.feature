Feature: Clubs Page

  Scenario: Clubs Page Test

    Given Navigate to website (Clubs)
    And Over hover to life in College (Clubs)
    When Click to Clubs Button
    Then Verify Clubs Text
    Then Verify Clubs Page's url
    Then Click to Social Media Club
    And Verify Social Media Club text
    When click to Game Art Club
    And Verify Game art Club text
    When Click to Game Marketing Club
    And  Verify Game Marketing Club text
    When Click to Game College Magazine Club
    And  Verify Game College Magazine Club text
    When Click to Game Networking Club
    And  Verify Game Networking Club text

    #social media Club linkinde büyük i kullanılmış.
    #küçük clubs yazısına tıklanıldığında bazı foroğraflar eksik ve linkler çalışmıyor.