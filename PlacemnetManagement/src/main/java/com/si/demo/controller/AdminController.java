package com.si.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.si.demo.entity.Admin;
import com.si.demo.service.AdminService;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
    
    @PostMapping("/admin")
    public Admin saveAdmin(@RequestBody Admin admin) {
       
        return adminService.saveAdmin(admin);
    
}   @GetMapping("/admin/{id}")
public Admin fetchAdmintById(@PathVariable("id") Long adminId)
{
return adminService.fetchAdminById(adminId);
}

@DeleteMapping("/admin/{id}")
public String deleteAdminById(@PathVariable("id") Long adminId) {
adminService.deleteAdminById(adminId);
return "Admin deleted Successfully!!";
}

@PutMapping("/admin/{id}")
public Admin updateAdmin(@PathVariable("id") Long adminId,
                           @RequestBody Admin admin) {
return adminService.updateAdmin(adminId,admin);
}
}

