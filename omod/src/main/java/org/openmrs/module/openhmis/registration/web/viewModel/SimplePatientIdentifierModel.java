package org.openmrs.module.openhmis.registration.web.viewModel;

import org.openmrs.PatientIdentifier;

public class SimplePatientIdentifierModel {
	private String identifier;
	private String typeDescription;

	public SimplePatientIdentifierModel(PatientIdentifier patientId) {
		identifier = patientId.getIdentifier();
		typeDescription = patientId.getIdentifierType().getFormatDescription();
	}

	public String getIdentifier() {
		return identifier;
	}

	public String getTypeDescription() {
		return typeDescription;
	}
}
