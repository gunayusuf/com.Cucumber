Feature: US1005 Kullanici parametre ile configuration file'i kullanabilmeli

  @config
  Scenario: TC09 configuration properties dosyasindan parametre kullanimi

    Given kullanici "amazonUrl" anasayfasinda
    Then kullanici 2 sn bekler
    And urlin "amazon" icerdigini test eder
    And kullanici 2 sn bekler
    Then sayfayi kapatir

    #yorum satiri


  Scenario: TC10 config dosyasi ile ninja sitesinde arama
    Given kullanici "ninjaUrl" anasayfasinda
    And kullanici phone pda sekmesine gecis yapar
    And kullanici 2 sn bekler
    And  kullanici arayuzdeki tum telefonlari alısveris listesine ekler
    And kullanici alisveris sepetine tiklar
    And kullanici 2 sn bekler
    Then kullanici alisveris sepetine gecis yapar
    And kullanici alisverisine devam eder
    Then kullanici 2 sn bekler
    And sayfayi kapatir