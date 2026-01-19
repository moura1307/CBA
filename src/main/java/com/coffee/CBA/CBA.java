package com.coffee.CBA;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class CBA extends JavaPlugin implements Listener {

    private DiverArmor diverArmor;

    @Override
    public void onEnable() {
        this.diverArmor = new DiverArmor(this);

        getServer().getPluginManager().registerEvents(diverArmor, this);

        getServer().getPluginManager().registerEvents(this, this);

        getLogger().info("CBA plugin enabled!");
    }
}