package com.shzu.convenience.entity;

/**
 * 业务实体类
 * @author atom
 */
public class Business {
    /**
     * 编号id
     */
    private Integer id;
    /**
     * 用户id
     */
    private Integer uid;
    /**
     * 故障id
     */
    private Integer fid;
    /**
     * 区域id
     */
    private Integer rid;
    /**
     * 故障描述
     */
    private String description;
    /**
     * 故障确认
     */
    private Integer once;
    /**
     * 维修人员id
     */
    private Integer mid;
    /**
     * 故障回执
     */
    private String receipt;
    /**
     * 最终结果确认
     */
    private Integer twice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getOnce() {
        return once;
    }

    public void setOnce(Integer once) {
        this.once = once;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public Integer getTwice() {
        return twice;
    }

    public void setTwice(Integer twice) {
        this.twice = twice;
    }
}
