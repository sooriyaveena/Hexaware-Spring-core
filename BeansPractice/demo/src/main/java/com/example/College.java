package com.example;

public class College {
    int cid;
    String colName;

    Student s1;

    public College(){}

    public College(int cid, String colName , Student s1) {
        super();
        this.cid = cid;
        this.colName = colName;
    }
    

    @Override
    public String toString() {
        return "College [cid=" + cid + ", colName=" + colName + "]";
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    };
    
    
}
