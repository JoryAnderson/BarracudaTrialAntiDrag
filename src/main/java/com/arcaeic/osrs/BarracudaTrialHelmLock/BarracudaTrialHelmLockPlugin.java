package com.arcaeic.osrs.BarracudaTrialHelmLock;


import com.arcaeic.osrs.BarracudaTrialHelmLock.module.ComponentManager;
import com.arcaeic.osrs.BarracudaTrialHelmLock.module.BarracudaTrialModule;

import com.google.inject.Binder;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "Barracuda Trial Helm Lock"
)
public class BarracudaTrialHelmLockPlugin extends Plugin
{
	@Inject
	private ComponentManager componentManager;

	@Override
	public void configure(Binder binder)
	{
		binder.install(new BarracudaTrialModule());
	}

	@Override
	protected void startUp()
	{
		log.info("Barracuda Trial Helm Lock Started!");
		componentManager.onPluginStart();
	}

	@Override
	protected void shutDown()
	{
		log.info("Barracuda Trial Helm Lock Stopped!");
		componentManager.onPluginStop();
	}
}
