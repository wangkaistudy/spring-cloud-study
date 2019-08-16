package com.github.clay.security.common.exception.auth;


import com.github.clay.security.common.constant.CommonConstants;
import com.github.clay.security.common.exception.BaseException;

/**
 * Created by clay on 2017/9/10.
 */
public class ClientTokenException extends BaseException {
    public ClientTokenException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }
}
