@ALL
  Feature: check test
Scenario: open page
When Open page "https://dnipro.ithillel.ua/"
  And Check text "Безкоштовна консультація"
  And Check textCours "Програмування"
  And Check textMenu "працевлаштування"
  And Check textSection "Школа надає освітні послуги"
  And Check textHeader "Особистий кабінет"

