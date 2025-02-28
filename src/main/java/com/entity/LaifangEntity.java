package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 来访登记
 *
 * @author 
 * @email
 */
@TableName("laifang")
public class LaifangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LaifangEntity() {

	}

	public LaifangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 被访者
     */
    @TableField(value = "zhuhu_id")

    private Integer zhuhuId;


    /**
     * 姓名
     */
    @TableField(value = "laifang_name")

    private String laifangName;


    /**
     * 手机号
     */
    @TableField(value = "laifang_phone")

    private String laifangPhone;


    /**
     * 身份证号
     */
    @TableField(value = "laifang_id_number")

    private String laifangIdNumber;


    /**
     * 体温
     */
    @TableField(value = "tiwen")

    private Double tiwen;


    /**
     * 来访事由
     */
    @TableField(value = "laifang_shiyou")

    private String laifangShiyou;


    /**
     * 备注
     */
    @TableField(value = "laifang_content")

    private String laifangContent;


    /**
     * 来访时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：被访者
	 */
    public Integer getZhuhuId() {
        return zhuhuId;
    }


    /**
	 * 获取：被访者
	 */

    public void setZhuhuId(Integer zhuhuId) {
        this.zhuhuId = zhuhuId;
    }
    /**
	 * 设置：姓名
	 */
    public String getLaifangName() {
        return laifangName;
    }


    /**
	 * 获取：姓名
	 */

    public void setLaifangName(String laifangName) {
        this.laifangName = laifangName;
    }
    /**
	 * 设置：手机号
	 */
    public String getLaifangPhone() {
        return laifangPhone;
    }


    /**
	 * 获取：手机号
	 */

    public void setLaifangPhone(String laifangPhone) {
        this.laifangPhone = laifangPhone;
    }
    /**
	 * 设置：身份证号
	 */
    public String getLaifangIdNumber() {
        return laifangIdNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setLaifangIdNumber(String laifangIdNumber) {
        this.laifangIdNumber = laifangIdNumber;
    }
    /**
	 * 设置：体温
	 */
    public Double getTiwen() {
        return tiwen;
    }


    /**
	 * 获取：体温
	 */

    public void setTiwen(Double tiwen) {
        this.tiwen = tiwen;
    }
    /**
	 * 设置：来访事由
	 */
    public String getLaifangShiyou() {
        return laifangShiyou;
    }


    /**
	 * 获取：来访事由
	 */

    public void setLaifangShiyou(String laifangShiyou) {
        this.laifangShiyou = laifangShiyou;
    }
    /**
	 * 设置：备注
	 */
    public String getLaifangContent() {
        return laifangContent;
    }


    /**
	 * 获取：备注
	 */

    public void setLaifangContent(String laifangContent) {
        this.laifangContent = laifangContent;
    }
    /**
	 * 设置：来访时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：来访时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Laifang{" +
            "id=" + id +
            ", zhuhuId=" + zhuhuId +
            ", laifangName=" + laifangName +
            ", laifangPhone=" + laifangPhone +
            ", laifangIdNumber=" + laifangIdNumber +
            ", tiwen=" + tiwen +
            ", laifangShiyou=" + laifangShiyou +
            ", laifangContent=" + laifangContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
