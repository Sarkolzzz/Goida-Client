package cc.goida;

import cc.goida.events.impl.EventScreen;
import cc.goida.features.cmd.Commands;
import cc.goida.features.modules.Modules;
import cc.goida.utils.client.Imports;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import lombok.Getter;
import net.fabricmc.api.ModInitializer;

public class Goida implements ModInitializer, Imports {
    final long lastTime = System.currentTimeMillis();
    @Getter
    private static Goida instance = new Goida();
    public EventBus eventBus;
    public Modules modules;
    public Commands commands;

    public Goida(){
        instance = this;
        eventBus = new EventBus();
        modules = new Modules();
        commands = new Commands();
        init();
        eventBus.register(this);
    }

    public void init(){
        modules.init();
        commands.init();
    }

    @Override
    public void onInitialize() {
        System.out.println("Goida initialization took " + (nextTime - lastTime) + "ms");
    }

    final long nextTime = System.currentTimeMillis();

    @Subscribe
    public void onScreen(EventScreen event){
        if (event != null){
            System.out.println(event.getScreen());
        }
    }
}