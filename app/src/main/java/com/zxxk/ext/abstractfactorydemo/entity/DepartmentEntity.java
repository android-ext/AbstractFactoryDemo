package com.zxxk.ext.abstractfactorydemo.entity;

/**
 * Description:
 * Created by: Ext
 * Created at: 2016/3/2
 */
public class DepartmentEntity extends BaseEntity {

    private int id;
    private String departName;

    public DepartmentEntity(int id, String departName) {
        this.id = id;
        this.departName = departName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    @Override
    public String toString() {
        return "DepartmentEntity{" +
                "id=" + id +
                ", departName='" + departName + '\'' +
                '}';
    }
}
