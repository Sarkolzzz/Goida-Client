package cc.goida.events.impl;

import cc.goida.events.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EventRotation extends Event {
    private float yaw;
    private float pitch;
}
