package com.pinyougou.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author 习大大送的小本本
 * @date 2018-04-22 21:36
 */
public class PageResult implements Serializable {
    private long total;//总记录数
    private List rows;

    public PageResult(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public PageResult() {
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
