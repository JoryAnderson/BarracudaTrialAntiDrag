package com.arcaeic.osrs.BarracudaTrialHelmLock.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.api.gameval.ObjectID;

@RequiredArgsConstructor
@Getter
public enum GaleCatcherFacility
{

	GALE_CATCHER_ACTIVATED(
		new int[]{
			ObjectID.SAILING_GALE_CATCHER_ACTIVATED,
		}
	),
	GALE_CATCHER_DEACTIVATED(
		new int[]{
			ObjectID.SAILING_GALE_CATCHER_DEACTIVATED,
		}
	);

	private final int[] gameObjectIds;

}