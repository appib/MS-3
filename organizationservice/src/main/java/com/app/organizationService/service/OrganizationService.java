package com.app.organizationService.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.organizationService.dao.OrganizationRepository;
import com.app.organizationService.model.Organization;

@Service
public class OrganizationService {

	@Autowired
	private OrganizationRepository organizationRepository;

	public Organization getById(String organizationId) {
		Optional<Organization>optional = organizationRepository.findById(organizationId);
		return optional.get();
	}

	public Organization save(Organization org) {
		org.setId(UUID.randomUUID().toString());

		return organizationRepository.save(org);
	}

	public Organization update(String orgId, Organization org) {
		return organizationRepository.save(org);
	}

	public void delete(String orgId) {
		organizationRepository.deleteById(orgId);
	}
}
