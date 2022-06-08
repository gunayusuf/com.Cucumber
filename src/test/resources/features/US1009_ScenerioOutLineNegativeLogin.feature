
  Feature: US1009 kullanici farkli yanlis sifre ve kullanici adiyla giris yapamaz

    Scenario Outline: TC16 yanlis kullanici adi ve sifrelerle giris yapilamaz

      Given kullanici "HMCUrl" anasayfasinda
      And Log in yazisina tiklar
      Then gecersiz username olarak "<username>" girer
      And gecersiz password olarak "<password>" girer
      And Login butonuna basar
      Then sayfaya giris yapilamadigini test eder
      And sayfaya giris yapilamadigini test eder
      Then sayfayi kapatir

      Examples:
        | username | password  |
        | Manager5 | Manager5! |
        | Manager6 | Manager6! |
        | Manager7 | Manager7! |
        | Manager8 | Manager8! |
        | Manager9 | Manager9! |