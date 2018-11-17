package com.restaurant.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;

import com.restaurant.model.Food;
import com.restaurant.model.FoodExample;

@Controller
public interface FoodMapper {
    int countByExample(FoodExample example);

    int deleteByExample(FoodExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(Food record);

    int insertSelective(Food record);

    List<Food> selectByExample(FoodExample example);

    Food selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") Food record, @Param("example") FoodExample example);

    int updateByExample(@Param("record") Food record, @Param("example") FoodExample example);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKey(Food record);
    /**
     * 查询所有食物
     * @return
     */
    List<Food> selectAllFood();
    
    /**
     * 模糊查询食物
     * @param fname
     * @return
     */
    List<Food> selectAllFood(@Param(value="fname")     String fname);
}