package id.codecorn.userservice.vo;

import id.codecorn.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVo {
    private User user;
    private Department department;
}
