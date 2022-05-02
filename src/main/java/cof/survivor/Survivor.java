package cof.survivor;

import cof.Listeners.PlayerJoin;
import cof.Listeners.PlayerLeave;
import org.bukkit.plugin.java.JavaPlugin;

public final class Survivor extends JavaPlugin {

    @Override
    public void onEnable() {
        loadListeners();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void loadListeners() {
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeave(), this);

    }

}
