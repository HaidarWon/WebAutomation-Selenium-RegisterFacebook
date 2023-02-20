Feature: Register Facebook
  Scenario: User register facebook
    Given User open web url "https://en-gb.facebook.com/reg/"
    When User input firstname "user"
    Then User input surname "newera"
    When User input phone "081229226051"
    And User input newpass "belajarberjaya123"
    Then User input date
    When User input month
    Then User input years
    And User choose gender
    Then User click Signup Button
#  Examples:
#    |firstname|surname|email|date|month|years|gender|
#    |user|newera|081229226052|1|12|2000|Male|

