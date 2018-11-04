package com.springboog.ymal;

import com.springboog.ymal.domain.Student;
import com.springboog.ymal.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
	private User user;

    @Autowired
    private Student student;

	@Test
	public void contextLoads() {
	}

     /**
      * @Description: 测试 获取application.yml文件中的属性
      * @Date: 2018/10/9 23:22
      * @Author: zr
      * @param null
      * @Return
      */
	@Test
	public void testApplicationFileAttribute() {
        System.out.println(user.getTostring());
    }

     /**
      * @Description: 测试 获取指定文件中的属性
      * @Date: 2018/10/9 23:25
      * @Author: zr
      * @param null
      * @Return 
      */
    @Test
    public void testTargetFileAttribute() {
        System.out.println("testTargetFileAttribute:"+student.getToString());
    }

}
