package com.knight.ui.http.convert;

import cn.hutool.core.date.DateUtil;
import com.knight.domain.dos.User;
import com.knight.ui.http.dto.UserDto;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author wss
 * @date 2022/5/23 8:10 PM
 */
@Component
public class UserConvert {

    public User convert(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setGender(userDto.getGender());
        user.setBirthDay(DateUtil.parseDate(userDto.getBirthday()));
        user.setCreator(0);
        user.setCreateTime(new Date(System.currentTimeMillis()));
        user.setModifier(0);
        user.setModifyTime(new Date(System.currentTimeMillis()));
        return user;
    }
}
