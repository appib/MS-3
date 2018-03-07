package com.app.licensingService.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.licensingService.dao.LicenseRepository;
import com.app.licensingService.model.License;

@Service
public class LicenseService {

	@Autowired
	private LicenseRepository licenseRepository;

	public License getLicense(String organizationId, String licenseId) {
		return licenseRepository.findByOrganizationIdAndLicenseId(organizationId, licenseId);
	}

	public List<License> getLicensesByOrg(String organizationId) {
		return licenseRepository.findByOrganizationId(organizationId);
	}

	public License saveLicense(License license) {
		license.setLicenseId(UUID.randomUUID().toString());
		return licenseRepository.save(license);
	}

	public License updateLicense(String licenseId, License license) {
		return licenseRepository.save(license);
	}

	public void deleteLicense(License license) {
		licenseRepository.deleteById(license.getLicenseId());
	}
}
