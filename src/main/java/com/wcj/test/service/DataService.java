//package com.wcj.test.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
///**
// * @author: wcj
// * @description: DataService
// * @date: 2020/1/20 16:18
// **/
//@Service
//public class DataService {
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    public Integer count() {
//        return this.jdbcTemplate.queryForObject("select count(*) from user", Integer.class);
//    }
//}
