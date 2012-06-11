package org.openmrs.module.openhmis.registration.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Person;
import org.openmrs.module.openhmis.registration.WebConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PatientSearchController {
	protected final Log log = LogFactory.getLog(getClass());

	@RequestMapping(value="**/findPatient.htm", method = RequestMethod.GET)
	public String renderFindOrCreate() {
		// Render the find or create patient view
		return WebConstants.PAGE_PATIENT_FIND_OR_CREATE;
	}

	@RequestMapping(value=WebConstants.AJAX_PATIENT_SEARCH, method = RequestMethod.POST)
	public String respondSimpleSearch(@RequestParam String search) {
		// TODO: May want to replace with openmrs-like DirectWebRemoting stuff

		// Perform search and get results
		List<Person> results;

		// Convert results into json string
		String json = "";

		// Return json to the client to be rendered
		return json;
	}

	@RequestMapping(value=WebConstants.PAGE_PATIENT_SEARCH, method = RequestMethod.POST)
	public String respondAdvancedSearch() {
		// TODO: May want to replace with openmrs-like DirectWebRemoting stuff
		
		return null;
	}

	@RequestMapping(value=WebConstants.AJAX_PATIENT_CREATION_SEARCH, method = RequestMethod.POST)
	public String respondCreationSearch() {
		// TODO: May want to replace with openmrs-like DirectWebRemoting stuff

		return null;
	}
}

