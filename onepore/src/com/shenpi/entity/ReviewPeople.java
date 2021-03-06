package com.shenpi.entity;

public class ReviewPeople {
    private int rid;//送审人id
    private  String rname;//送审人账号
    private String rpwd;//送审人密码
    private char rsex;//送审人性别
    private  String name;//送审人姓名
    private  String idCard;//送审人身份证号

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRpwd() {
        return rpwd;
    }

    public void setRpwd(String rpwd) {
        this.rpwd = rpwd;
    }

    public char getRsex() {
        return rsex;
    }

    public void setRsex(char rsex) {
        this.rsex = rsex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "ReviewPeople{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", rpwd='" + rpwd + '\'' +
                ", rsex=" + rsex +
                ", name='" + name + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
