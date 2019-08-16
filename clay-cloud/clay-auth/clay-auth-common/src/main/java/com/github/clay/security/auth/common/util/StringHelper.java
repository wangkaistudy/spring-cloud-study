package com.github.clay.security.auth.common.util;

/**
 * Created by clay on 2017/9/10.
 */
public class StringHelper {
    public static String getObjectValue(Object obj){
        return obj==null?"":obj.toString();
    }
}
