package com.springboot.mybatis.plus.service.impl;

import com.springboot.mybatis.plus.model.TbUser;
import com.springboot.mybatis.plus.mapper.TbUserMapper;
import com.springboot.mybatis.plus.service.TbUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zrblog
 * @since 2018-10-08
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements TbUserService {

}
