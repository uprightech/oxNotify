/*
 * oxNotify is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2017, Gluu
 */

package org.gluu.oxnotify.model.conf;

import java.util.List;

import javax.enterprise.inject.Vetoed;

/**
 * @author Yuriy Movchan
 * @version September 15, 2017
 */
@Vetoed
public class AccessConfiguration {

	private List<ClientConfiguration> clientConfigurations;

	public List<ClientConfiguration> getClientConfigurations() {
		return clientConfigurations;
	}

	public void setClientConfigurations(List<ClientConfiguration> clientConfigurations) {
		this.clientConfigurations = clientConfigurations;
	}

}
