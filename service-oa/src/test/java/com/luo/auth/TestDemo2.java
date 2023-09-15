package com.luo.auth;

import com.atguigu.model.system.SysRole;
import com.luo.auth.service.SysRoleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//@SpringBootTest
public class TestDemo2 {

//    @Autowired
    private SysRoleService sysRoleService;

    @Test
    public void getAll(){
        List<SysRole> list = sysRoleService.list();
        for (SysRole sysRole : list) {
            System.out.println(sysRole);
        }
    }


}
