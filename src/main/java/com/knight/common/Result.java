package com.knight.common;

import lombok.Data;

/**
 * @author wss
 * @date 2022/5/23 8:40 AM
 */
@Data
public class Result<T> {
    private ErrorInfo errorInfo;
    private T data;

    public boolean succeed() {
        return  errorInfo == null;
    }

    public boolean failure() {
        return errorInfo != null;
    }
}
