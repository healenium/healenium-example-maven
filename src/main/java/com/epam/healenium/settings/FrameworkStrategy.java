package com.epam.healenium.settings;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.SelfHealingDriver;

import java.util.HashMap;

public interface FrameworkStrategy {
    HashMap<String, FrameworkPage> useSettings();
}
