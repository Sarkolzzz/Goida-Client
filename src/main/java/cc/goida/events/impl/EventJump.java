package cc.goida.events.impl;

import cc.goida.events.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EventJump extends Event {
    private boolean jumped = false;
}
