package com.github.clay.security.common.exception.auth;


import com.github.clay.security.common.constant.CommonConstants;
import com.github.clay.security.common.exception.BaseException;

/**
 * Created by clay on 2017/9/12.
 */
public class ClientForbiddenException extends BaseException {
    public ClientForbiddenException(String message) {
        super(message, CommonConstants.EX_CLIENT_FORBIDDEN_CODE);
    }

}
