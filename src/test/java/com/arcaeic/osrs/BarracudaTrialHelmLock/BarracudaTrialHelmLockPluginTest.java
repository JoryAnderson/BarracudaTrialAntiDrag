package com.arcaeic.osrs.BarracudaTrialHelmLock;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class BarracudaTrialHelmLockPluginTest
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(BarracudaTrialHelmLockPlugin.class);
		RuneLite.main(args);
	}
}