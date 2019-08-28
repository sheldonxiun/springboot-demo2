package io.xiun.springboot.test1.service;

import io.xiun.springboot.test1.mapper.UserMapper;
import io.xiun.springboot.test2.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CustomerMapper customerMapper;

    public void save(String username, String password) {
        //String sql = "insert into t_user (username,password) values (?,?)";
        //jdbcTemplate.update(sql, username, password);

        customerMapper.save(username, "12345");
        //int i = 10 / 0;
        userMapper.save(username, password);
    }
}
