package com.zxxk.ext.abstractfactorydemo.service;

import com.zxxk.ext.abstractfactorydemo.entity.UserEntity;

/**
 * Description:
 * Created by: Ext
 * Created at: 2016/3/2
 */
public interface IUserService {

    void insertUser(UserEntity user);

    UserEntity getUserById(int id);
}
