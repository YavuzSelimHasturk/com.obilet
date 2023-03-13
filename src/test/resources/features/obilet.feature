@wip
Feature: obilet.com

    Scenario: obilet yeni uyelik olusturma

      Given : Kullanici obilet uygulamasini acar
      And : Uygulamanin dogru sekilde acildigini kontrol eder
      And : Alt sekmelerden Hesabim sekmesine tiklar
      And : Uye girisi yapin butonuna tiklar
      And : Giris yap ekrani acildigini kontrol eder
      And : Hemen uye ol textine tiklar. Mail ve Password alanlarini doldurarak uye ol butonuna tiklar
      And : Hesabim sayfasini acar. Sayfanin dogru sekilde acildigini kontrol eder
      Then : Alt sekmeden Ara butonuna tiklar. Anasayfanin acildigini dogrular



  Scenario: obilet otel rezervasyonu yapma

    Given : Kullanici obilet uygulamasini acar
    And : Uygulamanin dogru sekilde acildigini kontrol eder
    And : Otel Tab ine tiklar ve otel rezervasyonu arama sayfasinin acildigini gorur
    And : Gidilecek il veya ilceyi ve Gidis-Donus tarihini secer
    And : Otel ara butonuna tiklar ve otellerin listelendigini kontrol eder
    And : Otellerden herhangi birini secer
    And : Otel detay sayfasindan bir oda secer
    Then : Checkout sayfasinin acildigini kontrol eder








