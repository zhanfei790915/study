package com.gene.study.web.model;

public class Menu {
    private Integer id;

    private String mname;

    private String murl;

    private Integer pid;

    private String iconcode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getMurl() {
        return murl;
    }

    public void setMurl(String murl) {
        this.murl = murl == null ? null : murl.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getIconcode() {
        return iconcode;
    }

    public void setIconcode(String iconcode) {
        this.iconcode = iconcode == null ? null : iconcode.trim();
    }
}