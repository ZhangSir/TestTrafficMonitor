package com.itzs.testtrafficmonitor;

import android.content.pm.ApplicationInfo;

import java.io.Serializable;

/**
 * 记录应用程序流量的model
 * Created by zhangshuo on 2016/7/7.
 */
public class AppTrafficModel implements Serializable{

    private ApplicationInfo appInfo;

    private long download;
    private long upload;


    public long getDownload() {
        return download;
    }

    public void setDownload(long download) {
        this.download = download;
    }

    public long getUpload() {
        return upload;
    }

    public void setUpload(long upload) {
        this.upload = upload;
    }

    public ApplicationInfo getAppInfo() {
        return appInfo;
    }

    public void setAppInfo(ApplicationInfo appInfo) {
        this.appInfo = appInfo;
    }
}
