package com.example.finance.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserPayMoney {
    private Integer id;

    private Integer userid;

    private Integer payid;

    private Date starttime;

    private BigDecimal averyield;

    private BigDecimal profit;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPayid() {
        return payid;
    }

    public void setPayid(Integer payid) {
        this.payid = payid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public BigDecimal getAveryield() {
        return averyield;
    }

    public void setAveryield(BigDecimal averyield) {
        this.averyield = averyield;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}