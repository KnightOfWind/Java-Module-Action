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
 * @date 2022/5/29 8:05 AM
 */   
/**
    * 日志表
    */
@Data
@TableName(value = "log")
public class Log {
    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    /**
     * 事件类型
     */
    @TableField(value = "event_type")
    private Integer eventType;

    /**
     * 事件
     */
    @TableField(value = "event")
    private String event;

    /**
     * 操作人
     */
    @TableField(value = "`operator`")
    private Integer operator;

    /**
     * 操作时间
     */
    @TableField(value = "operate_time")
    private Date operateTime;

    public static final String COL_ID = "id";

    public static final String COL_EVENT_TYPE = "event_type";

    public static final String COL_EVENT = "event";

    public static final String COL_OPERATOR = "operator";

    public static final String COL_OPERATE_TIME = "operate_time";
}