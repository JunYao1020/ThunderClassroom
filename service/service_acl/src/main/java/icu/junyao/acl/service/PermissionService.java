package icu.junyao.acl.service;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.IService;
import icu.junyao.acl.entity.Permission;

import java.util.List;

/**
 * <p>
 * 权限 服务类
 * </p>
 *
 * @author wu
 * @since 2021-08-02
 */
public interface PermissionService extends IService<Permission> {



    /**
     * 获取全部菜单
     * @return
     */
    List<Permission> queryAllMenu();



    /**
     *    根据角色获取菜单
     * @param roleId
     * @return
     */
    List<Permission> selectAllMenu(String roleId);

    /**
     *   给角色分配权限
     * @param roleId
     * @param permissionId
     */
    void saveRolePermissionRelationShip(String roleId, String[] permissionId);

    /**
     * 递归删除菜单
     * @param id
     */
    void removeChildById(String id);

    /**
     * 根据用户id获取用户菜单
     * @param id
     * @return
     */
    List<String> selectPermissionValueByUserId(String id);

    List<JSONObject> selectPermissionByUserId(String id);

    /**
     *   获取全部菜单
     * @return
     */
    List<Permission> queryAllMenuJunYao();

    /**
     * 递归删除菜单
     * @param id
     */
    void removeChildByIdJunYao(String id);

    /**
     * 给角色分配权限
     * @param roleId
     * @param permissionId
     */
    void saveRolePermissionRelationShipJunYao(String roleId, String[] permissionId);
}
