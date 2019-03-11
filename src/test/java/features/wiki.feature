Feature: wiki fruit definition
  @Run
  Scenario Outline: I want to look up the definition of words

    Given the user navigates to the wikipage
    When the user look up the definition of the word <word>
    Then the user Check that one definition is: <definition>
    And confirm that the same <definition> does not appear repeated

    Examples:
      | word     | definition                                                                                      |
      | apple    | A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.   |
      | pear     | An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.  |
