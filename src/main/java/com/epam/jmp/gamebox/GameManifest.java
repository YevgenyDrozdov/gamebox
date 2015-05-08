package com.epam.jmp.gamebox;

import java.util.List;

public interface GameManifest {

    String getGameName();
    String getGameVersion();
    String getControllerClass();
    String getMiniaturePath();
    List<String> getJsResources();
    List<String> getCssResources();

}
