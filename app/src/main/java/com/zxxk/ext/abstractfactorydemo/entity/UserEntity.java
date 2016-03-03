package com.zxxk.ext.abstractfactorydemo.entity;

/**
 * Description:
 * Created by: Ext
 * Created at: 2016/3/2
 */
public class UserEntity extends BaseEntity {

    private int id;
    private String name;

    public UserEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
