@ALL
  Feature: check test
Scenario: open page
When Open page "https://dnipro.ithillel.ua/"
  And Check text "Безкоштовна консультація"
  And Check textCours "Програмування"
  And Check textMenu "працевлаштування"
  And Check textSection "Школа надає освітні послуги"
  And Check textHeader "Особистий кабінет"

  Scenario Outline: open mainPage
  When Open pageMain "https://dnipro.ithillel.ua/"
    And check tittles "<ELEMENT>" "<RESULT>"
    Examples:
      | ELEMENT                              | RESULT                     |
      | mainPage.prazevlashtyvania.getText() | "Безкоштовна консультація" |



