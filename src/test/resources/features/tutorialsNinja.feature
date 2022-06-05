Feature: TutorialsNinja

  Scenario: TC01 kullanici belirtilen sitede alisveris yapar
    Given kullanici tutorial Ninja anasayfasinda
    Then kullanici phone pda sekmesine gecis yapar
    And  kullanici arayuzdeki tum telefonlari alısveris listesine ekler
    And kullanici alisveris sepetine tiklar
    Then kullanici alisveris sepetine gecis yapar
    And kullanici alisverisine devam eder
    And sayfayi kapatir


    Scenario: TC02 kullanici listesini goruntuler
      Given kullanici tutorial Ninja anasayfasinda
      Then kullanici phone pda sekmesine gecis yapar
      And kullanici arayuzdeki tum telefonlari alısveris listesine ekler
      Then kullanici urunlerin markalarini listeler
      And kullanici alisveris sepetine tiklar
      And kullanici alisveris sepetine gecis yapar
      Then kullanici alisveris sepetindeki urunleri listeler
      And sayfayi kapatir