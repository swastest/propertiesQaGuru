package uiTests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import configInterf.RemoteOrLocalConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;



public class MultiStartTest extends TestBaseForMultitest{
    @Tag("multi")
    @Test
    @DisplayName("Проверка стоимости на главной странице")
    void generatedTest() {
        step("Открыть главную страницу", () -> {
            Selenide.open("https://liveinclean.ru/");
        });

        step("Выбрать город", () -> {
            $("div.city-select.selected-city", 1).click();
            $("#find-city").setValue("Москва");
            $("li.ui-menu-item").click();

        });

        step("Проверить стоимость уборки для выбранного города", () -> {
            $("div.city-select.selected-city", 1).shouldHave(text("Москва"));
            $("div.form-cost__value > span.form-cost__sum").shouldHave(text("490"));
        });
    }
}
