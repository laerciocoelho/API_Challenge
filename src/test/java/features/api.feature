Feature: API automation test

  Scenario: Wants to see if the call is success "200"
    When calls "/movieWithUser"
    Then receives response status value "200 OK"

  Scenario: Wants to see if the call return user info by ID
    When calls "/user/" with valid id "2"
    Then receives response with first_name key value "Ravi"