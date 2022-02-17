package com.epam.healenium.settings.framework;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.SelfHealingDriver;
import com.epam.healenium.settings.FrameworkStrategy;

import java.util.HashMap;

public class JdiContext implements FrameworkStrategy {
    private SelfHealingDriver driver;

    public JdiContext(SelfHealingDriver driver) {
        this.driver = driver;
    }

    @Override
    public HashMap<String, FrameworkPage> useSettings() {
        return null;
    }
}
