package com.BadWorld2;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class World2HiderPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(World2HiderPlugin.class);
		RuneLite.main(args);
	}
}