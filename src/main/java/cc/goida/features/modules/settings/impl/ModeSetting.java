package cc.goida.features.modules.settings.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class ModeSetting {
    private final String name;
    @Setter
    private String currMode;
    private final String[] modes;
}
