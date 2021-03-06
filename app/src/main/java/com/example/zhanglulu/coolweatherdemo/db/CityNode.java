package com.example.zhanglulu.coolweatherdemo.db;

import org.litepal.crud.DataSupport;

import interfaces.heweather.com.interfacesmodule.bean.basic.Basic;

public class CityNode extends DataSupport{

    private String loc;

    private String cid;

    private boolean isCurrent = false;

    public CityNode(Basic basic){
        loc = basic.getLocation();
        cid = basic.getCid();
    }

    public String getCid() {
        return cid;
    }

    public String getLoc() {
        return loc;
    }

    public boolean isCurent() {
        return isCurrent;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public void setCurrent(boolean current) {
        isCurrent = current;
    }
}
