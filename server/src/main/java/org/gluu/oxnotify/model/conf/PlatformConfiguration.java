/*
 * oxNotify is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2017, Gluu
 */

package org.gluu.oxnotify.model.conf;

import javax.enterprise.inject.Vetoed;

import org.gluu.oxnotify.model.PushPlatform;

/**
 * @author Yuriy Movchan
 * @version September 15, 2017
 */
@Vetoed
public class PlatformConfiguration {

	private String platformId;
	private PushPlatform platform;
	private String platformArn;

	private String accessKeyId;
	private String secretAccessKey;

	private boolean enabled;

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public PushPlatform getPlatform() {
		return platform;
	}

	public void setPlatform(PushPlatform platform) {
		this.platform = platform;
	}

	public String getPlatformArn() {
		return platformArn;
	}

	public void setPlatformArn(String platformArn) {
		this.platformArn = platformArn;
	}

	public String getAccessKeyId() {
		return accessKeyId;
	}

	public void setAccessKeyId(String accessKeyId) {
		this.accessKeyId = accessKeyId;
	}

	public String getSecretAccessKey() {
		return secretAccessKey;
	}

	public void setSecretAccessKey(String secretAccessKey) {
		this.secretAccessKey = secretAccessKey;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
