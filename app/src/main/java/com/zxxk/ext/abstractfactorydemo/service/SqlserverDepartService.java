package com.zxxk.ext.abstractfactorydemo.service;

import android.util.Log;

import com.zxxk.ext.abstractfactorydemo.entity.DepartmentEntity;

/**
 * Description:
 * Created by: Ext
 * Created at: 2016/3/2
 */
public class SqlserverDepartService implements IDepartmentService {

    private final String TAG = getClass().getName();


    @Override
    public void insertDepart(DepartmentEntity user) {

        Log.i(TAG, "insertDepart:" + user);
    }

    @Override
    public DepartmentEntity getDepartById(int id) {
        return new DepartmentEntity(1, "返回Depart实体");
    }
}
