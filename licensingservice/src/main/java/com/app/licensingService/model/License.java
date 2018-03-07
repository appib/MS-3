package com.app.licensingService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class License {
	@Id
	@Column(nullable = false)
	private String licenseId;

	@Column(nullable = false)
	private String organizationId;

	@Column(nullable = false)
	private String productName;

	@Column(nullable = false)
	private String licenseType;

	@Column(nullable = false)
	private Integer licenseMax;

	@Column(nullable = false)
	private Integer licenseAllocated;

	@Column(name = "comment")
	private String comment;

	public Integer getLicenseMax() {
		return licenseMax;
	}

	public void setLicenseMax(Integer licenseMax) {
		this.licenseMax = licenseMax;
	}

	public Integer getLicenseAllocated() {
		return licenseAllocated;
	}

	public void setLicenseAllocated(Integer licenseAllocated) {
		this.licenseAllocated = licenseAllocated;
	}

	public String getLicenseId() {
		return licenseId;
	}

	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
