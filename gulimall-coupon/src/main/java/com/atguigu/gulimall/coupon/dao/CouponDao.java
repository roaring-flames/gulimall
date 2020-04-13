package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author jin
 * @email jinliansheng@163.com
 * @date 2020-04-13 22:41:50
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
