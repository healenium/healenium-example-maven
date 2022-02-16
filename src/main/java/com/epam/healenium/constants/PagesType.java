package com.epam.healenium.constants;

public enum PagesType {
    TEST_ENV("Test env page"),
    MARKUP("Markup page"),
    MARKUP_FIND_BY("Markup with find by"),
    CALLBACK("Callback page");

    private String pagetype;
    PagesType(String page) {
        pagetype=page;
    }
}
