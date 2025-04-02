package cc.goida.features.cmd;

import cc.goida.utils.client.ClientUtil;
import lombok.Getter;

@Getter
public class Command extends ClientUtil {
    private String name;
    private String desc;
    private int args;

    public Command(String name, String desc, int args) {
        this.name = name;
        this.desc = desc;
        this.args = args;
    }

    public Command(){
        this.name = getClass().getAnnotation(CommandInfo.class).name();
        this.desc = getClass().getAnnotation(CommandInfo.class).description();
        this.args = getClass().getAnnotation(CommandInfo.class).args();
    }

    public void execute(){

    }
}