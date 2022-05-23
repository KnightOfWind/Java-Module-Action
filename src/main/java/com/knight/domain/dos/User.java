package com.knight.domain.dos;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import lombok.Data;

/**
 * 
 * @author wss
 * @date 2022/5/23 8:11 AM
 */
@Data
@TableName(value = "`user`")
public class User {
    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 名字
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 性别
     */
    @TableField(value = "gender")
    private Byte gender;

    /**
     * 生日
     */
    @TableField(value = "birth_day")
    private Date birthDay;

    /**
     * 创建人
     */
    @TableField(value = "creator", fill = FieldFill.INSERT)
    private Integer creator;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 修改人
     */
    @TableField(value = "modifier", fill = FieldFill.INSERT_UPDATE)
    private Integer modifier;

    /**
     * 修改时间
     */
    @TableField(value = "modify_time", fill = FieldFill.INSERT_UPDATE)
    private Date modifyTime;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_GENDER = "gender";

    public static final String COL_BIRTH_DAY = "birth_day";

    public static final String COL_CREATOR = "creator";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_MODIFIER = "modifier";

    public static final String COL_MODIFY_TIME = "modify_time";
}