package com.zxxk.ext.abstractfactorydemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zxxk.ext.abstractfactorydemo.R;
import com.zxxk.ext.abstractfactorydemo.entity.UserEntity;
import com.zxxk.ext.abstractfactorydemo.service.DataAccess;

import java.util.Properties;

public class MainActivity extends AppCompatActivity {

    private final String TAG = getClass().getName();
    private Properties props;
    private String mDBType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        props = loadProperties();
        mDBType = props.getProperty("db", "Sqlserver");

        // 获取包名
        String packName = getPackageName();

        DataAccess.createUserService(packName + ".service."  + mDBType).insertUser(new UserEntity(1, "张三"));
    }


    private Properties loadProperties() {

        Properties props = new Properties();
        try {
            int id = getResources().getIdentifier("config", "raw", getPackageName());
            props.load(getResources().openRawResource(id));
        } catch (Exception e) {
            Log.e(TAG, "Could not find the properties file.", e);
             e.printStackTrace();
        }
        return props;
    }
}
