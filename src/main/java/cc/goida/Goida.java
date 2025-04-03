package cc.goida;

import cc.goida.events.impl.EventScreen;
import cc.goida.features.cmd.Commands;
import cc.goida.features.modules.api.Modules;
import cc.goida.storages.Friends;
import cc.goida.utils.client.Imports;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import lombok.Getter;
import net.fabricmc.api.ModInitializer;

/*
* меня держат в заложниках
* © Sarkolsss (2025)
*/

@SuppressWarnings("all")
public class Goida implements ModInitializer, Imports {
    @Getter
    private static Goida instance = new Goida();
    public EventBus eventBus;
    public Modules modules;
    public Commands commands;
    public Friends friends;

    public Goida(){
        long lastTime = System.currentTimeMillis();
        instance = this;
        eventBus = new EventBus();
        modules = new Modules();
        commands = new Commands();
        friends = new Friends();
        init();
        eventBus.register(this);
        long nextTime = System.currentTimeMillis();
        System.out.println("initialised in " + (nextTime - lastTime) + "ms");
    }

    public void init(){
        modules.init();
        commands.init();
        friends.init();
    }

    @Override
    public void onInitialize() {
    }

    @Subscribe
    public void onScreen(EventScreen event){
        if (event != null){
            System.out.println(event.getScreen());
        }
    }
}