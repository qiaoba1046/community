package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

/**
 * @Author Le
 * @Data 2022/7/19 13:29
 */
@SpringBootTest
public class MapperTests {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectUser(){
        User user = userMapper.selectById(101);
        System.out.println(user);

        User liubei = userMapper.selectByName("liubei");
        System.out.println(liubei);
    }
    @Test
    public void testInserttUser(){
        User user = new User();
        user.setUsername("test");
        user.setPassword("123456");
        user.setSalt("abc");
        user.setEmail("test@qq.com");
        user.setHeaderUrl("http://www.nowcoder.com/101.png");
        user.setCreateTime(new Date());

        int row = userMapper.insertUser(user);
        System.out.println(row);
        System.out.println(user.getId());
    }

    @Test
    public void updateUser(){
        int row = userMapper.updateStatuts(150, 1);
        System.out.println(row);

        row = userMapper.updateHeader(150,"http://www.nowcoder.com/102.png");
        System.out.println(row);

        row = userMapper.updatePassword(150,"hello");
        System.out.println(row);
    }

    @Test
    public void testSelectPosts(){
        int rows = discussPostMapper.selectDiscussPostRows(149);
        System.out.println(rows);

        List<DiscussPost> postList = discussPostMapper.selectDiscussPosts(149, 0, 10);
        for (DiscussPost discussPost : postList) {
            System.out.println(postList);
        }
    }

}
