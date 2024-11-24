package com.dyj.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author:杰杰睡不醒
 * @Date:2024/11/10 16:23
 * @Description:用户对象请求体
 **/
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 9184503217925433450L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
