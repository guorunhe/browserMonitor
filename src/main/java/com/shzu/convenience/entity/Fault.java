package com.shzu.convenience.entity;

/**
 * 故障实体类
 * @author atom
 */
public class Fault {
    /**
     * 故障编号
     */
    private Integer id;
    /**
     * 故障名
     */
    private String name;
    /**
     * 故障描述
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
