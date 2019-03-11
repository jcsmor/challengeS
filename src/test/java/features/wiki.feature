Feature: wiki fruit definition
  @Run
  Scenario: I want to look up the definition of words
    When the user navigates to the wikipage
    Then the user look up the definition of the word apple
    Then the user Check that one definition is: A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.
