package com.gene.study.web.model;

public class Menu {
    private Integer id;

    private String name;

    private String url;

    private Integer pid;

    private String iconcode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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