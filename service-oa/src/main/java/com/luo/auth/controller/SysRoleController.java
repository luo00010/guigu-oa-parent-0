package com.luo.auth.controller;

import com.atguigu.model.system.SysRole;
import com.luo.auth.service.SysRoleService;
import com.luo.common.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "角色管理接口")
@RestController
@RequestMapping("/admin/system/sysRole")
public class SysRoleController {


    @Autowired
    private SysRoleService sysRoleService;

    /**
     * 查询所有角色
     * @return
     */
//    @GetMapping("/findAll")
//    public List<SysRole> findAll(){
//        List<SysRole> list = sysRoleService.list();
//        return list;
//    }
    @ApiOperation("查询所有角色")
    @GetMapping("/findAll")
    public Result<List<SysRole>> findAll(){
        List<SysRole> list = sysRoleService.list();
        return Result.ok(list);
    }

    //条件分页查询


    //添加角色

    //删除角色




}
