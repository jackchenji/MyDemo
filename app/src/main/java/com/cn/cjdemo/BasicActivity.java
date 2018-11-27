package com.cn.cjdemo;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.cn.cjdemo.util.SQLog;
import com.tbruyelle.rxpermissions.Permission;
import com.tbruyelle.rxpermissions.RxPermissions;

import rx.functions.Action1;
import rx.schedulers.NewThreadScheduler;

public class BasicActivity  extends Activity {
   protected    Context mContext;
   protected    String[] permission=new String[]{
         Manifest.permission.CAMERA,
         Manifest.permission.READ_EXTERNAL_STORAGE,
         Manifest.permission.WRITE_EXTERNAL_STORAGE,
         Manifest.permission.READ_PHONE_STATE,
         Manifest.permission.ACCESS_COARSE_LOCATION};



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext=getApplicationContext();

        //申请一个权限示例
        /*RxPermissions.getInstance(mContext).request(Manifest.permission.ACCESS_COARSE_LOCATION).subscribe(new Action1<Boolean>() {
            @Override
            public void call(Boolean aBoolean) {
                if (aBoolean) {    //点击允许
                    //当所有权限都允许之后，返回true
                    Log.i("permissions", "btn_more_sametime：" + aBoolean);} else {
                    //只要有一个权限禁止，返回false， //下一次申请只申请没通过申请的权限
                    Log.i("permissions", "btn_more_sametime：" + aBoolean);}
                }
        });*/


      //申请多个权限示例
        RxPermissions.getInstance(mContext).requestEach(permission).subscribe(new Action1<Permission>() {
            @Override
            public void call(Permission permission) {
                //多个权限
                }
        });

    }
}