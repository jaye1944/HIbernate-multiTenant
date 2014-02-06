package hib.impl;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;

public class MultiTenantIdentifierResolver implements
		CurrentTenantIdentifierResolver {

	public String resolveCurrentTenantIdentifier() {
		// TODO Auto-generated method stub
		String tenantCode = null;
		if(tenantCode == null) {
			tenantCode = "Master_H";
		}
		return tenantCode;
	}

	public boolean validateExistingCurrentSessions() {
		// TODO Auto-generated method stub
		return true;
	}

}
