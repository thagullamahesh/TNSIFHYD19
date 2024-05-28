package com.si.demo.service;

import java.util.List;

import com.si.demo.entity.Certificate;

public interface CertificateService {
	
		public Certificate saveCertificate(Certificate certificate);

		public List<Certificate> fetchCertificateList();

		public Certificate fetchCertificateById(Long certificateId);

		public void deleteCertificateById(Long certificateId);

		public Certificate updateCertificate(Long certificateId, Certificate certificate);

}
