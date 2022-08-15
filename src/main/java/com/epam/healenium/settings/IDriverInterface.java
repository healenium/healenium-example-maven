package com.epam.healenium.settings;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public interface IDriverInterface {

    static final String LOCALHOST = "localhost";
    static final String SELENOID = "10.17.220.218";

    WebDriver setDriver(Object delegate) throws MalformedURLException;

    Object useChrome();

    Object useFirefox();

    Object useEdge();

}
