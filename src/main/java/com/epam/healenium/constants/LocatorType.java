package com.epam.healenium.constants;

public enum LocatorType {
    XPATH("xpath"),
    CSS("css"),
    ID("id"),
    CLASS_NAME("className"),
    LINK_TEXT("linkText"),
    NAME("name"),
    PARTIAL_LINK_TEXT("//*[@id='change_links']"),
    TAG_NAME("tagName");

    private final String typeName;

    LocatorType(String name) {
        this.typeName = name;
    }
}
