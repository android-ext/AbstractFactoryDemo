package com.zxxk.ext.abstractfactorydemo.service;


/**
 *
 * 所有在用简单工厂的地方，都可以考虑用反射技术来去除switch或if,解除分支判断带来的耦合
 *
 * Description: 操作服务对象的实例化类
 * Created by: Ext
 * Created at: 2016/3/2
 */
public class DataAccess {

    private static final String USERKEY = "UserService";
    private static final String DEPARTKEY = "DepartService";

    /**
     * @description: 采用反射方法获取用户操作服务对象
     * @Time: 2016/3/2 17:55
     * @param
     * @return
     */
    public static IUserService createUserService(String type) {

        Class<IUserService> userServiceClass = null;

        try {
            userServiceClass = (Class<IUserService>) Class.forName(type + USERKEY);
            if (null != userServiceClass) {

                return userServiceClass.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * @description: 采用反射方法获取部门操作服务对象
     * @Time: 2016/3/2 17:55
     * @param
     * @return
     */
    public static IDepartmentService createDepartService(String type) {

        Class<IDepartmentService> departServiceClass = null;

        try {
            departServiceClass = (Class<IDepartmentService>) Class.forName(type + DEPARTKEY);
            if (null != departServiceClass) {

                return departServiceClass.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
