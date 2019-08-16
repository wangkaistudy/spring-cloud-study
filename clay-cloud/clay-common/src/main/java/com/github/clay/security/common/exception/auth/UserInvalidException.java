package com.github.clay.security.common.exception.auth;


import com.github.clay.security.common.constant.CommonConstants;
import com.github.clay.security.common.exception.BaseException;

/**
 * Created by clay on 2017/9/8.
 */
public class UserInvalidException extends BaseException {
    public UserInvalidException(String message) {
        super(message, CommonConstants.EX_USER_PASS_INVALID_CODE);
    }
}
