package com.arcaeic.osrs.BarracudaTrialHelmLock.module;

import com.arcaeic.osrs.BarracudaTrialHelmLock.BarracudaTrialHelmLockConfig;
import net.runelite.client.events.ConfigChanged;

public interface PluginLifecycleComponent
{
	@SuppressWarnings("unused")
	default boolean isEnabled(BarracudaTrialHelmLockConfig config)
	{
		return true;
	}

	default void startUp()
	{
	}

	default void shutDown()
	{
	}

	default void onConfigChanged(ConfigChanged e)
	{
	}

}
