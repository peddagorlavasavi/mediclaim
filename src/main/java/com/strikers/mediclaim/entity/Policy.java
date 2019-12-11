package com.strikers.mediclaim.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "policy")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer policyId;
	private String policyNumber;
	private String policyName;
	private Double amount;
	
	@OneToOne
	@JoinColumn(name = "userId")
	private User userId;

}
