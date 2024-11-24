package com.dyj.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author:杰杰睡不醒
 * @Date:2024/11/20 10:12
 * @Description:
 **/
@Data
public class UserAddRequest implements Serializable {

    private static final long serialVersionUID = -1L;

    private String userAccount;

    private String userPassword;

    private String planetCode;

}
