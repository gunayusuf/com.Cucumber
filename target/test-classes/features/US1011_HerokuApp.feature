Feature: US1011 herokuapp Delete testi

  @heroku
  Scenario: TC18 heroku app'dan delete butonu calismali
    Given kullanici "herokuappUrl" anasayfasinda
    And add element butonuna basar
    And kullanici 2 sn bekler
    Then Delete butonunu gorunur oluncaya kadar bekler
    And Delete butonunun gorunur oldugunu test eder
    And kullanici 2 sn bekler
    And Delete butonuna basar
    Then Delete butonunun gorunmedigini test eder
    And sayfayi kapatir