Feature: Operations about user

  @GetUser
  Scenario: Get user successfully.
    When I consume the endpoint and I get the user information
    Then I can validate the get user response code