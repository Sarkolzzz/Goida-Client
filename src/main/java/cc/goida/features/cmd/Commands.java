package cc.goida.features.cmd;

import cc.goida.Goida;
import cc.goida.events.impl.EventChat;
import cc.goida.features.cmd.impl.BindCommand;
import cc.goida.features.cmd.impl.HelpCommand;
import cc.goida.utils.client.ClientUtil;
import com.google.common.eventbus.Subscribe;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
public class Commands extends ClientUtil {
    @Getter
    @Setter
    public String prefix = ".";
    private final ArrayList<Command> commands = new ArrayList<>();

    private HelpCommand helpCommand;
    private BindCommand bindCommand;

    public void init() {
        registerAll(helpCommand = new HelpCommand(), bindCommand = new BindCommand());

        Goida.getInstance().eventBus.register(this);
    }

    private void registerAll(Command... commandss) {
        Arrays.sort(commandss, Comparator.comparing(Command::getName));

        Collections.addAll(commands, commandss);
    }

    @Subscribe
    public void onMessage(EventChat chat){
        if (chat.getMessage().startsWith(prefix)){
            for (Command command : commands) {
                String[] args = chat.getMessage().split(" ");
                String name = args[0].replaceFirst(".", "");

                if (command.getName().equals(name)){
                    command.execute();
                }

                if (!name.equals(command.getName())){
                    print("Неверная команда. Напишите .help для списка команд.");
                }
            }
        }
    }
}