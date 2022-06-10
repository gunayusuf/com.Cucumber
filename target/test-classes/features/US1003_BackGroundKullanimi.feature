Feature: US1002 Kullanici ortak adimlari Background ile calistirir

  Background: ortak adim
    Given kullanici amazon anasayfasinda


    @pr2
    Scenario: TC06 Amazon nutella arama
      Then kullanici Nutella icin arama yapar
      And sonuclarin Nutella icerdigini test eder
      And sayfayi kapatir

      @pr2
      Scenario: TC07 Amazon java arama
        Then kullanici Java icin arama yapar
        And sonuclarin Java icerdigini test eder
        Then sayfayi kapatir