package com.si.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.si.demo.entity.Certificate;
import com.si.demo.service.CertificateService;

@RestController
public class CertificateController {
	  @Autowired
	    private CertificateService certificateService;
	    
	    @PostMapping("/admin")
	    public Certificate saveCertificate(@RequestBody Certificate certificate) {
	       
	        return certificateService.saveCertificate(certificate);
	    
	}   @GetMapping("/certificate/{id}")
	public Certificate fetchCertificateById(@PathVariable("id") Long certificateId)
	{
	return certificateService.fetchCertificateById(certificateId);
	}

	@DeleteMapping("/certificate/{id}")
	public String deleteCertificateById(@PathVariable("id") Long certificateId) {
	certificateService.deleteCertificateById(certificateId);
	return "Certificate deleted Successfully!!";
	}

	@PutMapping("/certificate/{id}")
	public Certificate updateCertificate(@PathVariable("id") Long certificateId,
	                           @RequestBody Certificate certificate) {
	return certificateService.updateCertificate(certificateId,certificate);
	}
}
