package io.github.eylexlive.discordcommands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public final class CommandMessageListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        CommandManager.getInstance()
                .getCommands()
                .forEach(command ->
                        command.execute(
                                event,
                                event.getMessage().getContentRaw().split(" ")
                        )
                );
    }
}
