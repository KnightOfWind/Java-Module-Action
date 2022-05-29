/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.knight.domain.dos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @author wss
 * @date 2022/5/29 8:04 AM
 */

/**
 * 用户表
 */
@Data
@TableName(value = "`user`")
public class User {
    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.INPUT)
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
    @TableField(value = "creator")
    private Integer creator;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 修改人
     */
    @TableField(value = "modifier")
    private Integer modifier;

    /**
     * 修改时间
     */
    @TableField(value = "modify_time")
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