package com.epam.healenium.constants;

public enum PageUrl {
    TEST_ENV_URL("https://elenastepuro.github.io/test_env/index.html"),
    CALLBACK_URL("https://mdn.github.io/web-components-examples/life-cycle-callbacks/"),
    MARKUP_URL("http://sha-test-app.herokuapp.com/");

    private final String urlName;

    PageUrl(String name) {
        this.urlName = name;
    }

    @Override
    public String toString() {
        return urlName;
    }
}
