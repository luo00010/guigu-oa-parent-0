package com.luo.auth;

import com.atguigu.model.system.SysRole;
import com.luo.auth.mapper.SysRoleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//@SpringBootTest
public class TestMpDemo1 {


    //@Autowired
    private SysRoleMapper mapper;

    /**
     * 查询所有记录
     */
    @Test
    public void getAll(){
        List<SysRole> list = mapper.selectList(null);
        for (SysRole sysRole : list) {
            System.out.println(sysRole);
        }
    }

    @Test
    public void add(){
        SysRole sysRole = new SysRole();
        sysRole.setRoleName("角色管理员");
        sysRole.setRoleCode("role");
        sysRole.setDescription("角色管理员");

        int insert = mapper.insert(sysRole);
        System.out.println(insert);
        System.out.println(sysRole);
    }


    @Test
    public void testUpdateById(){
        SysRole sysRole = mapper.selectById(9);
        //sysRole.setId(1L);
        sysRole.setRoleName("角色管理员1");

        int result = mapper.updateById(sysRole);
        System.out.println(result);
    }
}
