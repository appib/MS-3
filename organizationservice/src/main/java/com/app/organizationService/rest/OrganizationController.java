package com.app.organizationService.rest;

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

import com.app.organizationService.model.Organization;
import com.app.organizationService.service.OrganizationService;

@RestController
@RequestMapping(value = "v1/organizations")
public class OrganizationController {

	@Autowired
	private OrganizationService organizationService;

	@GetMapping("/{organizationId}")
	public Organization getOrganization(@PathVariable("organizationId") String organizationId) {
		return organizationService.getById(organizationId);
	}

	@PutMapping("/{organizationId}")
	public Organization updateOrganization(@PathVariable("organizationId") String orgId, @RequestBody Organization org) {
		return organizationService.update(orgId, org);
	}

	@PostMapping("/{organizationId}")
	@ResponseStatus(HttpStatus.CREATED)
	public Organization saveOrganization(@RequestBody Organization org) {
		return organizationService.save(org);
	}

	@DeleteMapping("/{organizationId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteOrganization(@PathVariable("orgId") String orgId) {
		organizationService.delete(orgId);
	}
}
