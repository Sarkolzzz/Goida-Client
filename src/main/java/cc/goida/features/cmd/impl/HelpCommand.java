package cc.goida.features.cmd.impl;

import cc.goida.features.cmd.Command;
import cc.goida.features.cmd.CommandInfo;

@CommandInfo(name = "help", description = "Показывает список всех команд.", args = 1)
public class HelpCommand extends Command {

    @Override
    public void execute() {
        super.execute();
        print("Список всех команд:\n" +
                ".help | Показывает список команд.\n" +
                ".bind | Биндит функцию на необходимую кнопку.");
    }
}
