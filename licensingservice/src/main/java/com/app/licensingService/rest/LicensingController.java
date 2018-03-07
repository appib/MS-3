package com.app.licensingService.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.licensingService.model.License;
import com.app.licensingService.service.LicenseService;

@RestController
@RequestMapping("/v1/licenses")
public class LicensingController {

	@Autowired
	private LicenseService licenseService;

	@GetMapping("/{organizationId}")//given an org id, give me all licenses for that org
	public List<License> getLicenses(@PathVariable("organizationId") String organizationId) {
		return licenseService.getLicensesByOrg(organizationId);
	}

	@GetMapping("/{organizationId}/{licenseId}")//given an org id and license id, give me the license
	public License getLicenses(@PathVariable("organizationId") String organizationId,
			@PathVariable("licenseId") String licenseId) {
		return licenseService.getLicense(organizationId, licenseId);
	}

	@PutMapping("/{licenseId}")//update license
	public License updateLicenses(@PathVariable("licenseId") String licenseId, @RequestBody License license) {
		return licenseService.updateLicense(licenseId, license);
	}

	@PostMapping//create license
	@ResponseStatus(HttpStatus.CREATED)
	public License saveLicenses(@RequestBody License license) {
		return licenseService.saveLicense(license);
	}

	@DeleteMapping("/{licenseId}")//delete license
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public String deleteLicenses(@PathVariable("licenseId") String licenseId) {
		return String.format("This is the Delete");
	}
}
