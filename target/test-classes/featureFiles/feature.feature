Feature: Login on Spotify

  Background:
    Given user is on the main page
    And user goes to login page

  Scenario: user tries to login on Spotify with Gmail account
    When user clicks continue with Google
    And user enters 'angmailaccount@gmail.com' in username field
    And clicks on Gmail login button
#    Then user receives message:'Contul Google nu a fost găsit'

