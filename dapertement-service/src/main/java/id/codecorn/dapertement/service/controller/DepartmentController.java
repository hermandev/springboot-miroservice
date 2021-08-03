package id.codecorn.dapertement.service.controller;

import id.codecorn.dapertement.service.entity.Department;
import id.codecorn.dapertement.service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("save department method in DepartmentController");
        return departmentService.saveDepartment(department);
    }


    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        return departmentService.findDepartmentById(departmentId);
    }
}


