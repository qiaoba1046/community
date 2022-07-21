package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author Le
 * @Data 2022/7/18 16:23
 */
@Service
//@Scope("prototype")
public class AlphaService {
    @Autowired
    private AlphaDao alphaDao;

    public AlphaService() {
        System.out.println("construct...");
    }

    @PostConstruct
    public void init(){
        System.out.println("init...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy...");
    }

    public String find(){
        return alphaDao.select();
    }
}
