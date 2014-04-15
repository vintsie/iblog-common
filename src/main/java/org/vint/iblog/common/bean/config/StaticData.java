package org.vint.iblog.common.bean.config;

import java.io.Serializable;

/**
 * 公用配置对象，与数据存储类型无关
 * <p/>
 * Created by Vin on 14-2-17.
 */
public class StaticData implements Serializable, Comparable<StaticData> {

    private String dataType;
    private String dataValue;

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    // 排序
    private int sort;

    private String state;

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 实现Comparable接口
    @Override
    public int compareTo(StaticData o) {
        return o.getSort() > this.getSort() ? 1 : -1;
    }
}
