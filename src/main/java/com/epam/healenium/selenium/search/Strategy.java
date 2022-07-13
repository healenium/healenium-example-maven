package com.epam.healenium.selenium.search;

public interface Strategy {
    boolean doAction(String selector);
    boolean doWaitAction(String selector, int seconds);
}