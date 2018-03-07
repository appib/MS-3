package com.app.licensingService.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.licensingService.model.License;

public interface LicenseRepository extends JpaRepository<License, String> {

	public License findByOrganizationIdAndLicenseId(String organizationId, String licenseId);

	public List<License> findByOrganizationId(String organizationId);

}
