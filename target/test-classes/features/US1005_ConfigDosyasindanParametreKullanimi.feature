Feature: US1005 Kullanici parametre ile configuration file'i kullanabilmeli

  @config
  Scenario: TC09 configuration properties dosyasindan parametre kullanimi

    Given kullanici "amazonUrl" anasayfasinda
    Then kullanici 2 sn bekler
    And urlin "amazon" icerdigini test eder
    And kullanici 2 sn bekler
    Then sayfayi kapatir

    #yorum satiri