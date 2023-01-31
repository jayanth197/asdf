package com.partner.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.partner.entity.Specification;

@Repository
public interface SpecificationRepository extends JpaRepository<Specification, Integer>{

	
	Optional<List<Specification>> findByPrimaryPartnerAndSecondaryPartnerAndModule(String primaryPartner,String secondaryPartner,String module);

}
