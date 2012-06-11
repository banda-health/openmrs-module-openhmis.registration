package org.openmrs.module.openhmis.registration;

public final class WebConstants {
	
	private WebConstants() {}

	public static final String MODULE_BASE_URL = "module/openhmis/registration/";
	
	public static final String PAGE_PATIENT_FIND_OR_CREATE = MODULE_BASE_URL + "patientFindOrCreate";
	public static final String PAGE_PATIENT_SEARCH = MODULE_BASE_URL + "patientSearch";
	public static final String PAGE_PATIENT_CREATE = MODULE_BASE_URL + "patientCreate";
	public static final String PAGE_PATIENT_CREATE_CONFIRM = MODULE_BASE_URL + "patientCreateConfirm";
	public static final String PAGE_PATIENT_REGISTER = MODULE_BASE_URL + "patientRegister";
	
	public static final String AJAX_PATIENT_SEARCH = MODULE_BASE_URL + "ajaxPatientSearch";
	public static final String AJAX_PATIENT_CREATION_SEARCH = MODULE_BASE_URL + "ajaxPatientCreationSearch";
}

