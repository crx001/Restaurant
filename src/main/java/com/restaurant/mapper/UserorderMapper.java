package com.restaurant.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;

import com.restaurant.model.Userorder;
import com.restaurant.model.UserorderExample;

@Controller
public interface UserorderMapper {
    int countByExample(UserorderExample example);

    int deleteByExample(UserorderExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(Userorder record);
/**
 * 增加用户菜单
 * @param record
 * @return
 */
    Boolean addUserOrder(Userorder record);

    List<Userorder> selectByExample(UserorderExample example);

    Userorder selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") Userorder record, @Param("example") UserorderExample example);

    int updateByExample(@Param("record") Userorder record, @Param("example") UserorderExample example);

    int updateByPrimaryKeySelective(Userorder record);

    int updateByPrimaryKey(Userorder record);
    /**
     * 查询用户菜单
     */
    List<Userorder> selectUserMeun(@Param("oname")String oname);
  
}