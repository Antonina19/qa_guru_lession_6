package guru.qa.allure;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LabelsTest {
    @Test
    @Feature("Issues")
    @Story("Поиск по Issue")
    @Owner("eroshenkoam")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name="GitHub", url="https://github.com")
    @Description("Этот тест нужен бла-бла-бла..")
    @DisplayName("Проверка поиска работы по Issues через Аннотации")
    public void testLabelsWithAnnotations(){

    }

    @Test
    @DisplayName("Проверка поиска работы по Issues через Методы")
    public void testLabelsWithMethods(){
        Allure.feature("Issues");
        Allure.story("Поиск по Issue");
        Allure.label("owner","eroshenkoam");
        Allure.label("severity",SeverityLevel.BLOCKER.toString());
        Allure.link("itHub","https://github.com");
        Allure.description("Этот тест нужен бла-бла-бла.."); 


    }
}
