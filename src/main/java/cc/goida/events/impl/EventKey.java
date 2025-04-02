package cc.goida.events.impl;

import cc.goida.events.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EventKey extends Event {
    private int key;
    private int action;
}
