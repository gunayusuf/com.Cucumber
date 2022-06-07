Feature: US1004 kullanici parametre kullanarak arama yapabilmeli

  @parametre
  Scenario: TC08 kullanici parametre ile amazonda arama yapabilmeli
    Given kullanici amazon anasayfasinda
    And kullanici "ssd" icin arama yapar
    Then sonuclarin "ssd" icerdigini test eder
    Then sayfayi kapatir