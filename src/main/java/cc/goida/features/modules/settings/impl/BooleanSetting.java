package cc.goida.features.modules.settings.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class BooleanSetting {
    private String name;
    @Setter
    private boolean value;
}