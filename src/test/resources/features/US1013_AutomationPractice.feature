Feature: US1013 kullanici register yapabilmeli

  @aut
  Scenario: TC20 kullanici uygun datalarla register olabilmeli

    Given kullanici "automationUrl" anasayfasinda
    And user sign in linkine tiklar
    And kullanici 3 sn bekler
    And user Create and account bolumune email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    Then kullanici 3 sn bekler
    And user Register butonuna basar
    Then hesap olustugunu dogrular
    And kullanici 3 sn bekler
    And kullanici 2 sn bekler
    Then sayfayi kapatir