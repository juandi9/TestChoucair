#Autor: Juan Arboleda
@stories
  Feature: Academy Choucair
    As a user, I want to register an account at the  Utest page
  @scenario1
  Scenario Outline:  Create an account
    Given than juan wants to register an account at the  Utest page
      |strName|strLastName|strEmail|strMonth|strDay|strYear|strPostalCode|strCountry|
      |<strName>|<strLastName>|<strEmail>|<strMonth>|<strDay>|<strYear>|<strPostalCode>|<strCountry>|
    When he search his devices and tell about them
      |strComputer|strVersion|strLanguage|
      |<strComputer>|<strVersion>|<strLanguage>|
    Then He enters his password and accepts the terms
      |strPassword|strConfirmPassword|
      |<strPassword>|<strConfirmPassword>|
    Examples:
      |strName|strLastName|strEmail|strMonth|strDay|strYear|strPostalCode|strCountry|strComputer|strVersion|strLanguage|strPassword|strConfirmPassword|
      |Juan|Arboleda|juan.prueba@gmail.com|June|11|1999|050015|Colombia|Windows|10|Spanish|0123Prueba|0123Prueba|


