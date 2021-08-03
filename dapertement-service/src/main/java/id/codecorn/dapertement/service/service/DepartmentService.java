package id.codecorn.dapertement.service.service;

import id.codecorn.dapertement.service.repository.DepartmentRepository;
import id.codecorn.dapertement.service.entity.Department;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("save DeparmentService");
        return departmentRepository.save(department);
    }


    public Department findDepartmentById(Long departmentId) {
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
