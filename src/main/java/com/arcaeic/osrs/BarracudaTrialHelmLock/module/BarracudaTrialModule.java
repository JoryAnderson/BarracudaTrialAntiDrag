package com.arcaeic.osrs.BarracudaTrialHelmLock.module;

import com.arcaeic.osrs.BarracudaTrialHelmLock.BarracudaTrialHelmLockConfig;
import com.arcaeic.osrs.BarracudaTrialHelmLock.features.BarracudaTrialHelmLock;

import com.google.common.collect.ImmutableSet;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.config.ConfigManager;
import java.util.Set;
import javax.inject.Named;

@Slf4j
public class BarracudaTrialModule extends AbstractModule
{

	@Override
	protected void configure()
	{
		bind(ComponentManager.class);
	}

	@Provides
	@SuppressWarnings("unused")
	Set<PluginLifecycleComponent> lifecycleComponents(
		@Named("developerMode") boolean developerMode,
		BarracudaTrialHelmLock barracudaTrialHelmLock
	)
	{
		var builder = ImmutableSet.<PluginLifecycleComponent>builder()
			.add(barracudaTrialHelmLock);

		// features still in development
		//noinspection StatementWithEmptyBody
		if (developerMode)
		{
		}

		return builder.build();
	}

	@Provides
	@Singleton
	@SuppressWarnings("unused")
	BarracudaTrialHelmLockConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(BarracudaTrialHelmLockConfig.class);
	}

}
