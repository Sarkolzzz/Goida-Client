package cc.goida.features.cmd.impl;

import cc.goida.features.cmd.Command;
import cc.goida.features.cmd.CommandInfo;
import cc.goida.features.cmd.Commands;

@CommandInfo(name = "help", description = "Показывает список всех команд.", args = 0)
public class HelpCommand extends Command {
    Commands commands = new Commands();

    @Override
    public void execute() {
        super.execute();
        print("Список всех команд:\n");
        for (Command command : commands.getCommands()) {
            print(command.getName() + "|" + command.getDesc());
        }
    }
}