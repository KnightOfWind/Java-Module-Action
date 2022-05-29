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
package com.knight.config;

import com.knight.common.enums.GenderEnum;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.Arrays;

/**
 * @author wss
 * @date 2022/5/28 5:12 PM
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public class CommonMapper {

    public GenderEnum asGenderEnum(Byte gender) {
        return Arrays.stream(GenderEnum.values())
                .filter(e -> e.getValue().equals(gender))
                .findAny()
                .orElse(null);
    }

    public Byte asByte(GenderEnum gender) {
        return gender.getValue();
    }
}
