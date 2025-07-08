package com.example.backend.mapper;

import com.example.backend.dto.DepartmentDTO;
import com.example.backend.entity.Department;

public class DepartmentMapper {
    public static DepartmentDTO mapToDepartmentDTO(Department department) {
        return  new DepartmentDTO(
                department.getId(),
                department.getDepratmentName(),
                department.getDepratmentDescription()
        );
    }

    public static Department mapToDepartment(DepartmentDTO departmentDTO) {
        return new Department(
                departmentDTO.getId(),
                departmentDTO.getDepartmentName(),
                departmentDTO.getDepartmentDescription()
        );
    }
}
