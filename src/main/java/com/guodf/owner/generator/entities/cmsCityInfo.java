package com.guodf.owner.generator.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cms_city_info")
public class cmsCityInfo {
    /**
     * 社区id
     */
    @Id
    @Column(name = "city_id")
    private Integer cityId;

    /**
     * 社区名称
     */
    @Column(name = "city_name")
    private String cityName;

    /**
     * 状态
     */
    private String status;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 关联省编码
     */
    @Column(name = "province_id")
    private Integer provinceId;

    /**
     * 是否是省会
     */
    @Column(name = "is_center")
    private Integer isCenter;

    /**
     * 获取社区id
     *
     * @return city_id - 社区id
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 设置社区id
     *
     * @param cityId 社区id
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取社区名称
     *
     * @return city_name - 社区名称
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 设置社区名称
     *
     * @param cityName 社区名称
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取关联省编码
     *
     * @return province_id - 关联省编码
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * 设置关联省编码
     *
     * @param provinceId 关联省编码
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 获取是否是省会
     *
     * @return is_center - 是否是省会
     */
    public Integer getIsCenter() {
        return isCenter;
    }

    /**
     * 设置是否是省会
     *
     * @param isCenter 是否是省会
     */
    public void setIsCenter(Integer isCenter) {
        this.isCenter = isCenter;
    }
}