package com.ptw.db;
public enum DataSourceEnum {

    MySQL("mysql"),SQLServer("sqlserver");

    private String value;

    DataSourceEnum(String value){this.value=value;}

    public String getValue() {
        return value;
    }
}