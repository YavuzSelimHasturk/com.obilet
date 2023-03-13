package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class obiletStepDefinition {
    // uygulama acilinca en ustte gorunen obilet basligi
    By header = By.id("com.obilet.androidside:id/toolbar_image_header");
    // uygulama giris sayfasinda alt tarafta bulunan hesabim sekmesi
    By hesabim = By.xpath("//android.widget.FrameLayout[@content-desc=\"Hesabım\"]/android.view.ViewGroup/android.widget.TextView");
    // hesabim bolumu icerisindeki UYE GIRISI YAPIN isimli buton
    By buttonUyeGirisiYapin = By.id("com.obilet.androidside:id/login_button_main_account");
    //uye girisi sayfasinin ustunde yer alan Uye Girisi basligi
    By titleUyeGirisi = By.id("com.obilet.androidside:id/toolbar_title");
    //uye girisi sayfasinin sag-orta sinda yer alan HEMEN UYE OL isimli text
    By textHemenUyeOl = By.xpath("//*[@text='HEMEN ÜYE OL']");
    // Uye Ol sayfasinda yer alan email bolumu
    By email = By.xpath("(//*[@class='android.widget.EditText'])[1]");
    // Uye Ol sayfasinda yer alan password bolumu
    By password = By.xpath("(//*[@class='android.widget.EditText'])[2]");
    // Uye ol sayfasinda yer alan Uye Ol butonu
    By buttonUyeOl = By.id("com.obilet.androidside:id/sign_up_button");
    // Uye olduktan sonra acilan Hesabim sayfasinin en ustundeki "Hesabim" basligi
    By titleHesabim = By.id("com.obilet.androidside:id/toolbar_title");
    //Hesabim sayfasinin alt bolumundeki Ara ikonu
    By iconAra = By.xpath("//*[@text='Ara']");
    // Uygulama acildiginda sayfanin ust tarafinda yer alan Otel sekmesi
    By otel = By.xpath("//*[@text='Otel']");
    // Otel sayfasinda yer alan "Otel Ara" butonu
    By buttonOtelAra = By.id("com.obilet.androidside:id/find_hotel_reservation_find_button");
    // Otel sayfasinda yer alan gidilecek yer olan "Nereye" bolumu
    By nereyeOtelArama = By.id("com.obilet.androidside:id/find_hotel_reservation_to_where_textView");
    // Nereye kismina tiklandiginda il/ilce yazmak icin acilan yeni sekmedeki arama kutusu
    By nereyeSearchBox = By.id("com.obilet.androidside:id/search_editText");
    // girilmis olan gidilecek yer sonuclarindan cikan ilk sonuc
    By gidilecekYerTercih = By.xpath("(//*[@class='android.widget.TextView'])[3]");
    // Otel giris tarihi
    By textGirisTarihi = By.id("com.obilet.androidside:id/find_hotel_reservation_departure_date_label");
    // Giris tarihine girildiginde acilan takimden secilecek giris tarihi
    By secilecekGirisTarihi = By.xpath("//*[@text='29']");
    // Giris tarihine girildiginde acilan takvimden secilecek cikis tarihi
    By secilecekCikisTarihi = By.xpath("(//*[@text='31'])");
    // Otel arama sonuclarinin goruntulendigi sayfada yer alan "Arama sonucu olarak xxx tesis listeleniyor." yazisi bolumu
    By otelListelemeSonucu = By.id("com.obilet.androidside:id/find_text_container");
    // gelen otel sonuclarindan ilk sirada yer alan sonuc
    By secilecekOtel = By.xpath("(//*[@class='android.widget.LinearLayout'])[15]");
    // secilen otel sayfasinin alt tarafinda yer alan "Oda Sec" butonu
    By buttonOdaSec = By.id("com.obilet.androidside:id/select_room_button");
    // Gelen oda seceneklerinden ilkine ait "Odayi sec" butonu
    By buttonSecilecekOda = By.xpath("(//*[@class='android.widget.TextView'])[10]");
    // Oda secimi sonrasi acilan rezervasyon detay bilgilerine dair checkout sayfasi
    By rezervasyonCheckoutBilgileri = By.id("com.obilet.androidside:id/hotel_room_detail_layout_checkout");
    Faker faker = new Faker();

    @Given(": Kullanici obilet uygulamasini acar")
    public void kullanici_obilet_uygulamasini_acar() {
        Driver.getAppiumDriver();
    }

    @Given(": Uygulamanin dogru sekilde acildigini kontrol eder")
    public void uygulamanin_dogru_sekilde_acildigini_kontrol_eder() {
        assertTrue(Driver.getAppiumDriver().findElement(header).isDisplayed());
    }

    @Given(": Alt sekmelerden Hesabim sekmesine tiklar")
    public void alt_sekmelerden_hesabim_sekmesine_tiklar() {
        Driver.getAppiumDriver().findElement(hesabim).click();
    }

    @Given(": Uye girisi yapin butonuna tiklar")
    public void uye_girisi_yapin_butonuna_tiklar() {
        Driver.getAppiumDriver().findElement(buttonUyeGirisiYapin).click();
    }

    @Given(": Giris yap ekrani acildigini kontrol eder")
    public void giris_yap_ekrani_acildigini_kontrol_eder() {
        assertTrue(Driver.getAppiumDriver().findElement(titleUyeGirisi).isDisplayed());
    }

    @Given(": Hemen uye ol textine tiklar. Mail ve Password alanlarini doldurarak uye ol butonuna tiklar")
    public void hemen_uye_ol_textine_tiklar_mail_ve_password_alanlarini_doldurarak_uye_ol_butonuna_tiklar() {
        Driver.getAppiumDriver().findElement(textHemenUyeOl).click();

        Driver.getAppiumDriver().findElement(email).click();
        Driver.getAppiumDriver().findElement(email).sendKeys(faker.internet().emailAddress());

        Driver.getAppiumDriver().findElement(email).click();
        Driver.getAppiumDriver().findElement(password).sendKeys(faker.internet().password());

        Driver.getAppiumDriver().findElement(buttonUyeOl).click();
    }

    @Given(": Hesabim sayfasini acar. Sayfanin dogru sekilde acildigini kontrol eder")
    public void hesabim_sayfasini_acar_sayfanin_dogru_sekilde_acildigini_kontrol_eder() {
        assertTrue(Driver.getAppiumDriver().findElement(titleHesabim).isDisplayed());
    }

    @Then(": Alt sekmeden Ara butonuna tiklar. Anasayfanin acildigini dogrular")
    public void alt_sekmeden_ara_butonuna_tiklar_anasayfanin_acildigini_dogrular() {
        Driver.getAppiumDriver().findElement(iconAra).click();
        assertTrue(Driver.getAppiumDriver().findElement(header).isDisplayed());

    }

    @And(": Otel Tab ine tiklar ve otel rezervasyonu arama sayfasinin acildigini gorur")
    public void otelTabIneTiklarVeOtelRezervasyonuAramaSayfasininAcildiginiGorur() {
        Driver.getAppiumDriver().findElement(otel).click();
        String actualOtelAraStr = Driver.getAppiumDriver().findElement(buttonOtelAra).getText();
        String expectedOtelAramaSayfasi = "Otel Ara";
        assertEquals(expectedOtelAramaSayfasi, actualOtelAraStr);

    }

    @And(": Gidilecek il veya ilceyi ve Gidis-Donus tarihini secer")
    public void gidilecekIlVeyaIlceyiVeGidisDonusTarihiniSecer() {
        Driver.getAppiumDriver().findElement(nereyeOtelArama).click();
        Driver.getAppiumDriver().findElement(nereyeSearchBox).click();
        Driver.getAppiumDriver().findElement(nereyeSearchBox).sendKeys(ConfigReader.getProperty("il/ilce"));
        ReusableMethods.bekle(3);
        Driver.getAppiumDriver().findElement(gidilecekYerTercih).click();

        Driver.getAppiumDriver().findElement(textGirisTarihi).click();
        Driver.getAppiumDriver().findElement(secilecekGirisTarihi).click();
        Driver.getAppiumDriver().findElement(secilecekCikisTarihi).click();
    }


    @And(": Otel ara butonuna tiklar ve otellerin listelendigini kontrol eder")
    public void otelAraButonunaTiklarVeOtellerinListelendiginiKontrolEder() {
        Driver.getAppiumDriver().findElement(buttonOtelAra).click();
        assertTrue(Driver.getAppiumDriver().findElement(otelListelemeSonucu).isDisplayed());

    }

    @And(": Otellerden herhangi birini secer")
    public void otellerdenHerhangiBiriniSecer() {
        ReusableMethods.bekle(2);
        Driver.getAppiumDriver().findElement(secilecekOtel).click();

    }

    @And(": Otel detay sayfasindan bir oda secer")
    public void otelDetaySayfasindanBirOdaSecer() {
        ReusableMethods.bekle(8);
        Driver.getAppiumDriver().findElement(buttonOdaSec).click();
        ReusableMethods.bekle(2);
        Driver.getAppiumDriver().findElement(buttonSecilecekOda).click();
        ReusableMethods.bekle(2);
    }

    @And(": Checkout sayfasinin acildigini kontrol eder")
    public void checkoutSayfasininAcildiginiKontrolEder() {
        ReusableMethods.bekle(15);
        assertTrue(Driver.getAppiumDriver().findElement(rezervasyonCheckoutBilgileri).isDisplayed());

    }
}
