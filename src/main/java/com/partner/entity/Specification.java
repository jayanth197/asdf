package com.partner.entity;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="specification")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Specification implements Serializable {

	private static final long serialVersionUID = -3884034954387888983L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;

	@Column(name="primary_partner")
	private String primaryPartner;

	@Column(name="secondary_partner")
	private String secondaryPartner;

	@Column(name="transaction_type")
	private String transactionType;

	@Column(name="url")
	private String url;
	
	@Column(name="module")
	private String module;

	@Column(name="created_date")
	private String createdDate;

	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="updated_date")
	private String updatedDate;
	
	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="status")
	private Integer status;


}



