package com.partner.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.partner.entity.Specification;
import com.partner.repository.SpecificationRepository;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping(value="/v1")
@Slf4j
public class SpecificationController {

	
	@Autowired
	SpecificationRepository specificationRepository;
	
	@GetMapping("/specification/{primaryPartner}/{secondaryPartner}/{module}")
	public ResponseEntity<List<Specification>> findByPrimaryPartnerAndSecondaryPartnerAndModule(@PathVariable("primaryPartner") String primaryPartner,@PathVariable("secondaryPartner") String secondaryPartner,@PathVariable("module") String module ) {
		List<Specification> specification=null;
		Optional<List<Specification>> optSpecification = specificationRepository.findByPrimaryPartnerAndSecondaryPartnerAndModule(primaryPartner,secondaryPartner,module);
		if(optSpecification.isPresent()) {
			specification = optSpecification.get();
		}
		return new ResponseEntity<>(specification,HttpStatus.OK);
	}
}

