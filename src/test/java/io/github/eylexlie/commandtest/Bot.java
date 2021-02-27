package io.github.eylexlie.commandtest;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.jetbrains.annotations.NotNull;

import javax.security.auth.login.LoginException;

public final class Bot {

    private final String token;

    private JDA jda;

    public Bot(@NotNull String token) {
        this.token = token;
    }

    public void login() {
        try {
            jda = new JDABuilder(AccountType.BOT)
                    .setToken(token)
                    .setAutoReconnect(true)
                    .build();

        } catch (LoginException e) {
            e.printStackTrace();
        }
    }

    public JDA getJda() {
        return jda;
    }
}
