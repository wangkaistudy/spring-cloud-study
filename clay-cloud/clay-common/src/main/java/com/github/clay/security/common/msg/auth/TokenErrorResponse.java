package com.github.clay.security.common.msg.auth;

import com.github.clay.security.common.constant.RestCodeConstants;
import com.github.clay.security.common.msg.BaseResponse;

/**
 * Created by clay on 2017/8/23.
 */
public class TokenErrorResponse extends BaseResponse {
    public TokenErrorResponse(String message) {
        super(RestCodeConstants.TOKEN_ERROR_CODE, message);
    }
}
