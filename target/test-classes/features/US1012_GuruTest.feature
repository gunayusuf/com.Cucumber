Feature: US1012 web tablosundaki istenen sutunu yazdirma


  @guru
  Scenario: TC19 kullanici sutun basligi ile liste alabilmeli

    Given kullanici "guruUrl" anasayfasinda
    And "Company" sutunundaki tum degerleri yazdirir
    Then kullanici 2 sn bekler
    And sayfayi kapatir