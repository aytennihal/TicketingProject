@userList
  Feature: User List

  Background:
    Given user logged in
  When user click "Navbar Toggle Icon"
  And user navigates to Administration
  And user click "User Create"

    Scenario Outline: User can create new user on User List

      And user enter "<firstName>" to the First Name
      And user enter "<lastName>" to the Last Name
      And user enter "<emailAddress>" to the Email Adress
      And user enter "<phoneNumber>" to the Phone Number
      And user enter "<password>" to the Password
      And user enter "<passwordConfirmation>" to the Password Confirmation
      And user select a "<gender>"
      And user select "<role>"
      And user click "Save"
      Then user should be able to see new user with "<emailadress>" under the User List

      Examples:

      | firstName        | lastName | emailAddress            | phoneNumber| password| passwordConfirmation|gender | role    |
      | Ayten Nihal      | Cengiz   | aytennihal1998@gmail.com|05534304671 |123456   | 123456              |FEMALE | employee|
      |Mustafa Alparslan | Cengiz   | mustafa@gmail.com       |05534304672 |MAC123456| MAC123456           |MALE   |employee |
      |Yeni              |          | yenikisi                |12345678    |Yeni123  | 123                 |FEMALE |         |

Scenario: User can delete user on User List
  When user click delete button next to user "mustafa@gmail.com"
  Then user should not see that user in user list anymore


  Scenario: User can not create user with same credentials
    When user enter user credentials that is previously created
    And user click "Save"
    Then user should see "X" message

    Scenario: User can update user credentials
      When user click update button next to user "aytennihal1998@gmail.com"
      And user enter "Nihal" on the First Name
      And user click "Save"
      Then user should see updated name "Ayten Nihal"  user list

