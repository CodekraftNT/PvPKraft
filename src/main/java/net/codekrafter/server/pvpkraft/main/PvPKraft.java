
package net.codekrafter.server.pvpkraft.main;

import java.util.ArrayList;
import java.util.List;

import net.codekrafter.server.pvpkraft.main.listeners.PlayerListener;
import net.md_5.bungee.api.ChatColor;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.earth2me.essentials.api.Economy;
import com.earth2me.essentials.api.NoLoanPermittedException;
import com.earth2me.essentials.api.UserDoesNotExistException;

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
		{
		}
		return false;
	}
}
