package com.si.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.si.demo.entity.Admin;
import com.si.demo.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
	 @Autowired
	    private AdminRepository adminRepository;
	
	
	
	    @Override
	    public Admin saveAdmin(Admin admin) {
	        return adminRepository.save(admin);
	    }

	    @Override
	    public List<Admin> fetchAdminList() {
	        return adminRepository.findAll();
	    }

	   @Override
	   public Admin fetchAdminById(Long adminId) {
		   return adminRepository.findById(adminId).get();
	   }
		
	   @Override
	   public void deleteAdminById(Long adminId) {
	       adminRepository.deleteById(adminId);
	   }


	   @Override
	   public Admin updateAdmin(Long adminId, Admin admin) {
	       Admin database = adminRepository.findById(adminId).get();

	       if(Objects.nonNull(admin.getAdminname()) &&
	       !"".equalsIgnoreCase(admin.getAdminname())) {
	           database.setAdminname(admin.getAdminname());
	       }

	       if(Objects.nonNull(admin.getAdminpassword()) &&
	               !"".equalsIgnoreCase(admin.getAdminpassword())) {
	          database.setAdminpassword(admin.getAdminpassword());
	       }

	      

	       return adminRepository.save(database);
	   }

  
}
