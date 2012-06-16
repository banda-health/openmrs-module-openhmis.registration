package org.openmrs.module.openhmis.registration.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Patient;
import org.openmrs.api.PatientService;
import org.openmrs.api.context.Context;
import org.openmrs.module.openhmis.registration.ModuleWebConstants;
import org.openmrs.module.openhmis.registration.web.viewModel.SimplePatientModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PatientSearchController {
	protected final Log log = LogFactory.getLog(getClass());

	@RequestMapping(value="**/findPatient.htm", method = RequestMethod.GET)
	public String renderFindPatient() {
		// Render the find or create patient view
		return ModuleWebConstants.PAGE_PATIENT_FIND_OR_CREATE;
	}

	@RequestMapping(value = ModuleWebConstants.PAGE_PATIENT_FIND_OR_CREATE, method = RequestMethod.GET)
	public void renderFindOrCreate() {
		// Just render page... not sure why this is really needed.
	}

	@RequestMapping(value= ModuleWebConstants.AJAX_PATIENT_SEARCH, method = RequestMethod.GET)
	public @ResponseBody List<SimplePatientModel> respondSimpleSearch(@RequestParam String search) {
		// TODO: May want to replace with openmrs-like DirectWebRemoting stuff

		// Find the first ten patients that match the search
		PatientService service = Context.getPatientService();
		List<Patient> searchResults = service.getPatients(search, 0, 10);

		// The results will get converted to json and sent to the client
		return createPatientViewModel(searchResults);
	}

	@RequestMapping(value= ModuleWebConstants.PAGE_PATIENT_SEARCH, method = RequestMethod.POST)
	public String respondAdvancedSearch() {

		return null;
	}

	@RequestMapping(value= ModuleWebConstants.AJAX_PATIENT_CREATION_SEARCH, method = RequestMethod.GET)
	public @ResponseBody List<SimplePatientModel> respondCreationSearch(Patient example) {
		PatientService service = Context.getPatientService();
		service.getPatientByExample(example);

		return null;
	}

	protected List<SimplePatientModel> createPatientViewModel(List<Patient> patients) {
		List<SimplePatientModel> results = new ArrayList<SimplePatientModel>(patients.size());

		for (Patient patient : patients) {
			results.add(new SimplePatientModel(patient));
		}

		return results;
	}
}

