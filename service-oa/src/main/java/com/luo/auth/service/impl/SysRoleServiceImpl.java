package com.luo.auth.service.impl;

import com.atguigu.model.system.SysRole;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luo.auth.mapper.SysRoleMapper;
import com.luo.auth.service.SysRoleService;
import org.springframework.stereotype.Service;

@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
}
