package io.xiun.springboot.test2.service;

import io.xiun.springboot.test2.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl {

    @Autowired
    private CustomerMapper customerMapper;

    public void save(String username, String tel) {
        //String sql = "insert into t_user (username,password) values (?,?)";
        //jdbcTemplate.update(sql, username, password);
        //int i = 10 / 0;
        customerMapper.save(username, tel);
    }

}
