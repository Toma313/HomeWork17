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
    And check "<ELEMENT>" with  "<RESULT>"
    Examples:
      | ELEMENT                                                                       | RESULT                      |
      | //button[@id='btn-consultation-hero']                                         | Безкоштовна консультація    |
      | //*[@id='body']/div[1]/main/section[2]/div/div/div[1]/div/ul/li[1]/a/div/p[1] | Програмування               |
      | //*[@id=\'body\']/div[1]/main/section[1]/div[2]/div/ul/li[1]/div/p/span[2]    | Школа надає освітні послуги |
      | //*[@id=\'body\']/div[1]/div[1]/div[2]/div/div/nav/ul/li[3]/a                 | працевлаштування            |
      | //*[@id=\'body\']/div[1]/div[1]/div[1]/div/div/div[1]/a                       | Особистий кабінет           |

