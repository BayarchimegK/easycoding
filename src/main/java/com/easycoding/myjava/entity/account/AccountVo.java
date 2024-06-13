package com.easycoding.myjava.entity.account;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AccountVo {
    private Integer userId;
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String regDate;
    private String updDate;

    private String[] userIdList;
    private Integer selectedUserId;
}
