package org.openmrs.module.openhmis.registration.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Patient;
import org.openmrs.module.openhmis.registration.WebConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PatientCreationController {
	protected final Log log = LogFactory.getLog(getClass());

	@RequestMapping(value= WebConstants.PAGE_PATIENT_CREATE, method = RequestMethod.POST)
	public String processStepOne() {
		// Create a new patient object from parameters
		
		// Store newly created patient object with session
		
		// Go to patient creation page
		return WebConstants.PAGE_PATIENT_CREATE;
	}
	
	@RequestMapping(value=WebConstants.PAGE_PATIENT_CREATE, method = RequestMethod.POST)
	public String processCreatePatient(@RequestParam Patient patient) {
		// Validate patient data

		// Perform full search

		// Go to confirmation page and display search results
		return WebConstants.PAGE_PATIENT_CREATE_CONFIRM;
	}

	@RequestMapping(value=WebConstants.PAGE_PATIENT_CREATE_CONFIRM, method = RequestMethod.POST)
	public String processCreatePatientConfirm(@RequestParam Patient patient) {
		// Validate patient data

		// Add patient

		// Go to patient registration page
		return WebConstants.PAGE_PATIENT_REGISTER;
	}
}
