package com.AjarghKreation.Controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/business-owner")
public class BusinessOwnerController {

    @GetMapping("/dashboard")
    @PreAuthorize("hasAuthority('BUSINESS_OWNER')")
    public String businessOwnerDashboard() {
        return "Welcome to the Business Owner Dashboard";
    }
}
