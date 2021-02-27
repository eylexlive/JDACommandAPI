package io.github.eylexlive.discordcommands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.jetbrains.annotations.NotNull;

public interface DiscordCommandExecutor {

    void execute(@NotNull MessageReceivedEvent event, @NotNull String[] args);
}
