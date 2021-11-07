package org.editor4j.models;

import java.awt.*;
import java.io.Serializable;

public class Settings implements Serializable {
    public Style style;
    public Font font;
    public boolean lineWrapEnabled;
    //TODO commit tabSize feature to Git with files Settings, SettingsManager, SettingsDialog
    public int tabSize;
}
