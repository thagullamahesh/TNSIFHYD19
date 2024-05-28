package com.si.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.demo.entity.Certificate;
import com.si.demo.repository.CertificateRepository;

@Service
public class CertificateServiceImpl implements CertificateService {
	 @Autowired
	    private CertificateRepository certificateRepository;
	
	
	
	    @Override
	    public Certificate saveCertificate(Certificate certificate) {
	        return certificateRepository.save(certificate);
	    }

	    @Override
	    public List<Certificate> fetchCertificateList() {
	        return certificateRepository.findAll();
	    }

	   @Override
	   public Certificate fetchCertificateById(Long certificateId) {
		   return certificateRepository.findById(certificateId).get();
	   }
		
	   @Override
	   public void deleteCertificateById(Long certificateId) {
	       certificateRepository.deleteById(certificateId);
	   }


	   @Override
	   public Certificate updateCertificate(Long certificateId, Certificate certificate) {
	      Certificate database = certificateRepository.findById(certificateId).get();

	       if(Objects.nonNull(certificate.getCrtyear()) &&
	       !"".equalsIgnoreCase(certificate.getCrtyear())) {
	           database.setCrtyear(certificate.getCrtyear());
	       }

	       if(Objects.nonNull(certificate.getCrtcollege()) &&
	               !"".equalsIgnoreCase(certificate.getCrtcollege())) {
	          database.setCrtcollege(certificate.getCrtcollege());
	       }

	      

	       return certificateRepository.save(database);
	   }


}


