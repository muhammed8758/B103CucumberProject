Feature: Techproeducation Title Testi
  Scenario: TC01_sayfanin_baslik_test
    Given tecproeducation sayfasina gidilir
    When sayfa basligi yazdirilir
    Then sayfa basliginda Bootcamop yazisi oldugu test edilir
    And sayfa kapatilir

