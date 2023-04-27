package com.ydproject.entity;

import java.util.List;

public class VipLevel {
    private Integer id;
    private String level;
    private String vipdetails;
    private List<Costomer> costomers;

    public VipLevel() {
    }

    public VipLevel(Integer id, String level, String vipdetails, List<Costomer> costomers) {
        this.id = id;
        this.level = level;
        this.vipdetails = vipdetails;
        this.costomers = costomers;
    }

    @Override
    public String toString() {
        return "VipLevel{" +
                "id=" + id +
                ", level='" + level + '\'' +
                ", vipdetails='" + vipdetails + '\'' +
                ", costomers=" + costomers +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getVipdetails() {
        return vipdetails;
    }

    public void setVipdetails(String vipdetails) {
        this.vipdetails = vipdetails;
    }

    public List<Costomer> getCostomers() {
        return costomers;
    }

    public void setCostomers(List<Costomer> costomers) {
        this.costomers = costomers;
    }
}
