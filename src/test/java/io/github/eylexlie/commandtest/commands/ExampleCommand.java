package io.github.eylexlie.commandtest.commands;

import io.github.eylexlive.discordcommands.DiscordCommandExecutor;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.jetbrains.annotations.NotNull;

public final class ExampleCommand implements DiscordCommandExecutor {

    @Override
    public void execute(@NotNull MessageReceivedEvent event, @NotNull String[] args) {
        if (args[0].equalsIgnoreCase("!ping")) {
            event.getChannel().sendMessage("Pong!").queue();
        }
    }
}
