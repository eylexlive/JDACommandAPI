package io.github.eylexlie.commandtest;

import io.github.eylexlie.commandtest.commands.ExampleCommand;
import io.github.eylexlive.discordcommands.CommandManager;

public final class BotMain {

    public static void main(String[] args) {
        final Bot bot = new Bot(
                ""
        );
        bot.login();

        final CommandManager commandManager = new CommandManager(bot.getJda());

        commandManager.registerCommand(new ExampleCommand());

        System.out.println("Command registered!");
    }
}
