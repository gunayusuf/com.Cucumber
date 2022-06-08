# Hotel my camp sitesinde 3 adet negative test senaryosu olusturalim
  # 1 dogru username - yanlis password
  # 2 yanlis username - dogru password
  # 3 yanlis username - yanlis password

  Feature: US1007 yanlis bilgilerle siteye giris yapilamaz

    Background: ortak url
      Given kullanici "HMCUrl" anasayfasinda



    Scenario: TC12 yanlis password ile giris yapilamaz
      Then Log in yazisina tiklar
      And gecerli username girer
      And gecersiz password girer
      And Login butonuna basar
      Then sayfaya giris yapilamadigini test eder
      And sayfayi kapatir


      Scenario: TC13 yanlis kullanici adi ile giris yapilamaz
        Then Log in yazisina tiklar
        And gecersiz username girer
        Then gecerli password girer
        And Login butonuna basar
        Then sayfaya giris yapilamadigini test eder
        And sayfayi kapatir


        Scenario: TC14 yanlis kullanici adi ve sifre ile giris yapilamaz
          Then Log in yazisina tiklar
          And gecersiz username girer
          Then gecersiz password girer
          And Login butonuna basar
          Then sayfaya giris yapilamadigini test eder
          And sayfayi kapatir