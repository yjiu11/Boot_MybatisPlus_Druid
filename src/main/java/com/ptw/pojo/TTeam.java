package com.ptw.pojo;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author yjiu123
 * @since 2019-01-12
 */
@TableName("t_team")
@Data
@Accessors(chain=true)
public class TTeam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 团队编号
     */
    @TableId(value = "team_id", type = IdType.AUTO)
    private Integer teamId;
    /**
     * 团号
     */
    @TableField("team_no")
    private String teamNo;
    /**
     * 线路名称
     */
    @TableField("line_name")
    private String lineName;
    /**
     * 发团日期
     */
    @TableField("go_time")
    private Date goTime;
    /**
     * 回团日期
     */
    @TableField("back_time")
    private Date backTime;
    /**
     * 模板编号
     */
    @TableField("TempletID")
    private Integer TempletID;
    /**
     * 领队
     */
    @TableField("team_leader")
    private String teamLeader;
    /**
     * 地接
     */
    @TableField("ground_connection")
    private String groundConnection;
    /**
     * 人数
     */
    @TableField("person_number")
    private Integer personNumber;
    /**
     * 司机
     */
    @TableField("driver_name")
    private String driverName;
    /**
     * 国籍
     */
    @TableField("nationality")
    private String nationality;
    /**
     * 电话
     */
    @TableField("tel_phone")
    private String telPhone;
    /**
     * 车型
     */
    @TableField("car_type")
    private String carType;
    /**
     * 已反馈人数
     */
    @TableField("Feedback_num")
    private Integer feedbackNum;
    /**
     * 小程序码
     */
    @TableField("qr_image_path")
    private String qr_image_path;
    /**
     * 领队小程序码
     */
    @TableField("qr_image_path_leader")
    private String qr_image_path_leader;
    /**
     * 领队模板
     */
    @TableField("TempletID_leader")
    private Integer TempletID_leader;
}
