package com.strikers.mediclaim.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "policy_claim")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PolicyClaim {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer policyClaimId;
	private String name;
	private String referenceNumber;
	private String policyNumber;
	private String diagnosis;
	private Double claimAmount;
	private LocalDate admissionDate;
	private LocalDate dischargeDate;
	private String dischargeSummary;
	private String natureOfAilment;
	private String claimStatus;
	private LocalDate createdDate;

	@OneToOne
	@JoinColumn(name = "hospitalId")
	private Hospital hospitalId;
	private String hospitalName;

	
	@Transient
	private String remarks;

}
