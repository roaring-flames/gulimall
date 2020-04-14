package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author jin
 * @email jinliansheng@163.com
 * @date 2020-04-14 22:12:01
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
