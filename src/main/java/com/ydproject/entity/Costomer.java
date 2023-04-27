package com.ydproject.entity;

public class Costomer {
    private String id;
    private String account;
    private String name;
    private String password;
    private Integer vipId;
    private String details;

    private VipLevel vipLevel;

    public Costomer() {
    }

    public Costomer(String id, String account, String name, String password, Integer vipId, String details, VipLevel vipLevel) {
        this.id = id;
        this.account = account;
        this.name = name;
        this.password = password;
        this.vipId = vipId;
        this.details = details;
        this.vipLevel = vipLevel;
    }

    public Costomer(String id, String account, String name, String password, Integer vipId, String details) {
        this.id = id;
        this.account = account;
        this.name = name;
        this.password = password;
        this.vipId = vipId;
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getVipId() {
        return vipId;
    }

    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public VipLevel getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(VipLevel vipLevel) {
        this.vipLevel = vipLevel;
    }

    @Override
    public String toString() {
        return "Costomer{" +
                "id='" + id + '\'' +
                ", account='" + account + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", vipId=" + vipId +
                ", details='" + details + '\'' +
                ", vipLevel=" + vipLevel +
                '}';
    }
}
