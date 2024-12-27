package com.woori.logindb.DTO;

import com.woori.logindb.Constant.RoleType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor @Builder @ToString
public class LoginDTO {
    private Integer id;
    private String loginid;
    private String password;
    private String username;
    private RoleType roleType;
}
