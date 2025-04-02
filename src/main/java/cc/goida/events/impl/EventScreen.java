package cc.goida.events.impl;

import cc.goida.events.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

@Getter
@AllArgsConstructor
public class EventScreen extends Event {
    private Screen screen;
    private Text title;
}
