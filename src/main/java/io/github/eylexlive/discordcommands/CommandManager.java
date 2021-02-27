package io.github.eylexlive.discordcommands;

import net.dv8tion.jda.api.JDA;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

public final class CommandManager {

    private static CommandManager INSTANCE;

    private final Set<DiscordCommandExecutor> commands = new HashSet<>();

    public CommandManager(@NotNull JDA jda) {
        if (INSTANCE == null) {
            INSTANCE = this;
        }

        if (!jda.getRegisteredListeners().contains(new CommandMessageListener())) {
            jda.addEventListener(new CommandMessageListener());
        }
    }

    public CommandManager() {
        if (INSTANCE == null) {
            INSTANCE = this;
        }
    }

    public void registerCommand(@NotNull DiscordCommandExecutor executor) {
        if (commands.contains(executor)) {
            throw new IllegalStateException(
                    "This command already registered!"
            );
        }
        commands.add(executor);
    }

    @NotNull
    public Set<DiscordCommandExecutor> getCommands() {
        return commands;
    }

    @NotNull
    public static CommandManager getInstance() {
        return INSTANCE;
    }
}
