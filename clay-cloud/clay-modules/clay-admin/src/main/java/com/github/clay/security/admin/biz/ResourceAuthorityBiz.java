package com.github.clay.security.admin.biz;

import com.github.clay.security.admin.entity.ResourceAuthority;
import com.github.clay.security.admin.mapper.ResourceAuthorityMapper;
import com.github.clay.security.common.biz.BaseBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by clay on 2017/6/19.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ResourceAuthorityBiz extends BaseBiz<ResourceAuthorityMapper,ResourceAuthority> {
}
