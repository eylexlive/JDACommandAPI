# JDACommandAPI
 Example command
 ```java
 public final class ExampleCommand implements DiscordCommandExecutor {

    @Override
    public void execute(@NotNull MessageReceivedEvent event, @NotNull String[] args) {
        if (args[0].equalsIgnoreCase("!ping")) {
            event.getChannel().sendMessage("Pong!").queue();
        }
    }
}
 ```
 
Bot Main
```java
public final class BotMain {

    public static void main(String[] args) {
        final Bot bot = new Bot(
                " "
        );
        bot.login();

        final CommandManager commandManager = new CommandManager(bot.getJda());

        commandManager.registerCommand(new ExampleCommand());

        System.out.println("Command registered!");
    }
}
```
