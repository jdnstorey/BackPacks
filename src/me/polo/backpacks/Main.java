package me.polo.backpacks;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        getServer().getPluginManager().registerEvents(new BackPack(), this);
    }

    public void onDisable() {}

}
