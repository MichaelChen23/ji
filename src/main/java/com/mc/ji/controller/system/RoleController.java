package com.mc.ji.controller.system;

import com.mc.ji.common.base.BaseController;
import com.mc.ji.model.system.RoleDO;
import com.mc.ji.service.system.IRoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 角色的Controller
 * @author mc
 * @date 2017-8-11
 */
@RestController
@RequestMapping("/role")
public class RoleController extends BaseController<IRoleService, RoleDO> {
}