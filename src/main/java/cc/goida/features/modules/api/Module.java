package cc.goida.features.modules.api;

import cc.goida.Goida;
import cc.goida.utils.client.ClientUtil;
import cc.goida.utils.client.Imports;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Module extends ClientUtil implements Imports {
    private String name;
    private String description;
    private Category category;
    @Setter
    private int key;
    private boolean state = false;
    @Setter
    private BindType bindType;
    @Setter
    private Type type;

    public Module(String name, String description, Category category, int key) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.key = key;
    }

    public Module(){
        this.name = getClass().getAnnotation(ModuleInfo.class).name();
        this.description = getClass().getAnnotation(ModuleInfo.class).desc();
        this.category = getClass().getAnnotation(ModuleInfo.class).category();
        this.key = getClass().getAnnotation(ModuleInfo.class).key();
        this.bindType = getClass().getAnnotation(ModuleInfo.class).bindType();
        this.type = getClass().getAnnotation(ModuleInfo.class).type();
    }

    public void toggle(){
        state = !state;

        if (state){
            onEnable();
        }

        if (!state){
            onDisable();
        }
    }

    public void onEnable(){
        print("Модуль " + name + " включён.");
        Goida.getInstance().eventBus.register(this);
    }

    public void onDisable(){
        print("Модуль " + name + " выключен.");
        Goida.getInstance().eventBus.unregister(this);
    }
}