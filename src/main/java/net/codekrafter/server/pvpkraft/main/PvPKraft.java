/*
 * Copyright 2015 codekrafter
 */

package net.codekrafter.server.pvpkraft.main;

import net.codekrafter.server.pvpkraft.main.listeners.PlayerListener;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class PvPKraft extends JavaPlugin
{

	@Override
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(new PlayerListener(),
				this);
	}

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String l,
			String[] args)
	{
		if (s instanceof Player)
		{}
		return false;
	}
}
