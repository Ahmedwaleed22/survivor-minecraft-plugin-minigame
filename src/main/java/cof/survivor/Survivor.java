package cof.survivor;

import cof.JSONData.Load;
import cof.JSONData.Save;
import cof.Listeners.PlayerJoin;
import cof.Listeners.PlayerLeave;
import org.bukkit.plugin.java.JavaPlugin;
import org.json.JSONObject;

import java.io.IOException;

public final class Survivor extends JavaPlugin {

    public static JSONObject gameData = new JSONObject();

    @Override
    public void onEnable() {
        loadListeners();
        try {
            Load.loadJSONData();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onDisable() {
        try {
            Save.saveJSONData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadListeners() {
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeave(), this);

    }



}
