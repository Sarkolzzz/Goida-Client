package cc.goida.features.modules.settings.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ModeListSetting {
    private String name;
    private BooleanSetting[] settings;
}