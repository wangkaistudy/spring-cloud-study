package com.github.clay.security.common.exception.auth;


import com.github.clay.security.common.constant.CommonConstants;
import com.github.clay.security.common.exception.BaseException;

/**
 * Created by clay on 2017/9/8.
 */
public class UserTokenException extends BaseException {
    public UserTokenException(String message) {
        super(message, CommonConstants.EX_USER_INVALID_CODE);
    }
}
