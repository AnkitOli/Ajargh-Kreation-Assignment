package com.AjarghKreation.Controller;

import com.AjarghKreation.model.Admin;
import com.AjarghKreation.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/entities")
    public ResponseEntity<Admin> createEntity(@RequestBody Entity entity) {
        Admin createdEntity = adminService.createEntity(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEntity);
    }

    @GetMapping("/entities")
    public ResponseEntity<List<Admin>> getAllEntities() {
        List<Admin> entities = adminService.getAllEntities();
        return ResponseEntity.ok(entities);
    }

    @GetMapping("/entities/{id}")
    public ResponseEntity<Admin> getEntityById(@PathVariable Long id) throws Throwable {
        Admin entity = adminService.getEntityById(id);
        return ResponseEntity.ok(entity);
    }

    @PutMapping("/entities/{id}")
    public ResponseEntity<Admin> updateEntity(@PathVariable Long id, @RequestBody Entity updatedEntity) {
        Admin entity = adminService.updateEntity(id, updatedEntity);
        return ResponseEntity.ok(entity);
    }

    @DeleteMapping("/entities/{id}")
    public ResponseEntity<Void> deleteEntity(@PathVariable Long id) {
        adminService.deleteEntity(id);
        return ResponseEntity.noContent().build();
    }
}

