package com.hexaware.assetmanage.dao;

import com.hexaware.assetmanage.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();

        user.setUserID(rs.getInt("userid"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setName(rs.getString("name"));
        user.setGender(rs.getString("gender"));
        user.setNumber(rs.getString("contactnumber"));
        user.setAddress(rs.getString("address"));

        return user;
    }
}
