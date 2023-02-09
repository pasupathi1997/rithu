Feature: 
  to enter the valiate details in form

  Scenario: 
    Give accurate information in form

    Given Launch google Chrome browser
    When Give accurates information in form
      | comdian | Anchor  | Website         | mobile     |
      | puzhah  | rakshan | cwk@vijaytv.com | 3216598745 |
    Then Pending other Feild

  Scenario: 
    Give accurate information in form and fill down

    Given Launch google Chrome browsers
    When Give accurates information in form fill down
      | Achnor name         | fav name   |
      | kamal               | GPmuthu    |
      | bigboss@vijaytv.com | 3216598745 |
    Then Pending other Feild
