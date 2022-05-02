package cof.survivor.commands;

import cof.survivor.Survivor;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.json.JSONObject;

import java.util.HashMap;

public class SurvivorCommand extends JavaPlugin {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("survivor")) {
            if (args.length >= 1) {
                String gameName;
                switch (args[0]) {
                    case "creategame":
                        gameName = args[1];
                        if (Survivor.gameData.isNull(gameName)) {
                            Survivor.gameData.put(gameName, new JSONObject());
                            sender.sendMessage(ChatColor.GREEN + "Successfully Created Game!");
                        } else {
                            sender.sendMessage(ChatColor.RED + "Game name already exists!");
                        }
                        break;
                    case "removegame":
                        gameName = args[1];
                        if (Survivor.gameData.isNull(gameName)) {
                            sender.sendMessage(ChatColor.RED + "Game doesn't exist!");
                        } else {
                            Survivor.gameData.remove(gameName);
                            sender.sendMessage(ChatColor.GREEN + "Successfully Removed Game!");
                        }
                        break;
                }

                return true;
            }

            return false;
        }

        return false;
    }
}
