package id.codecorn.userservice.service;

import id.codecorn.userservice.entity.User;
import id.codecorn.userservice.repository.UserRepository;
import id.codecorn.userservice.vo.Department;
import id.codecorn.userservice.vo.ResponseTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public ResponseTemplateVo getUserWithDepartment(Long userId) {
        ResponseTemplateVo vo = new ResponseTemplateVo();
        User user = userRepository.findByUserId(userId);

        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId() , Department.class);
        vo.setUser(user);
        vo.setDepartment(department);

        return vo;
    }
}
