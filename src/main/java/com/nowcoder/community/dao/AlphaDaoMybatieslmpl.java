package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @Author Le
 * @Data 2022/7/18 15:31
 */
@Repository
@Primary
public class AlphaDaoMybatieslmpl implements AlphaDao{
    @Override
    public String select() {
        return "MyBaties";
    }
}
