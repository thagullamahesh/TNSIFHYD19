package com.si.demo.service;

import java.util.List;

import com.si.demo.entity.Admin;

public interface AdminService  {
	public Admin saveAdmin(Admin admin);

	public List<Admin> fetchAdminList();

	public Admin fetchAdminById(Long adminId);

	public void deleteAdminById(Long adminId);

	public Admin updateAdmin(Long adminId, Admin admin);
}
