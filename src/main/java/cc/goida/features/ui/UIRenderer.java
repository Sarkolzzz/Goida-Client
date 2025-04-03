package cc.goida.features.ui;

import cc.goida.Goida;
import cc.goida.utils.client.Imports;

public class UIRenderer implements Imports {
    public void render(){
        if (mc.currentScreen == null){
            Goida.getInstance().eventBus.register(this);
        }
    }
}