package cc.goida.features.modules.api;

import cc.goida.Goida;
import cc.goida.events.impl.EventKey;
import cc.goida.features.modules.impl.misc.AutoRespawn;
import cc.goida.features.modules.impl.movement.*;
import cc.goida.features.modules.impl.render.*;
import cc.goida.utils.client.ClientUtil;
import com.google.common.eventbus.Subscribe;
import lombok.Getter;

import java.util.*;

@Getter
public class Modules extends ClientUtil {
    private final ArrayList<Module> modules = new ArrayList<>();

    /* COMBAT */


    /* MOVEMENT */
    private Fly fly;
    private HighJump highJump;
    private Speed speed;
    private NoSlow noSlow;
    private LongJump longJump;

    /* PLAYER */


    /* RENDER */
    private FullBright fullBright;


    /* MISC */

    private AutoRespawn autoRespawn;

    public void init() {
        registerAll(
                /* COMBAT */


                /* MOVEMENT */
                fly = new Fly(),
                highJump = new HighJump(),
                speed = new Speed(),
                noSlow = new NoSlow(),
                longJump = new LongJump(),

                /* PLAYER */


                /* RENDER */
                fullBright = new FullBright(),


                /* MISC */
                autoRespawn = new AutoRespawn()

        );

        Goida.getInstance().eventBus.register(this);
    }

    private void registerAll(Module... Modules) {
        Arrays.sort(Modules, Comparator.comparing(Module::getName));
        Collections.addAll(modules, Modules);
    }

    @Subscribe
    private void onKey(EventKey e) {
        if (e.getAction() == 1) {
            if (mc.currentScreen == null) {
                for (Module module : modules) {
                    if (module.getKey() == e.getKey()) {
                        if (module.getBindType() == BindType.Toggle) {
                            module.toggle();
                        }

                        //fix
//                        if (module.getBindType() == BindType.Hold && module.getType() == Type.On) {
//                            while (e.getAction() == 1){
//                                module.onEnable();
//                            }
//                        }
//
//                        else {
//                            while (e.getAction() == 1){
//                                module.onDisable();
//                            }
//                        }
                    }
                }
            }
        }
    }
}