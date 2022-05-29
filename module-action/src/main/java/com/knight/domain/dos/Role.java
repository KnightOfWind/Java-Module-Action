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
    * 角色表
    */
@Data
@TableName(value = "`role`")
public class Role {
    /**
     * 角色id，自增主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    /**
     * 角色名称
     */
    @TableField(value = "role_name")
    private String roleName;

    /**
     * 角色描述
     */
    @TableField(value = "role_desc")
    private String roleDesc;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @TableField(value = "creator")
    private Integer creator;

    /**
     * 修改时间
     */
    @TableField(value = "modify_time")
    private Date modifyTime;

    /**
     * 修改人
     */
    @TableField(value = "modifier")
    private Integer modifier;

    public static final String COL_ID = "id";

    public static final String COL_ROLE_NAME = "role_name";

    public static final String COL_ROLE_DESC = "role_desc";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_CREATOR = "creator";

    public static final String COL_MODIFY_TIME = "modify_time";

    public static final String COL_MODIFIER = "modifier";
}