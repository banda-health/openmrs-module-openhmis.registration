package org.openmrs.module.openhmis.registration.web.controller;

import org.openmrs.module.openhmis.registration.ModuleWebConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ConfigurationController {
	@RequestMapping(value= ModuleWebConstants.PAGE_CONFIGURE_MODULE, method=RequestMethod.GET)
	public void renderModuleConfiguration() {

	}

	@RequestMapping(value= ModuleWebConstants.PAGE_CONFIGURE_PATIENT_SEARCH, method=RequestMethod.GET)
	public void renderSearchConfiguration() {

	}
}
