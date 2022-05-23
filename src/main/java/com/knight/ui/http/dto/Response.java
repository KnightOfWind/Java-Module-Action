package com.knight.ui.http.dto;

import lombok.Data;

/**
 * @author wss
 * @date 2022/5/23 7:50 PM
 */
@Data
public class Response<T> {

    private Integer code;

    private String msg;

    private T data;
}
