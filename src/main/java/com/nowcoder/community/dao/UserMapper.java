package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author Le
 * @Data 2022/7/19 11:46
 */
@Mapper
public interface UserMapper {
    User selectById(int id);

    User selectByName(String name);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatuts(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);
}
