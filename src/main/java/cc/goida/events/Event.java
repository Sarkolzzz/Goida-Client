package cc.goida.events;

import cc.goida.Goida;
import lombok.Getter;

@Getter
public class Event {
    private boolean cancelled = false;

    public void cancel(){
        cancelled = true;
    }

    public void call(){
        if (cancelled) return;
        Goida.getInstance().eventBus.post(this);
    }
}
