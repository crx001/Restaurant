package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.restaurant.mapper.FoodMapper;
import com.restaurant.mapper.UserMapper;
import com.restaurant.model.Food;
import com.restaurant.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring/spring-mybatis.xml" })
public class MapperTest {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private FoodMapper foodMapper;

	@Test
	public void test() {
		System.out.println(userMapper);

		PageHelper.startPage(2, 10);

		List<Food> list = foodMapper.selectAllFood();
		
		
	             
		PageInfo page = new PageInfo(list);
		System.out.println(page);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));

	}
}
