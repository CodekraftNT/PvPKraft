/*
 * Copyright 2015 codekrafter
 */

package net.codekrafter.server.pvpkraft.main.listeners;

import java.math.BigDecimal;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.PlayerDeathEvent;

import com.earth2me.essentials.api.Economy;
import com.earth2me.essentials.api.NoLoanPermittedException;
import com.earth2me.essentials.api.UserDoesNotExistException;

public class PlayerListener implements Listener
{

	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e)
	{
		e.setDeathMessage(null);
		if (e.getEntity() instanceof Player)
		{
			Player p = e.getEntity();
			p = p.getKiller();
			try
			{
				Economy.add(p.getName(), new BigDecimal(5));
				p.sendMessage(ChatColor.GREEN + "You Killed "
						+ e.getEntity().getName() + "! Your Balance Is Now: "
						+ Economy.getMoneyExact(p.getName()));
			}
			catch (NoLoanPermittedException e1)
			{
				e1.printStackTrace();
			}
			catch (ArithmeticException e1)
			{
				e1.printStackTrace();
			}
			catch (UserDoesNotExistException e1)
			{
				e1.printStackTrace();
			}
		}
	}

	@EventHandler
	public void onEntityDamageEvent(EntityDamageEvent e)
	{
		if (!(e.getEntity() instanceof Player))
		{
			return;
		}
		
		if (e.getCause() == DamageCause.FALL)
		{
			e.setCancelled(true);
		}
	}

}