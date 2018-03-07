package com.app.organizationService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.organizationService.model.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, String> {

}
