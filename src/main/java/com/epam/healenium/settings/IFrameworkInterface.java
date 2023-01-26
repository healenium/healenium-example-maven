package com.epam.healenium.settings;

import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.PagesType;

import java.util.HashMap;

public interface IFrameworkInterface {
    HashMap<PagesType, FrameworkPage> useSettings();
}
