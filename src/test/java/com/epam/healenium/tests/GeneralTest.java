package com.epam.healenium.tests;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.PagesType;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

public class GeneralTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Select checkboxes with findElements annotation")
    public void testSelectCheckboxes() {
        FrameworkPage testPage = pages.get(String.valueOf(PagesType.TEST_ENV));

        testPage.openPage()
                .selectCheckboxes()
                .clickFormButton()
                .selectCheckboxes();
    }

}
