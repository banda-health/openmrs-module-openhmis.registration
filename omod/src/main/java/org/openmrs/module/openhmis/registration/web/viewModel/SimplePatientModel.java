package org.openmrs.module.openhmis.registration.web.viewModel;

import org.openmrs.Patient;
import org.openmrs.PatientIdentifier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The basic information about a patient.
 */
public class SimplePatientModel {
	private String givenName;
	private String middleName;
	private String familyName;
	private List<SimplePatientIdentifierModel> identifiers;
	private String gender;
	private Date birthdate;

	public SimplePatientModel(Patient patient) {
		givenName = patient.getGivenName();
		middleName = patient.getMiddleName();
		familyName = patient.getFamilyName();
		gender = patient.getGender();
		birthdate = patient.getBirthdate();

		identifiers = new ArrayList<SimplePatientIdentifierModel>();
		for (PatientIdentifier patientId : patient.getIdentifiers()) {
			identifiers.add(new SimplePatientIdentifierModel(patientId));
		}
	}

	public String getGivenName() {
		return givenName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public List<SimplePatientIdentifierModel> getIdentifiers() {
		return identifiers;
	}

	public String getGender() {
		return gender;
	}

	public Date getBirthdate() {
		return birthdate;
	}
}
