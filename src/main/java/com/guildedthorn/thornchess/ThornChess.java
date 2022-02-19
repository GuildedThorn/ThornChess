package com.guildedthorn.thornchess;

import com.google.gson.Gson;
import com.guildedthorn.thornchess.utils.Config;
import com.sun.tools.javac.util.Constants;
import kingrainbow44.crafttools.plugin.ExtendedPlugin;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import tech.xigam.elixirapi.ElixirAPI;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

final public class ThornChess extends ExtendedPlugin {
    private static ThornChess instance;
    
    private BossBar bossBar;
    private Config config;
    private ElixirAPI elixir;
    private 


    @Override
    protected void init() {
        instance = this;
        
        try {
            File file = new File(getDataFolder(), "config.json");
            if (!file.exists()) {
                if (!file.createNewFile()) getLogger().severe("Unable to create config file.");
            }
            this.config = new Gson().fromJson(new FileReader(file), Config.class);
        } catch (IOException ignored) {}
        
        this.elixir = ElixirAPI.create(this.config.elixir.key);
        ElixirAPI.ENDPOINT_URL = this.config.elixir.endpoint;
    }

    @Override
    protected void enable() {
        this.bossBar = this.getServer().createBossBar("Thorn Chess", BarColor.BLUE, BarStyle.SOLID);
        if (!this.config.bot.token.isEmpty()) {
            this
        }
    }

    protected String getCommandPath() {
        return "com.guildedthorn.thornchess.commands";
    }

    protected String getListenerPath() {
        return "com.guildedthorn.thornchess.listeners";
    }
}
