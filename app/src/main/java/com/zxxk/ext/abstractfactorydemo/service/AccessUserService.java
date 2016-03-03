package com.zxxk.ext.abstractfactorydemo.service;

import android.util.Log;

import com.zxxk.ext.abstractfactorydemo.entity.UserEntity;

/**
 * Description:
 * Created by: Ext
 * Created at: 2016/3/2
 */
public class AccessUserService implements IUserService {

    private final String TAG = getClass().getName();

    @Override
    public void insertUser(UserEntity user) {

        Log.i(TAG, "insertUser:" + user);
    }

    @Override
    public UserEntity getUserById(int id) {
        return new UserEntity(1, "返回User实体");
    }

}
