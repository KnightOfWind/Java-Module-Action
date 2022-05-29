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