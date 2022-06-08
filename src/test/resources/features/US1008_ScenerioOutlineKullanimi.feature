# amazon sayfasina gidip sirasiyla nutella, java, elma, armut aratip
  # sonuclarin arama yaptigimiz kelimeyi icerdigini test edelim

  Feature: US1008 kullanici amazonda istedigi kelimeleri aratir

    Scenario Outline: TC15 amazonda listedeki elementleri aratma
      Given kullanici "amazonUrl" anasayfasinda
      Then kullanici "<istenenKelimeler>" icin arama yapar
      And sonucların "<istenenKelimeKontrol>" icerdigini test eder
      Then sayfayi kapatir


      Examples:
        | istenenKelimeler | istenenKelimeKontrol |
        | nutella          | nutella              |
        | java             | java                 |
        | selenium         | selenium             |
        | Yusuf            | Yusuf                |
