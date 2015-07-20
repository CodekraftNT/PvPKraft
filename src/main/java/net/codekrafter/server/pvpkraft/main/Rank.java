/*
 * Copyright 2015 codekrafter
 */

package net.codekrafter.server.pvpkraft.main;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.bukkit.Bukkit;

public class Rank
{

	/**
	 * @param getcommands
	 * @param losecommands
	 * @param name
	 */
	public Rank(Set<String> getcommands, Set<String> losecommands, String name,
			BigDecimal price)
	{
		this.setGetCommands(getcommands);
		this.setLoseCommands(losecommands);
		this.setName(name);
		this.setPrice(price);
	}

	private String name;
	private BigDecimal price;

	private Set<String> getcommands = new HashSet<String>();

	public Set<String> getGetCommands()
	{
		return getcommands;
	}

	/**
	 * @param getcommands
	 */
	public void setGetCommands(Set<String> commands)
	{
		this.getcommands = commands;
	}

	public void runGetCommands()
	{
		for (String command : getcommands)
		{
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);
		}
	}

	private Set<String> losecommands = new HashSet<String>();

	public Set<String> getLoseCommands()
	{
		return losecommands;
	}

	/**
	 * @param losecommands
	 */
	public void setLoseCommands(Set<String> commands)
	{
		this.losecommands = commands;
	}

	public void runLoseCommands()
	{
		for (String command : losecommands)
		{
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);
		}
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public BigDecimal getPrice()
	{
		return price;
	}

	public void setPrice(BigDecimal price)
	{
		this.price = price;
	}
}
