package cc.goida.features.modules.settings;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
public class ModeSetting {
    private final String name;
    @Setter
    private String currMode;
    private final String[] modes;

    public ModeSetting(String name, String currMode, String... modes) {
        this.name = name;
        this.currMode = currMode;
        this.modes = modes;
    }

    public int getIndex() {
        return modes.length - 1;
    }
}
