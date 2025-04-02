package cc.goida.features.modules.settings.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SliderSetting {
    private String name;
    private float min;
    private float max;
    private float step;
}