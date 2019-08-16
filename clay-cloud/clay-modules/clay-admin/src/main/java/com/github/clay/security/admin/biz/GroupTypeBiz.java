package com.github.clay.security.admin.biz;

import org.springframework.stereotype.Service;

import com.github.clay.security.admin.entity.GroupType;
import com.github.clay.security.admin.mapper.GroupTypeMapper;
import com.github.clay.security.common.biz.BaseBiz;
import org.springframework.transaction.annotation.Transactional;

/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-06-12 8:48
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GroupTypeBiz extends BaseBiz<GroupTypeMapper,GroupType> {
}
