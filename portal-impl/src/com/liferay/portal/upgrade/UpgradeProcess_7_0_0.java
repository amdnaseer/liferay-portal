/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.upgrade;

import com.liferay.portal.kernel.upgrade.UpgradeProcess;
import com.liferay.portal.kernel.util.ReleaseInfo;
import com.liferay.portal.upgrade.v7_0_0.*;

/**
 * @author Julio Camarero
 */
public class UpgradeProcess_7_0_0 extends UpgradeProcess {

	@Override
	public int getThreshold() {
		return ReleaseInfo.RELEASE_7_0_0_BUILD_NUMBER;
	}

	@Override
	protected void doUpgrade() throws Exception {
		upgrade(UpgradeSchema.class);

		upgrade(UpgradeKernelPackage.class);

		upgrade(UpgradeAddress.class);
		upgrade(UpgradeAsset.class);
		upgrade(UpgradeAssetTagsResourcePermission.class);
		upgrade(UpgradeCompanyId.class);
		upgrade(UpgradeDocumentLibrary.class);
		upgrade(UpgradeDocumentLibraryPortletId.class);
		upgrade(UpgradeDocumentLibraryPreferences.class);
		upgrade(UpgradeEmailAddress.class);
		upgrade(UpgradeEmailNotificationPreferences.class);
		upgrade(UpgradeExpando.class);
		upgrade(UpgradeGroup.class);
		upgrade(UpgradeLastPublishDate.class);
		upgrade(UpgradeListType.class);
		upgrade(UpgradeLookAndFeel.class);
		upgrade(UpgradeMembershipRequest.class);
		upgrade(UpgradeMessageBoards.class);
		upgrade(UpgradeModules.class);
		upgrade(UpgradeMySQL.class);
		upgrade(UpgradeOrganization.class);
		upgrade(UpgradeOrgLabor.class);
		upgrade(UpgradePhone.class);
		upgrade(UpgradePortalPreferences.class);
		upgrade(UpgradePortletDisplayTemplatePreferences.class);
		upgrade(UpgradePortletId.class);
		upgrade(UpgradePostgreSQL.class);
		upgrade(UpgradeRatings.class);
		upgrade(UpgradeRelease.class);
		upgrade(UpgradeRepository.class);
		upgrade(UpgradeRepositoryEntry.class);
		upgrade(UpgradeResourcePermission.class);
		upgrade(UpgradeSocial.class);
		upgrade(UpgradeSubscription.class);
		upgrade(UpgradeWebsite.class);

		upgrade(UpgradeMobileDeviceRules.class);

		upgrade(UpgradeSharding.class);

		clearIndexesCache();
	}

}