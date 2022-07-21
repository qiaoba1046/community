package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author Le
 * @Data 2022/7/18 15:31
 */
@Repository
public class AlphaDaoHibernatelmpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
