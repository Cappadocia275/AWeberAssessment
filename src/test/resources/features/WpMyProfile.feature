Feature: Wordpress Login
  @wordPressMyProfile
  Scenario: Log in to account
    Given Go to Wordpress My Profile page
    And enter email address
    And click continue button
    And enter password
    And click log in button
    And click profile button
    Then verify that you are in My Profile page
    Then verify that your display name is the same as your username
    And complete your profile with your name,surname and about me
    And click save button
    Then verify that is successfully saved
    And click Add button to add an URL for the profile link
    And enter URL and description
    And click Add Site button
    Then verify that is successfully added
    And click log out button