package com.example.backend.controller;

import com.example.backend.dto.DepartmentDto;
import com.example.backend.entity.Department;
import com.example.backend.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<DepartmentDto> createDepartment(@RequestBody DepartmentDto departmentDto) {
        DepartmentDto createdDepartment = departmentService.createDepartment(departmentDto);
        return new ResponseEntity<>(createdDepartment, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<DepartmentDto> getDepartmentById(@PathVariable Long id) {
        DepartmentDto foundDepartment = departmentService.getDepartmentById(id);
        return ResponseEntity.ok(foundDepartment);
    }

    @GetMapping
    public ResponseEntity<DepartmentDto> getAllDepartments() {
        List<DepartmentDto> departments = departmentService.getAllDepartments();
        return ResponseEntity.ok((DepartmentDto) departments);
    }

    @PutMapping("{id}")
    public ResponseEntity<DepartmentDto> getDepartmentById(@PathVariable Long id, @RequestBody DepartmentDto departmentDto) {
        DepartmentDto foundDepartment = departmentService.updateDepartment(id, departmentDto);
        return ResponseEntity.ok(foundDepartment);
    }
}
