package dev.potato.mappictureexample;

import dev.potato.mappictureexample.commands.MapCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class MapPictureExample extends JavaPlugin {
    @Override
    public void onEnable() {
        // Commands
        registerCommands();
    }

    private void registerCommands() {
        getCommand("map").setExecutor(new MapCommand());
    }
}