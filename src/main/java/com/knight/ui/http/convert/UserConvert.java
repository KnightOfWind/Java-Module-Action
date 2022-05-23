package com.knight.ui.http.convert;

import com.knight.domain.dos.User;
import com.knight.ui.http.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

/**
 * @author wss
 * @date 2022/5/23 8:10 PM
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserConvert {

    @Mapping(target = "birthDay", expression = "java(cn.hutool.core.date.DateUtil.parseDate(userDto.getBirthDay()))")
    User convert(UserDto userDto);
}
