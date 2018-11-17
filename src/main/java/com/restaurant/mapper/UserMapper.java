package com.restaurant.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import com.restaurant.model.User;
import com.restaurant.model.UserExample;

@Controller
public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer uid);
   
    int insert(User record);
    /**
     * 新增用户
     * @param record
     * @return
     */
    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
  /**
   * 查询用户信息
   * @param user
   * @return
   */
    List<User> selectUserInfo(User user);
}