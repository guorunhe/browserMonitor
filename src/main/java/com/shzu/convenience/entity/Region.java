package com.shzu.convenience.entity;

/**
 * 区域实体类
 * @author atom
 */
public class Region {
    /**
     * 区域编号
     */
    private Integer id;
    /**
     * 区域名称
     */
    private String name;
    /**
     * 区域描述
     */
    private String description;

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
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
