package com.knight.common;

import lombok.Data;

/**
 * @author wss
 * @date 2022/5/23 8:40 AM
 */
@Data
public class ErrorInfo {

    private ErrorDesc errorDesc;

    private String errorMsg;
}
