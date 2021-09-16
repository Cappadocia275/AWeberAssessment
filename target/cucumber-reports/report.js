$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/WpMyProfile.feature");
formatter.feature({
  "name": "Wordpress Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Log in to account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wordPressMyProfile"
    }
  ]
});
formatter.step({
  "name": "Go to Wordpress My Profile page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.WordPressMyProfile.go_to_Wordpress_My_Profile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter email address",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.WordPressMyProfile.enter_email_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click continue button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.WordPressMyProfile.click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.WordPressMyProfile.enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click log in button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.WordPressMyProfile.click_log_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click profile button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.WordPressMyProfile.click_profile_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that you are in My Profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.WordPressMyProfile.verify_that_you_are_in_My_Profile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that your display name is the same as your username",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.WordPressMyProfile.verify_that_your_display_name_is_the_same_as_your_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "complete your profile with your name,surname and about me",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.WordPressMyProfile.complete_your_profile_with_your_name_surname_and_about_me()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.WordPressMyProfile.click_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that is successfully saved",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.WordPressMyProfile.verify_that_is_successfully_saved()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Add button to add an URL for the profile link",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.WordPressMyProfile.click_Add_button_to_add_an_URL_for_the_profile_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter URL and description",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.WordPressMyProfile.enter_URL_and_description()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Add Site button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.WordPressMyProfile.click_Add_Site_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that is successfully added",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.WordPressMyProfile.verify_that_is_successfully_added()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click log out button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.WordPressMyProfile.click_log_out_button()"
});
formatter.result({
  "status": "passed"
});
});