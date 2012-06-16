package org.openmrs.module.openhmis.registration.web.controller;

import java.util.HashSet;
import java.util.Set;

import org.openmrs.Patient;
import org.openmrs.PersonName;
import org.openmrs.api.PatientService;
import org.openmrs.api.context.Context;
import org.springframework.web.bind.annotation.RequestParam;

//@Controller
//@RequestMapping(value="**/findPatient.htm")
public class PatientFormController {
	private static final int PATIENT_ID = 12;

	//@RequestMapping(value= ModuleWebConstants.MODULE_BASE_URL + "findPatientForm", method=RequestMethod.GET)
	public void show() {
		
	}
	
	//@RequestMapping(value= ModuleWebConstants.MODULE_BASE_URL + "findPatientForm", method=RequestMethod.POST)
	public void submit(@RequestParam("addName") String addName) {
		
		System.out.println("Patient's name is: " + addName);
		
		Patient patient = new Patient(PATIENT_ID);
		PersonName testPersonName = new PersonName("Hans", "W", "Urst");
		Set<PersonName> names = new HashSet<PersonName>(1);
		names.add(testPersonName);
		patient.setNames(names);
		patient.setGender("male");
		
		PatientService patientService = Context.getPatientService();
		patientService.savePatient(patient);
		
		
	}
}
