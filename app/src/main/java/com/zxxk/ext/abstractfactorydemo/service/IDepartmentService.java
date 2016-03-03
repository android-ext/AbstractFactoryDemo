package com.zxxk.ext.abstractfactorydemo.service;

import com.zxxk.ext.abstractfactorydemo.entity.DepartmentEntity;

/**
 * Description:
 * Created by: Ext
 * Created at: 2016/3/2
 */
public interface IDepartmentService {

    void insertDepart(DepartmentEntity user);

    DepartmentEntity getDepartById(int id);
}
